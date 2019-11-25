package typings.atMaterialDashUiLab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/SpeedDialAction/SpeedDialAction.SpeedDialActionClassKey>> */
trait PartialClassNameMapSpeedDialActionClassKey extends js.Object {
  var fab: js.UndefOr[String] = js.undefined
  var fabClosed: js.UndefOr[String] = js.undefined
  var staticTooltip: js.UndefOr[String] = js.undefined
  var staticTooltipClosed: js.UndefOr[String] = js.undefined
  var staticTooltipLabel: js.UndefOr[String] = js.undefined
  var tooltipPlacementLeft: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapSpeedDialActionClassKey {
  @scala.inline
  def apply(
    fab: String = null,
    fabClosed: String = null,
    staticTooltip: String = null,
    staticTooltipClosed: String = null,
    staticTooltipLabel: String = null,
    tooltipPlacementLeft: String = null
  ): PartialClassNameMapSpeedDialActionClassKey = {
    val __obj = js.Dynamic.literal()
    if (fab != null) __obj.updateDynamic("fab")(fab.asInstanceOf[js.Any])
    if (fabClosed != null) __obj.updateDynamic("fabClosed")(fabClosed.asInstanceOf[js.Any])
    if (staticTooltip != null) __obj.updateDynamic("staticTooltip")(staticTooltip.asInstanceOf[js.Any])
    if (staticTooltipClosed != null) __obj.updateDynamic("staticTooltipClosed")(staticTooltipClosed.asInstanceOf[js.Any])
    if (staticTooltipLabel != null) __obj.updateDynamic("staticTooltipLabel")(staticTooltipLabel.asInstanceOf[js.Any])
    if (tooltipPlacementLeft != null) __obj.updateDynamic("tooltipPlacementLeft")(tooltipPlacementLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapSpeedDialActionClassKey]
  }
}

