package typings.kafkajs.kafkajsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerMessageContent
  extends // Other possible fields in the content, that depend on the context.
/* key */ StringDictionary[js.Any] {
  /** @var message Message sent to the logger. */
  val message: String
  /** @var timestamp Message timestamp. */
  val timestamp: Date
}

object LoggerMessageContent {
  @scala.inline
  def apply(
    message: String,
    timestamp: Date,
    StringDictionary: // Other possible fields in the content, that depend on the context.
  /* key */ StringDictionary[js.Any] = null
  ): LoggerMessageContent = {
    val __obj = js.Dynamic.literal(message = message, timestamp = timestamp)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LoggerMessageContent]
  }
}

