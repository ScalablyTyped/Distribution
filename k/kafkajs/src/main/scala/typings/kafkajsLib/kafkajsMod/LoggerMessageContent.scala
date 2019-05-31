package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerMessageContent
  extends // Other possible fields in the content, that depend on the context.
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** @var message Message sent to the logger. */
  val message: java.lang.String
  /** @var timestamp Message timestamp. */
  val timestamp: stdLib.Date
}

object LoggerMessageContent {
  @scala.inline
  def apply(
    message: java.lang.String,
    timestamp: stdLib.Date,
    StringDictionary: // Other possible fields in the content, that depend on the context.
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): LoggerMessageContent = {
    val __obj = js.Dynamic.literal(message = message, timestamp = timestamp)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LoggerMessageContent]
  }
}

