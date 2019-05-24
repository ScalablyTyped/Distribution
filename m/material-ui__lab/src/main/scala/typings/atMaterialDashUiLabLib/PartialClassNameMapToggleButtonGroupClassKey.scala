package typings
package atMaterialDashUiLabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/ToggleButtonGroup/ToggleButtonGroup.ToggleButtonGroupClassKey>> */
trait PartialClassNameMapToggleButtonGroupClassKey extends js.Object {
  var root: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapToggleButtonGroupClassKey {
  @scala.inline
  def apply(root: java.lang.String = null, selected: java.lang.String = null): PartialClassNameMapToggleButtonGroupClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[PartialClassNameMapToggleButtonGroupClassKey]
  }
}

