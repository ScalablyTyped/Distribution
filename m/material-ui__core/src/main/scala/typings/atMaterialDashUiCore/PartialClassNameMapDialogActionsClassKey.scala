package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/DialogActions/DialogActions.DialogActionsClassKey>> */
trait PartialClassNameMapDialogActionsClassKey extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapDialogActionsClassKey {
  @scala.inline
  def apply(action: String = null, root: String = null): PartialClassNameMapDialogActionsClassKey = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapDialogActionsClassKey]
  }
}

