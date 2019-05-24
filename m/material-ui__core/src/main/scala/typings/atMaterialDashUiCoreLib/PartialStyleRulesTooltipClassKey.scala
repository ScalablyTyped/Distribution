package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Tooltip.TooltipClassKey>> */
trait PartialStyleRulesTooltipClassKey extends js.Object {
  var popper: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var popperInteractive: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var tooltip: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var tooltipPlacementBottom: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var tooltipPlacementLeft: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var tooltipPlacementRight: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var tooltipPlacementTop: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var touch: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesTooltipClassKey {
  @scala.inline
  def apply(
    popper: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    popperInteractive: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    tooltip: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    tooltipPlacementBottom: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    tooltipPlacementLeft: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    tooltipPlacementRight: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    tooltipPlacementTop: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    touch: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
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

