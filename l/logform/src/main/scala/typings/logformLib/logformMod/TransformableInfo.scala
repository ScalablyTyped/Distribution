package typings
package logformLib.logformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformableInfo
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var level: java.lang.String
  var message: java.lang.String
}

object TransformableInfo {
  @scala.inline
  def apply(
    level: java.lang.String,
    message: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): TransformableInfo = {
    val __obj = js.Dynamic.literal(level = level, message = message)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TransformableInfo]
  }
}

