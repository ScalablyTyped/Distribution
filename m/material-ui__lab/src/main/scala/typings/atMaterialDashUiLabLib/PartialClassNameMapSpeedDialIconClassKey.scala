package typings
package atMaterialDashUiLabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/SpeedDialIcon/SpeedDialIcon.SpeedDialIconClassKey>> */
trait PartialClassNameMapSpeedDialIconClassKey extends js.Object {
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var iconOpen: js.UndefOr[java.lang.String] = js.undefined
  var iconWithOpenIconOpen: js.UndefOr[java.lang.String] = js.undefined
  var openIcon: js.UndefOr[java.lang.String] = js.undefined
  var openIconOpen: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapSpeedDialIconClassKey {
  @scala.inline
  def apply(
    icon: java.lang.String = null,
    iconOpen: java.lang.String = null,
    iconWithOpenIconOpen: java.lang.String = null,
    openIcon: java.lang.String = null,
    openIconOpen: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapSpeedDialIconClassKey = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconOpen != null) __obj.updateDynamic("iconOpen")(iconOpen)
    if (iconWithOpenIconOpen != null) __obj.updateDynamic("iconWithOpenIconOpen")(iconWithOpenIconOpen)
    if (openIcon != null) __obj.updateDynamic("openIcon")(openIcon)
    if (openIconOpen != null) __obj.updateDynamic("openIconOpen")(openIconOpen)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapSpeedDialIconClassKey]
  }
}

