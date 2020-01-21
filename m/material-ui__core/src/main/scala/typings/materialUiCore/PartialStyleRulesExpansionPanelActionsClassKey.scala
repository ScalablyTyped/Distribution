package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ExpansionPanelActions.ExpansionPanelActionsClassKey>> */
@js.native
trait PartialStyleRulesExpansionPanelActionsClassKey extends js.Object {
  var action: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
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

