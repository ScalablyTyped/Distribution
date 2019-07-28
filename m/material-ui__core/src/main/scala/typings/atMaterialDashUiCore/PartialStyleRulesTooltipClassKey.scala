package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Tooltip.TooltipClassKey>> */
trait PartialStyleRulesTooltipClassKey extends js.Object {
  var popper: js.UndefOr[CSSProperties] = js.undefined
  var popperInteractive: js.UndefOr[CSSProperties] = js.undefined
  var tooltip: js.UndefOr[CSSProperties] = js.undefined
  var tooltipPlacementBottom: js.UndefOr[CSSProperties] = js.undefined
  var tooltipPlacementLeft: js.UndefOr[CSSProperties] = js.undefined
  var tooltipPlacementRight: js.UndefOr[CSSProperties] = js.undefined
  var tooltipPlacementTop: js.UndefOr[CSSProperties] = js.undefined
  var touch: js.UndefOr[CSSProperties] = js.undefined
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
    if (popper != null) __obj.updateDynamic("popper")(popper)
    if (popperInteractive != null) __obj.updateDynamic("popperInteractive")(popperInteractive)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipPlacementBottom != null) __obj.updateDynamic("tooltipPlacementBottom")(tooltipPlacementBottom)
    if (tooltipPlacementLeft != null) __obj.updateDynamic("tooltipPlacementLeft")(tooltipPlacementLeft)
    if (tooltipPlacementRight != null) __obj.updateDynamic("tooltipPlacementRight")(tooltipPlacementRight)
    if (tooltipPlacementTop != null) __obj.updateDynamic("tooltipPlacementTop")(tooltipPlacementTop)
    if (touch != null) __obj.updateDynamic("touch")(touch)
    __obj.asInstanceOf[PartialStyleRulesTooltipClassKey]
  }
}

