package typings.atMaterialDashUiCore.stylesMuiThemeProviderMod

import typings.jss.jssMod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetManagerTheme extends js.Object {
  var refs: Double
  var sheet: StyleSheet[String]
}

object SheetManagerTheme {
  @scala.inline
  def apply(refs: Double, sheet: StyleSheet[String]): SheetManagerTheme = {
    val __obj = js.Dynamic.literal(refs = refs.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SheetManagerTheme]
  }
}

