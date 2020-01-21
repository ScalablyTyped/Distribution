package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CardActions.CardActionsClassKey>> */
@js.native
trait PartialStyleRulesCardActionsClassKey extends js.Object {
  var action: js.UndefOr[CSSProperties] = js.native
  var disableActionSpacing: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesCardActionsClassKey {
  @scala.inline
  def apply(
    action: CSSProperties = null,
    disableActionSpacing: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesCardActionsClassKey = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (disableActionSpacing != null) __obj.updateDynamic("disableActionSpacing")(disableActionSpacing.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesCardActionsClassKey]
  }
}

