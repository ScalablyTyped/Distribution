package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormControlLabel.FormControlLabelClassKey>> */
trait PartialStyleRulesFormControlLabelClassKey extends js.Object {
  var disabled: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var label: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var start: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesFormControlLabelClassKey {
  @scala.inline
  def apply(
    disabled: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    label: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    start: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
  ): PartialStyleRulesFormControlLabelClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (label != null) __obj.updateDynamic("label")(label)
    if (root != null) __obj.updateDynamic("root")(root)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[PartialStyleRulesFormControlLabelClassKey]
  }
}

