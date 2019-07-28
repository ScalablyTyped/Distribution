package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/InputLabel/InputLabel.InputLabelClassKey>> */
trait PartialClassNameMapInputLabelClassKey extends js.Object {
  var animated: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var filled: js.UndefOr[String] = js.undefined
  var focused: js.UndefOr[String] = js.undefined
  var formControl: js.UndefOr[String] = js.undefined
  var marginDense: js.UndefOr[String] = js.undefined
  var outlined: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var shrink: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapInputLabelClassKey {
  @scala.inline
  def apply(
    animated: String = null,
    disabled: String = null,
    error: String = null,
    filled: String = null,
    focused: String = null,
    formControl: String = null,
    marginDense: String = null,
    outlined: String = null,
    required: String = null,
    root: String = null,
    shrink: String = null
  ): PartialClassNameMapInputLabelClassKey = {
    val __obj = js.Dynamic.literal()
    if (animated != null) __obj.updateDynamic("animated")(animated)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error)
    if (filled != null) __obj.updateDynamic("filled")(filled)
    if (focused != null) __obj.updateDynamic("focused")(focused)
    if (formControl != null) __obj.updateDynamic("formControl")(formControl)
    if (marginDense != null) __obj.updateDynamic("marginDense")(marginDense)
    if (outlined != null) __obj.updateDynamic("outlined")(outlined)
    if (required != null) __obj.updateDynamic("required")(required)
    if (root != null) __obj.updateDynamic("root")(root)
    if (shrink != null) __obj.updateDynamic("shrink")(shrink)
    __obj.asInstanceOf[PartialClassNameMapInputLabelClassKey]
  }
}

