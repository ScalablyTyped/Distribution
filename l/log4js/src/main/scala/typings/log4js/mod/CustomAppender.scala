package typings.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAppender
  extends /* key */ StringDictionary[js.Any]
     with Appender {
  var `type`: String | AppenderModule
}

object CustomAppender {
  @scala.inline
  def apply(`type`: String | AppenderModule, StringDictionary: /* key */ StringDictionary[js.Any] = null): CustomAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CustomAppender]
  }
}

