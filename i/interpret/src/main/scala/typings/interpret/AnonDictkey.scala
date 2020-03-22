package typings.interpret

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var extension: String
}

object AnonDictkey {
  @scala.inline
  def apply(extension: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonDictkey = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictkey]
  }
}

