package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tooltip/Tooltip.TooltipClassKey>> */
@js.native
trait PartialClassNameMapTooltipClassKey extends js.Object {
  var popper: js.UndefOr[String] = js.native
  var popperInteractive: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[String] = js.native
  var tooltipPlacementBottom: js.UndefOr[String] = js.native
  var tooltipPlacementLeft: js.UndefOr[String] = js.native
  var tooltipPlacementRight: js.UndefOr[String] = js.native
  var tooltipPlacementTop: js.UndefOr[String] = js.native
  var touch: js.UndefOr[String] = js.native
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
    if (popper != null) __obj.updateDynamic("popper")(popper.asInstanceOf[js.Any])
    if (popperInteractive != null) __obj.updateDynamic("popperInteractive")(popperInteractive.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipPlacementBottom != null) __obj.updateDynamic("tooltipPlacementBottom")(tooltipPlacementBottom.asInstanceOf[js.Any])
    if (tooltipPlacementLeft != null) __obj.updateDynamic("tooltipPlacementLeft")(tooltipPlacementLeft.asInstanceOf[js.Any])
    if (tooltipPlacementRight != null) __obj.updateDynamic("tooltipPlacementRight")(tooltipPlacementRight.asInstanceOf[js.Any])
    if (tooltipPlacementTop != null) __obj.updateDynamic("tooltipPlacementTop")(tooltipPlacementTop.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapTooltipClassKey]
  }
}

