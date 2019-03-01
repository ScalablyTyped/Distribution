package typings
package atMaterialDashUiCoreLib.stylesMuiThemeProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetManagerTheme extends js.Object {
  var refs: scala.Double
  var sheet: jssLib.jssMod.StyleSheet[_]
}

object SheetManagerTheme {
  @scala.inline
  def apply(refs: scala.Double, sheet: jssLib.jssMod.StyleSheet[_]): SheetManagerTheme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("refs")(refs)
    __obj.updateDynamic("sheet")(sheet)
    __obj.asInstanceOf[SheetManagerTheme]
  }
}

