package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ExpansionPanelSummary.ExpansionPanelSummaryClassKey>> */
trait PartialStyleRulesExpansionPanelSummaryClassKey extends js.Object {
  var content: js.UndefOr[CSSProperties] = js.undefined
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var expandIcon: js.UndefOr[CSSProperties] = js.undefined
  var expanded: js.UndefOr[CSSProperties] = js.undefined
  var focused: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesExpansionPanelSummaryClassKey {
  @scala.inline
  def apply(
    content: CSSProperties = null,
    disabled: CSSProperties = null,
    expandIcon: CSSProperties = null,
    expanded: CSSProperties = null,
    focused: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesExpansionPanelSummaryClassKey = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesExpansionPanelSummaryClassKey]
  }
}

