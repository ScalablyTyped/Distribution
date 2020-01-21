package typings.interpret

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtension
  extends /* key */ StringDictionary[js.Any] {
  var extension: String
}

object AnonExtension {
  @scala.inline
  def apply(extension: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonExtension = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonExtension]
  }
}

