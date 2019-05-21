package typings
package graphqlDashComposeLib.libUtilsDefinitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extensions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var directives: js.UndefOr[js.Array[ExtensionsDirective]] = js.undefined
}

object Extensions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    directives: js.Array[ExtensionsDirective] = null
  ): Extensions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    __obj.asInstanceOf[Extensions]
  }
}

