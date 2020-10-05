package typings.materialUiCore.muiThemeProviderMod

import typings.jss.mod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  @scala.inline
  implicit class SheetManagerThemeOps[Self <: SheetManagerTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRefs(value: Double): Self = this.set("refs", value.asInstanceOf[js.Any])
    @scala.inline
    def setSheet(value: StyleSheet[String | Double | js.Symbol]): Self = this.set("sheet", value.asInstanceOf[js.Any])
  }
  
}

