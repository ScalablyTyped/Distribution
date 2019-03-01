package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAppender
  extends Appender
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var `type`: java.lang.String
}

object CustomAppender {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): CustomAppender = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CustomAppender]
  }
}

