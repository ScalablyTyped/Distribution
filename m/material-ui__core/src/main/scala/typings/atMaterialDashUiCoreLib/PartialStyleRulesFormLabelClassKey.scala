package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormLabel.FormLabelClassKey>> */
trait PartialStyleRulesFormLabelClassKey extends js.Object {
  var asterisk: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var disabled: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var error: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var filled: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var focused: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var required: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesFormLabelClassKey {
  @scala.inline
  def apply(
    asterisk: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    disabled: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    error: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    filled: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    focused: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    required: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
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

