package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/FormHelperText/FormHelperText.FormHelperTextClassKey>> */
trait PartialClassNameMapFormHelperTextClassKey extends js.Object {
  var contained: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var filled: js.UndefOr[String] = js.undefined
  var focused: js.UndefOr[String] = js.undefined
  var marginDense: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapFormHelperTextClassKey {
  @scala.inline
  def apply(
    contained: String = null,
    disabled: String = null,
    error: String = null,
    filled: String = null,
    focused: String = null,
    marginDense: String = null,
    required: String = null,
    root: String = null
  ): PartialClassNameMapFormHelperTextClassKey = {
    val __obj = js.Dynamic.literal()
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error)
    if (filled != null) __obj.updateDynamic("filled")(filled)
    if (focused != null) __obj.updateDynamic("focused")(focused)
    if (marginDense != null) __obj.updateDynamic("marginDense")(marginDense)
    if (required != null) __obj.updateDynamic("required")(required)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapFormHelperTextClassKey]
  }
}

