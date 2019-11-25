package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/InputLabel.InputLabelClassKey>> */
trait PartialStyleRulesInputLabelClassKey extends js.Object {
  var animated: js.UndefOr[CSSProperties] = js.undefined
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var error: js.UndefOr[CSSProperties] = js.undefined
  var filled: js.UndefOr[CSSProperties] = js.undefined
  var focused: js.UndefOr[CSSProperties] = js.undefined
  var formControl: js.UndefOr[CSSProperties] = js.undefined
  var marginDense: js.UndefOr[CSSProperties] = js.undefined
  var outlined: js.UndefOr[CSSProperties] = js.undefined
  var required: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var shrink: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesInputLabelClassKey {
  @scala.inline
  def apply(
    animated: CSSProperties = null,
    disabled: CSSProperties = null,
    error: CSSProperties = null,
    filled: CSSProperties = null,
    focused: CSSProperties = null,
    formControl: CSSProperties = null,
    marginDense: CSSProperties = null,
    outlined: CSSProperties = null,
    required: CSSProperties = null,
    root: CSSProperties = null,
    shrink: CSSProperties = null
  ): PartialStyleRulesInputLabelClassKey = {
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
    __obj.asInstanceOf[PartialStyleRulesInputLabelClassKey]
  }
}

