package typings.atMaterialDashUiLab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/SpeedDialIcon/SpeedDialIcon.SpeedDialIconClassKey>> */
trait PartialClassNameMapSpeedDialIconClassKey extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
  var iconOpen: js.UndefOr[String] = js.undefined
  var iconWithOpenIconOpen: js.UndefOr[String] = js.undefined
  var openIcon: js.UndefOr[String] = js.undefined
  var openIconOpen: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapSpeedDialIconClassKey {
  @scala.inline
  def apply(
    icon: String = null,
    iconOpen: String = null,
    iconWithOpenIconOpen: String = null,
    openIcon: String = null,
    openIconOpen: String = null,
    root: String = null
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

