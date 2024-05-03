package app.biiscuit.emojifyreleasevariantissue

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import io.wax911.emojify.EmojiManager
import io.wax911.emojify.parser.parseToUnicode
import io.wax911.emojify.serializer.moshi.MoshiDeserializer

class MainActivity: AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView: TextView = findViewById(R.id.textview)
        val emojiManager = EmojiManager.create(this, MoshiDeserializer())
        textView.text = emojiManager.parseToUnicode("Hello world! :sweat_smile:")
    }
}
