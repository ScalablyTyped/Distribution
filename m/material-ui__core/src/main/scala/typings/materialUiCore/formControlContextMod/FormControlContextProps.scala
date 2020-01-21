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
    onFocus: () => Unit,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    margin: Margin = null,
    required: js.UndefOr[Boolean] = js.undefined,
    variant: standard | outlined | filled = null
  ): FormControlContextProps = {
    val __obj = js.Dynamic.literal(adornedStart = adornedStart.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onEmpty = js.Any.fromFunction0(onEmpty), onFilled = js.Any.fromFunction0(onFilled), onFocus = js.Any.fromFunction0(onFocus))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlContextProps]
  }
}

