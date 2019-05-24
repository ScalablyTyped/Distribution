package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/DialogActions/DialogActions.DialogActionsClassKey>> */
trait PartialClassNameMapDialogActionsClassKey extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapDialogActionsClassKey {
  @scala.inline
  def apply(action: java.lang.String = null, root: java.lang.String = null): PartialClassNameMapDialogActionsClassKey = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapDialogActionsClassKey]
  }
}

