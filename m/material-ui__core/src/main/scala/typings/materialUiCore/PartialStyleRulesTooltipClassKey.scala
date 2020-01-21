package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Tooltip.TooltipClassKey>> */
@js.native
trait PartialStyleRulesTooltipClassKey extends js.Object {
  var popper: js.UndefOr[CSSProperties] = js.native
  var popperInteractive: js.UndefOr[CSSProperties] = js.native
  var tooltip: js.UndefOr[CSSProperties] = js.native
  var tooltipPlacementBottom: js.UndefOr[CSSProperties] = js.native
  var tooltipPlacementLeft: js.UndefOr[CSSProperties] = js.native
  var tooltipPlacementRight: js.UndefOr[CSSProperties] = js.native
  var tooltipPlacementTop: js.UndefOr[CSSProperties] = js.native
  var touch: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTooltipClassKey {
  @scala.inline
  def apply(
    popper: CSSProperties = null,
    popperInteractive: CSSProperties = null,
    tooltip: CSSProperties = null,
    tooltipPlacementBottom: CSSProperties = null,
    tooltipPlacementLeft: CSSProperties = null,
    tooltipPlacementRight: CSSProperties = null,
    tooltipPlacementTop: CSSProperties = null,
    touch: CSSProperties = null
  ): PartialStyleRulesTooltipClassKey = {
    val __obj = js.Dynamic.literal()
    if (popper != null) __obj.updateDynamic("popper")(popper.asInstanceOf[js.Any])
    if (popperInteractive != null) __obj.updateDynamic("popperInteractive")(popperInteractive.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipPlacementBottom != null) __obj.updateDynamic("tooltipPlacementBottom")(tooltipPlacementBottom.asInstanceOf[js.Any])
    if (tooltipPlacementLeft != null) __obj.updateDynamic("tooltipPlacementLeft")(tooltipPlacementLeft.asInstanceOf[js.Any])
    if (tooltipPlacementRight != null) __obj.updateDynamic("tooltipPlacementRight")(tooltipPlacementRight.asInstanceOf[js.Any])
    if (tooltipPlacementTop != null) __obj.updateDynamic("tooltipPlacementTop")(tooltipPlacementTop.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesTooltipClassKey]
  }
}

