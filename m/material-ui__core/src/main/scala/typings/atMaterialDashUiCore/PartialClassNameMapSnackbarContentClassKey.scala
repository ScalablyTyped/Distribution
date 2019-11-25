package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/SnackbarContent/SnackbarContent.SnackbarContentClassKey>> */
trait PartialClassNameMapSnackbarContentClassKey extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapSnackbarContentClassKey {
  @scala.inline
  def apply(action: String = null, message: String = null, root: String = null): PartialClassNameMapSnackbarContentClassKey = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapSnackbarContentClassKey]
  }
}

