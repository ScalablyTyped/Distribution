package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/OutlinedInput.OutlinedInputClassKey>> */
@js.native
trait PartialStyleRulesOutlined extends js.Object {
  var adornedEnd: js.UndefOr[CSSProperties] = js.native
  var adornedStart: js.UndefOr[CSSProperties] = js.native
  var disabled: js.UndefOr[CSSProperties] = js.native
  var error: js.UndefOr[CSSProperties] = js.native
  var focused: js.UndefOr[CSSProperties] = js.native
  var input: js.UndefOr[CSSProperties] = js.native
  var inputAdornedEnd: js.UndefOr[CSSProperties] = js.native
  var inputAdornedStart: js.UndefOr[CSSProperties] = js.native
  var inputMarginDense: js.UndefOr[CSSProperties] = js.native
  var inputMultiline: js.UndefOr[CSSProperties] = js.native
  var multiline: js.UndefOr[CSSProperties] = js.native
  var notchedOutline: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesOutlined {
  @scala.inline
  def apply(): PartialStyleRulesOutlined = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesOutlined]
  }
  @scala.inline
  implicit class PartialStyleRulesOutlinedOps[Self <: PartialStyleRulesOutlined] (val x: Self) extends AnyVal {
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
    def setAdornedEnd(value: CSSProperties): Self = this.set("adornedEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdornedEnd: Self = this.set("adornedEnd", js.undefined)
    @scala.inline
    def setAdornedStart(value: CSSProperties): Self = this.set("adornedStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdornedStart: Self = this.set("adornedStart", js.undefined)
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
    def setInput(value: CSSProperties): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setInputAdornedEnd(value: CSSProperties): Self = this.set("inputAdornedEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputAdornedEnd: Self = this.set("inputAdornedEnd", js.undefined)
    @scala.inline
    def setInputAdornedStart(value: CSSProperties): Self = this.set("inputAdornedStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputAdornedStart: Self = this.set("inputAdornedStart", js.undefined)
    @scala.inline
    def setInputMarginDense(value: CSSProperties): Self = this.set("inputMarginDense", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMarginDense: Self = this.set("inputMarginDense", js.undefined)
    @scala.inline
    def setInputMultiline(value: CSSProperties): Self = this.set("inputMultiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMultiline: Self = this.set("inputMultiline", js.undefined)
    @scala.inline
    def setMultiline(value: CSSProperties): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    @scala.inline
    def setNotchedOutline(value: CSSProperties): Self = this.set("notchedOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotchedOutline: Self = this.set("notchedOutline", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

