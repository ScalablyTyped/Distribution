package typings
package interpretLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extension
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var extension: java.lang.String
}

object Anon_Extension {
  @scala.inline
  def apply(
    extension: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Extension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extension")(extension)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Extension]
  }
}

