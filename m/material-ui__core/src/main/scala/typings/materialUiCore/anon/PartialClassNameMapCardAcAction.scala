package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardActions/CardActions.CardActionsClassKey>> */
@js.native
trait PartialClassNameMapCardAcAction extends js.Object {
  var action: js.UndefOr[String] = js.native
  var disableActionSpacing: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapCardAcAction {
  @scala.inline
  def apply(action: String = null, disableActionSpacing: String = null, root: String = null): PartialClassNameMapCardAcAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (disableActionSpacing != null) __obj.updateDynamic("disableActionSpacing")(disableActionSpacing.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapCardAcAction]
  }
}

