package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/OutlinedInput.OutlinedInputClassKey>> */
@js.native
trait PartialStyleRulesOutlinedInputClassKey extends js.Object {
  var adornedEnd: js.UndefOr[CSSProperties] = js.native
  var adornedStart: js.UndefOr[CSSProperties] = js.native
  var disabled: js.UndefOr[CSSProperties] = js.native
  var error: js.UndefOr[CSSProperties] = js.native
  var focused: js.UndefOr[CSSProperties] = js.native
  var input: js.UndefOr[CSSProperties] = js.native
  var inputAdornedEnd: js.UndefOr[CSSProperties] = js.native
  var inputAdornedStart: js.UndefOr[CSSProperties] = js.native
  var inputMarginDense: js.UndefOr[CSSProperties] = js.native
  var inputMultiline: js.UndefOr[CSSProperties] = js.native
  var multiline: js.UndefOr[CSSProperties] = js.native
  var notchedOutline: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
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
    if (notchedOutline != null) __obj.updateDynamic("notchedOutline")(notchedOutline.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesOutlinedInputClassKey]
  }
}

