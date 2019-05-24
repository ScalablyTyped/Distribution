package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ExpansionPanel.ExpansionPanelClassKey>> */
trait PartialStyleRulesExpansionPanelClassKey extends js.Object {
  var disabled: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var expanded: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var rounded: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesExpansionPanelClassKey {
  @scala.inline
  def apply(
    disabled: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    expanded: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    rounded: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
  ): PartialStyleRulesExpansionPanelClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded)
    if (root != null) __obj.updateDynamic("root")(root)
    if (rounded != null) __obj.updateDynamic("rounded")(rounded)
    __obj.asInstanceOf[PartialStyleRulesExpansionPanelClassKey]
  }
}

