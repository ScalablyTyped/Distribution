package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/OutlinedInput.OutlinedInputClassKey>> */
trait PartialStyleRulesOutlinedInputClassKey extends js.Object {
  var adornedEnd: js.UndefOr[CSSProperties] = js.undefined
  var adornedStart: js.UndefOr[CSSProperties] = js.undefined
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var error: js.UndefOr[CSSProperties] = js.undefined
  var focused: js.UndefOr[CSSProperties] = js.undefined
  var input: js.UndefOr[CSSProperties] = js.undefined
  var inputAdornedEnd: js.UndefOr[CSSProperties] = js.undefined
  var inputAdornedStart: js.UndefOr[CSSProperties] = js.undefined
  var inputMarginDense: js.UndefOr[CSSProperties] = js.undefined
  var inputMultiline: js.UndefOr[CSSProperties] = js.undefined
  var multiline: js.UndefOr[CSSProperties] = js.undefined
  var notchedOutline: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesOutlinedInputClassKey {
  @scala.inline
  def apply(
    adornedEnd: CSSProperties = null,
    adornedStart: CSSProperties = null,
    disabled: CSSProperties = null,
    error: CSSProperties = null,
    focused: CSSProperties = null,
    input: CSSProperties = null,
    inputAdornedEnd: CSSProperties = null,
    inputAdornedStart: CSSProperties = null,
    inputMarginDense: CSSProperties = null,
    inputMultiline: CSSProperties = null,
    multiline: CSSProperties = null,
    notchedOutline: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesOutlinedInputClassKey = {
    val __obj = js.Dynamic.literal()
    if (adornedEnd != null) __obj.updateDynamic("adornedEnd")(adornedEnd)
    if (adornedStart != null) __obj.updateDynamic("adornedStart")(adornedStart)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error)
    if (focused != null) __obj.updateDynamic("focused")(focused)
    if (input != null) __obj.updateDynamic("input")(input)
    if (inputAdornedEnd != null) __obj.updateDynamic("inputAdornedEnd")(inputAdornedEnd)
    if (inputAdornedStart != null) __obj.updateDynamic("inputAdornedStart")(inputAdornedStart)
    if (inputMarginDense != null) __obj.updateDynamic("inputMarginDense")(inputMarginDense)
    if (inputMultiline != null) __obj.updateDynamic("inputMultiline")(inputMultiline)
    if (multiline != null) __obj.updateDynamic("multiline")(multiline)
    if (notchedOutline != null) __obj.updateDynamic("notchedOutline")(notchedOutline)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesOutlinedInputClassKey]
  }
}

