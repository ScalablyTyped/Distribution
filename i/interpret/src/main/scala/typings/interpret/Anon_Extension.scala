package typings.interpret

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extension
  extends /* key */ StringDictionary[js.Any] {
  var extension: String
}

object Anon_Extension {
  @scala.inline
  def apply(extension: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): Anon_Extension = {
    val __obj = js.Dynamic.literal(extension = extension)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Extension]
  }
}

