package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/FilledInput/FilledInput.FilledInputClassKey>> */
@js.native
trait PartialClassNameMapFilledInputClassKey extends js.Object {
  var adornedEnd: js.UndefOr[String] = js.native
  var adornedStart: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var focused: js.UndefOr[String] = js.native
  var input: js.UndefOr[String] = js.native
  var inputAdornedEnd: js.UndefOr[String] = js.native
  var inputAdornedStart: js.UndefOr[String] = js.native
  var inputMarginDense: js.UndefOr[String] = js.native
  var inputMultiline: js.UndefOr[String] = js.native
  var multiline: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var underline: js.UndefOr[String] = js.native
}

object PartialClassNameMapFilledInputClassKey {
  @scala.inline
  def apply(
    adornedEnd: String = null,
    adornedStart: String = null,
    disabled: String = null,
    error: String = null,
    focused: String = null,
    input: String = null,
    inputAdornedEnd: String = null,
    inputAdornedStart: String = null,
    inputMarginDense: String = null,
    inputMultiline: String = null,
    multiline: String = null,
    root: String = null,
    underline: String = null
  ): PartialClassNameMapFilledInputClassKey = {
    val __obj = js.Dynamic.literal()
    if (adornedEnd != null) __obj.updateDynamic("adornedEnd")(adornedEnd.asInstanceOf[js.Any])
    if (adornedStart != null) __obj.updateDynamic("adornedStart")(adornedStart.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputAdornedEnd != null) __obj.updateDynamic("inputAdornedEnd")(inputAdornedEnd.asInstanceOf[js.Any])
    if (inputAdornedStart != null) __obj.updateDynamic("inputAdornedStart")(inputAdornedStart.asInstanceOf[js.Any])
    if (inputMarginDense != null) __obj.updateDynamic("inputMarginDense")(inputMarginDense.asInstanceOf[js.Any])
    if (inputMultiline != null) __obj.updateDynamic("inputMultiline")(inputMultiline.asInstanceOf[js.Any])
    if (multiline != null) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapFilledInputClassKey]
  }
}

