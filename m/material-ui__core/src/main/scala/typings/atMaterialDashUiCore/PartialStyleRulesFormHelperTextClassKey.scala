package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormHelperText.FormHelperTextClassKey>> */
trait PartialStyleRulesFormHelperTextClassKey extends js.Object {
  var contained: js.UndefOr[CSSProperties] = js.undefined
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var error: js.UndefOr[CSSProperties] = js.undefined
  var filled: js.UndefOr[CSSProperties] = js.undefined
  var focused: js.UndefOr[CSSProperties] = js.undefined
  var marginDense: js.UndefOr[CSSProperties] = js.undefined
  var required: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesFormHelperTextClassKey {
  @scala.inline
  def apply(
    contained: CSSProperties = null,
    disabled: CSSProperties = null,
    error: CSSProperties = null,
    filled: CSSProperties = null,
    focused: CSSProperties = null,
    marginDense: CSSProperties = null,
    required: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesFormHelperTextClassKey = {
    val __obj = js.Dynamic.literal()
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error)
    if (filled != null) __obj.updateDynamic("filled")(filled)
    if (focused != null) __obj.updateDynamic("focused")(focused)
    if (marginDense != null) __obj.updateDynamic("marginDense")(marginDense)
    if (required != null) __obj.updateDynamic("required")(required)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesFormHelperTextClassKey]
  }
}

