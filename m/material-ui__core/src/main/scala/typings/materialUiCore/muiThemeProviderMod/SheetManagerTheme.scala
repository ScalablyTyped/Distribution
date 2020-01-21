package typings.materialUiCore.muiThemeProviderMod

import typings.jss.mod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetManagerTheme extends js.Object {
  var refs: Double = js.native
  var sheet: StyleSheet[String | Double | js.Symbol] = js.native
}

object SheetManagerTheme {
  @scala.inline
  def apply(refs: Double, sheet: StyleSheet[String | Double | js.Symbol]): SheetManagerTheme = {
    val __obj = js.Dynamic.literal(refs = refs.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SheetManagerTheme]
  }
}

