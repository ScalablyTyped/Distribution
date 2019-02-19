package typings
package atMaterialDashUiCoreLib.tooltipTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement>, 'classes' | 'title'> ]: react.react.HTMLAttributes<react.HTMLDivElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement>, @material-ui/core.@material-ui/core/Tooltip/Tooltip.TooltipClassKey, 'title'>) */ trait TooltipProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TooltipClassKey] {
  var PopperProps: js.UndefOr[js.Object] = js.undefined
  var TransitionComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps]
  ] = js.undefined
  var TransitionProps: js.UndefOr[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps] = js.undefined
  var children: reactLib.reactMod.ReactNs.ReactElement[_]
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disableFocusListener: js.UndefOr[scala.Boolean] = js.undefined
  var disableHoverListener: js.UndefOr[scala.Boolean] = js.undefined
  var disableTouchListener: js.UndefOr[scala.Boolean] = js.undefined
  var enterDelay: js.UndefOr[scala.Double] = js.undefined
  var enterTouchDelay: js.UndefOr[scala.Double] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  var leaveDelay: js.UndefOr[scala.Double] = js.undefined
  var leaveTouchDelay: js.UndefOr[scala.Double] = js.undefined
  var onClose: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit]
  ] = js.undefined
  var onOpen: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit]
  ] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var placement: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`bottom-end` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`bottom-start` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.bottom | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`left-end` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`left-start` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.left | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`right-end` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`right-start` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.right | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`top-end` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`top-start` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.top
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var title: reactLib.reactMod.ReactNs.ReactNode
}

