package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAppender
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]
     with Appender {
  var `type`: java.lang.String | AppenderModule
}

object CustomAppender {
  @scala.inline
  def apply(
    `type`: java.lang.String | AppenderModule,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): CustomAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CustomAppender]
  }
}

