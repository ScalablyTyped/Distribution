package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ExpansionPanelActions/ExpansionPanelActions.ExpansionPanelActionsClassKey>> */
trait PartialClassNameMapExpansionPanelActionsClassKey extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapExpansionPanelActionsClassKey {
  @scala.inline
  def apply(action: String = null, root: String = null): PartialClassNameMapExpansionPanelActionsClassKey = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapExpansionPanelActionsClassKey]
  }
}

