package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tooltip/Tooltip.TooltipClassKey>> */
trait PartialClassNameMapTooltipClassKey extends js.Object {
  var popper: js.UndefOr[String] = js.undefined
  var popperInteractive: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
  var tooltipPlacementBottom: js.UndefOr[String] = js.undefined
  var tooltipPlacementLeft: js.UndefOr[String] = js.undefined
  var tooltipPlacementRight: js.UndefOr[String] = js.undefined
  var tooltipPlacementTop: js.UndefOr[String] = js.undefined
  var touch: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapTooltipClassKey {
  @scala.inline
  def apply(
    popper: String = null,
    popperInteractive: String = null,
    tooltip: String = null,
    tooltipPlacementBottom: String = null,
    tooltipPlacementLeft: String = null,
    tooltipPlacementRight: String = null,
    tooltipPlacementTop: String = null,
    touch: String = null
  ): PartialClassNameMapTooltipClassKey = {
    val __obj = js.Dynamic.literal()
    if (popper != null) __obj.updateDynamic("popper")(popper)
    if (popperInteractive != null) __obj.updateDynamic("popperInteractive")(popperInteractive)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipPlacementBottom != null) __obj.updateDynamic("tooltipPlacementBottom")(tooltipPlacementBottom)
    if (tooltipPlacementLeft != null) __obj.updateDynamic("tooltipPlacementLeft")(tooltipPlacementLeft)
    if (tooltipPlacementRight != null) __obj.updateDynamic("tooltipPlacementRight")(tooltipPlacementRight)
    if (tooltipPlacementTop != null) __obj.updateDynamic("tooltipPlacementTop")(tooltipPlacementTop)
    if (touch != null) __obj.updateDynamic("touch")(touch)
    __obj.asInstanceOf[PartialClassNameMapTooltipClassKey]
  }
}

