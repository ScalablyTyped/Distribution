package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardActions/CardActions.CardActionsClassKey>> */
trait PartialClassNameMapCardActionsClassKey extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var disableActionSpacing: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapCardActionsClassKey {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    disableActionSpacing: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapCardActionsClassKey = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (disableActionSpacing != null) __obj.updateDynamic("disableActionSpacing")(disableActionSpacing)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapCardActionsClassKey]
  }
}

