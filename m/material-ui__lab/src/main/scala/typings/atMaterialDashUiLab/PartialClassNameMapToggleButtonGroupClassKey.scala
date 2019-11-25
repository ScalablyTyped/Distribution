package typings.atMaterialDashUiLab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/ToggleButtonGroup/ToggleButtonGroup.ToggleButtonGroupClassKey>> */
trait PartialClassNameMapToggleButtonGroupClassKey extends js.Object {
  var grouped: js.UndefOr[String] = js.undefined
  var groupedSizeLarge: js.UndefOr[String] = js.undefined
  var groupedSizeSmall: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapToggleButtonGroupClassKey {
  @scala.inline
  def apply(
    grouped: String = null,
    groupedSizeLarge: String = null,
    groupedSizeSmall: String = null,
    root: String = null
  ): PartialClassNameMapToggleButtonGroupClassKey = {
    val __obj = js.Dynamic.literal()
    if (grouped != null) __obj.updateDynamic("grouped")(grouped.asInstanceOf[js.Any])
    if (groupedSizeLarge != null) __obj.updateDynamic("groupedSizeLarge")(groupedSizeLarge.asInstanceOf[js.Any])
    if (groupedSizeSmall != null) __obj.updateDynamic("groupedSizeSmall")(groupedSizeSmall.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapToggleButtonGroupClassKey]
  }
}

