package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Input.InputClassKey>> */
@js.native
trait PartialStyleRulesInputCla extends js.Object {
  var disabled: js.UndefOr[CSSProperties] = js.native
  var error: js.UndefOr[CSSProperties] = js.native
  var focused: js.UndefOr[CSSProperties] = js.native
  var formControl: js.UndefOr[CSSProperties] = js.native
  var fullWidth: js.UndefOr[CSSProperties] = js.native
  var input: js.UndefOr[CSSProperties] = js.native
  var inputMarginDense: js.UndefOr[CSSProperties] = js.native
  var inputMultiline: js.UndefOr[CSSProperties] = js.native
  var inputType: js.UndefOr[CSSProperties] = js.native
  var inputTypeSearch: js.UndefOr[CSSProperties] = js.native
  var multiline: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var underline: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesInputCla {
  @scala.inline
  def apply(): PartialStyleRulesInputCla = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesInputCla]
  }
  @scala.inline
  implicit class PartialStyleRulesInputClaOps[Self <: PartialStyleRulesInputCla] (val x: Self) extends AnyVal {
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
    def setDisabled(value: CSSProperties): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setError(value: CSSProperties): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFocused(value: CSSProperties): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setFormControl(value: CSSProperties): Self = this.set("formControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormControl: Self = this.set("formControl", js.undefined)
    @scala.inline
    def setFullWidth(value: CSSProperties): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setInput(value: CSSProperties): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setInputMarginDense(value: CSSProperties): Self = this.set("inputMarginDense", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMarginDense: Self = this.set("inputMarginDense", js.undefined)
    @scala.inline
    def setInputMultiline(value: CSSProperties): Self = this.set("inputMultiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMultiline: Self = this.set("inputMultiline", js.undefined)
    @scala.inline
    def setInputType(value: CSSProperties): Self = this.set("inputType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputType: Self = this.set("inputType", js.undefined)
    @scala.inline
    def setInputTypeSearch(value: CSSProperties): Self = this.set("inputTypeSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputTypeSearch: Self = this.set("inputTypeSearch", js.undefined)
    @scala.inline
    def setMultiline(value: CSSProperties): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setUnderline(value: CSSProperties): Self = this.set("underline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
  
}

