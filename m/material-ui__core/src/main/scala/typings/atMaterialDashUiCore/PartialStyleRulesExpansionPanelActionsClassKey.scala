package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ExpansionPanelActions.ExpansionPanelActionsClassKey>> */
trait PartialStyleRulesExpansionPanelActionsClassKey extends js.Object {
  var action: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesExpansionPanelActionsClassKey {
  @scala.inline
  def apply(action: CSSProperties = null, root: CSSProperties = null): PartialStyleRulesExpansionPanelActionsClassKey = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesExpansionPanelActionsClassKey]
  }
}

