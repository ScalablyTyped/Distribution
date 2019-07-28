package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormLabel.FormLabelClassKey>> */
trait PartialStyleRulesFormLabelClassKey extends js.Object {
  var asterisk: js.UndefOr[CSSProperties] = js.undefined
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var error: js.UndefOr[CSSProperties] = js.undefined
  var filled: js.UndefOr[CSSProperties] = js.undefined
  var focused: js.UndefOr[CSSProperties] = js.undefined
  var required: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesFormLabelClassKey {
  @scala.inline
  def apply(
    asterisk: CSSProperties = null,
    disabled: CSSProperties = null,
    error: CSSProperties = null,
    filled: CSSProperties = null,
    focused: CSSProperties = null,
    required: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesFormLabelClassKey = {
    val __obj = js.Dynamic.literal()
    if (asterisk != null) __obj.updateDynamic("asterisk")(asterisk)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error)
    if (filled != null) __obj.updateDynamic("filled")(filled)
    if (focused != null) __obj.updateDynamic("focused")(focused)
    if (required != null) __obj.updateDynamic("required")(required)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesFormLabelClassKey]
  }
}

