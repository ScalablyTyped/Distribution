package typings.atMaterialDashUiCore.stylesMuiThemeProviderMod

import typings.jss.jssMod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetManagerTheme extends js.Object {
  var refs: Double
  var sheet: StyleSheet[_]
}

object SheetManagerTheme {
  @scala.inline
  def apply(refs: Double, sheet: StyleSheet[_]): SheetManagerTheme = {
    val __obj = js.Dynamic.literal(refs = refs, sheet = sheet)
  
    __obj.asInstanceOf[SheetManagerTheme]
  }
}

