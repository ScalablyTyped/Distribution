package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Input/Input.InputClassKey>> */
@js.native
trait PartialClassNameMapInputClassKey extends js.Object {
  var disabled: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var focused: js.UndefOr[String] = js.native
  var formControl: js.UndefOr[String] = js.native
  var fullWidth: js.UndefOr[String] = js.native
  var input: js.UndefOr[String] = js.native
  var inputMarginDense: js.UndefOr[String] = js.native
  var inputMultiline: js.UndefOr[String] = js.native
  var inputType: js.UndefOr[String] = js.native
  var inputTypeSearch: js.UndefOr[String] = js.native
  var multiline: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var underline: js.UndefOr[String] = js.native
}

object PartialClassNameMapInputClassKey {
  @scala.inline
  def apply(
    disabled: String = null,
    error: String = null,
    focused: String = null,
    formControl: String = null,
    fullWidth: String = null,
    input: String = null,
    inputMarginDense: String = null,
    inputMultiline: String = null,
    inputType: String = null,
    inputTypeSearch: String = null,
    multiline: String = null,
    root: String = null,
    underline: String = null
  ): PartialClassNameMapInputClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (formControl != null) __obj.updateDynamic("formControl")(formControl.asInstanceOf[js.Any])
    if (fullWidth != null) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputMarginDense != null) __obj.updateDynamic("inputMarginDense")(inputMarginDense.asInstanceOf[js.Any])
    if (inputMultiline != null) __obj.updateDynamic("inputMultiline")(inputMultiline.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (inputTypeSearch != null) __obj.updateDynamic("inputTypeSearch")(inputTypeSearch.asInstanceOf[js.Any])
    if (multiline != null) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapInputClassKey]
  }
}

