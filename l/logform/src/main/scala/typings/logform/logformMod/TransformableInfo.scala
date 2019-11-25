package typings.logform.logformMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformableInfo
  extends /* key */ StringDictionary[js.Any] {
  var level: String
  var message: String
}

object TransformableInfo {
  @scala.inline
  def apply(level: String, message: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): TransformableInfo = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TransformableInfo]
  }
}

