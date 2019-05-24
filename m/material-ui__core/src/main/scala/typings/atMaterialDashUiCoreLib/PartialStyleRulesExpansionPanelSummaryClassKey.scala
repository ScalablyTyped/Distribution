package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ExpansionPanelSummary.ExpansionPanelSummaryClassKey>> */
trait PartialStyleRulesExpansionPanelSummaryClassKey extends js.Object {
  var content: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var disabled: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var expandIcon: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var expanded: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var focused: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesExpansionPanelSummaryClassKey {
  @scala.inline
  def apply(
    content: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    disabled: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    expandIcon: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    expanded: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    focused: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
  ): PartialStyleRulesExpansionPanelSummaryClassKey = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded)
    if (focused != null) __obj.updateDynamic("focused")(focused)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesExpansionPanelSummaryClassKey]
  }
}

