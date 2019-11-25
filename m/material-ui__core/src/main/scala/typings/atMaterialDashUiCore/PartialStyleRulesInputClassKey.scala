package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Input.InputClassKey>> */
trait PartialStyleRulesInputClassKey extends js.Object {
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var error: js.UndefOr[CSSProperties] = js.undefined
  var focused: js.UndefOr[CSSProperties] = js.undefined
  var formControl: js.UndefOr[CSSProperties] = js.undefined
  var fullWidth: js.UndefOr[CSSProperties] = js.undefined
  var input: js.UndefOr[CSSProperties] = js.undefined
  var inputMarginDense: js.UndefOr[CSSProperties] = js.undefined
  var inputMultiline: js.UndefOr[CSSProperties] = js.undefined
  var inputType: js.UndefOr[CSSProperties] = js.undefined
  var inputTypeSearch: js.UndefOr[CSSProperties] = js.undefined
  var multiline: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var underline: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesInputClassKey {
  @scala.inline
  def apply(
    disabled: CSSProperties = null,
    error: CSSProperties = null,
    focused: CSSProperties = null,
    formControl: CSSProperties = null,
    fullWidth: CSSProperties = null,
    input: CSSProperties = null,
    inputMarginDense: CSSProperties = null,
    inputMultiline: CSSProperties = null,
    inputType: CSSProperties = null,
    inputTypeSearch: CSSProperties = null,
    multiline: CSSProperties = null,
    root: CSSProperties = null,
    underline: CSSProperties = null
  ): PartialStyleRulesInputClassKey = {
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
    __obj.asInstanceOf[PartialStyleRulesInputClassKey]
  }
}

