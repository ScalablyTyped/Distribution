package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/FormHelperText/FormHelperText.FormHelperTextClassKey>> */
@js.native
trait PartialClassNameMapFormHelperTextClassKey extends js.Object {
  var contained: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var filled: js.UndefOr[String] = js.native
  var focused: js.UndefOr[String] = js.native
  var marginDense: js.UndefOr[String] = js.native
  var required: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
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
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (filled != null) __obj.updateDynamic("filled")(filled.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (marginDense != null) __obj.updateDynamic("marginDense")(marginDense.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapFormHelperTextClassKey]
  }
}

