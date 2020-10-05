package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormControl.FormControlClassKey>> */
@js.native
trait PartialStyleRulesFormCont extends js.Object {
  var fullWidth: js.UndefOr[CSSProperties] = js.native
  var marginDense: js.UndefOr[CSSProperties] = js.native
  var marginNormal: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesFormCont {
  @scala.inline
  def apply(): PartialStyleRulesFormCont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesFormCont]
  }
  @scala.inline
  implicit class PartialStyleRulesFormContOps[Self <: PartialStyleRulesFormCont] (val x: Self) extends AnyVal {
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
    def setFullWidth(value: CSSProperties): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setMarginDense(value: CSSProperties): Self = this.set("marginDense", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginDense: Self = this.set("marginDense", js.undefined)
    @scala.inline
    def setMarginNormal(value: CSSProperties): Self = this.set("marginNormal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginNormal: Self = this.set("marginNormal", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

