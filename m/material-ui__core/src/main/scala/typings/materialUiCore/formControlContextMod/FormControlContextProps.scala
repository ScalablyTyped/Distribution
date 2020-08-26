package typings.materialUiCore.formControlContextMod

import typings.materialUiCore.materialUiCoreStrings.filled
import typings.materialUiCore.materialUiCoreStrings.outlined
import typings.materialUiCore.materialUiCoreStrings.standard
import typings.materialUiCore.mod.PropTypes.Margin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@material-ui/core.@material-ui/core/FormControl/FormControl.FormControlProps, @material-ui/core.@material-ui/core/FormControl/FormControlContext.ContextFromPropsKey> */
@js.native
trait FormControlContextProps extends js.Object {
  var adornedStart: Boolean = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var filled: Boolean = js.native
  var focused: Boolean = js.native
  var margin: js.UndefOr[Margin] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var variant: js.UndefOr[standard | outlined | filled] = js.native
  def onBlur(): Unit = js.native
  def onEmpty(): Unit = js.native
  def onFilled(): Unit = js.native
  def onFocus(): Unit = js.native
}

object FormControlContextProps {
  @scala.inline
  def apply(
    adornedStart: Boolean,
    filled: Boolean,
    focused: Boolean,
    onBlur: () => Unit,
    onEmpty: () => Unit,
    onFilled: () => Unit,
    onFocus: () => Unit
  ): FormControlContextProps = {
    val __obj = js.Dynamic.literal(adornedStart = adornedStart.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onEmpty = js.Any.fromFunction0(onEmpty), onFilled = js.Any.fromFunction0(onFilled), onFocus = js.Any.fromFunction0(onFocus))
    __obj.asInstanceOf[FormControlContextProps]
  }
  @scala.inline
  implicit class FormControlContextPropsOps[Self <: FormControlContextProps] (val x: Self) extends AnyVal {
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
    def setAdornedStart(value: Boolean): Self = this.set("adornedStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilled(value: Boolean): Self = this.set("filled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def setOnEmpty(value: () => Unit): Self = this.set("onEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setOnFilled(value: () => Unit): Self = this.set("onFilled", js.Any.fromFunction0(value))
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMargin(value: Margin): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setVariant(value: standard | outlined | filled): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
  
}

