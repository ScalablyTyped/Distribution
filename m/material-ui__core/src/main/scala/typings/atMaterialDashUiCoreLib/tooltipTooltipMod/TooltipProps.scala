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

object TooltipProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactElement[_],
    title: reactLib.reactMod.ReactNs.ReactNode,
    PopperProps: js.Object = null,
    TransitionComponent: reactLib.reactMod.ReactNs.ComponentType[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps] = null,
    TransitionProps: atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[TooltipClassKey]] = null,
    disableFocusListener: js.UndefOr[scala.Boolean] = js.undefined,
    disableHoverListener: js.UndefOr[scala.Boolean] = js.undefined,
    disableTouchListener: js.UndefOr[scala.Boolean] = js.undefined,
    enterDelay: scala.Int | scala.Double = null,
    enterTouchDelay: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    leaveDelay: scala.Int | scala.Double = null,
    leaveTouchDelay: scala.Int | scala.Double = null,
    onClose: js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit] = null,
    onOpen: js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    placement: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`bottom-end` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`bottom-start` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.bottom | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`left-end` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`left-start` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.left | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`right-end` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`right-start` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.right | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`top-end` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`top-start` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.top = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(children = children, title = title.asInstanceOf[js.Any])
    if (PopperProps != null) __obj.updateDynamic("PopperProps")(PopperProps)
    if (TransitionComponent != null) __obj.updateDynamic("TransitionComponent")(TransitionComponent.asInstanceOf[js.Any])
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disableFocusListener)) __obj.updateDynamic("disableFocusListener")(disableFocusListener)
    if (!js.isUndefined(disableHoverListener)) __obj.updateDynamic("disableHoverListener")(disableHoverListener)
    if (!js.isUndefined(disableTouchListener)) __obj.updateDynamic("disableTouchListener")(disableTouchListener)
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (enterTouchDelay != null) __obj.updateDynamic("enterTouchDelay")(enterTouchDelay.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (leaveDelay != null) __obj.updateDynamic("leaveDelay")(leaveDelay.asInstanceOf[js.Any])
    if (leaveTouchDelay != null) __obj.updateDynamic("leaveTouchDelay")(leaveTouchDelay.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TooltipProps]
  }
}

