package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/InputLabel/InputLabel.InputLabelClassKey>> */
@js.native
trait PartialClassNameMapInputLabelClassKey extends js.Object {
  var animated: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var filled: js.UndefOr[String] = js.native
  var focused: js.UndefOr[String] = js.native
  var formControl: js.UndefOr[String] = js.native
  var marginDense: js.UndefOr[String] = js.native
  var outlined: js.UndefOr[String] = js.native
  var required: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var shrink: js.UndefOr[String] = js.native
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
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (filled != null) __obj.updateDynamic("filled")(filled.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (formControl != null) __obj.updateDynamic("formControl")(formControl.asInstanceOf[js.Any])
    if (marginDense != null) __obj.updateDynamic("marginDense")(marginDense.asInstanceOf[js.Any])
    if (outlined != null) __obj.updateDynamic("outlined")(outlined.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapInputLabelClassKey]
  }
}

