package typings
package atMaterialDashUiLabLib.speedDialSpeedDialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, 'classes' | never> ]: react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>[P]} */ trait SpeedDialProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SpeedDialClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var ButtonProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.buttonButtonMod.ButtonProps]] = js.undefined
  var TransitionComponent: js.UndefOr[
    reactLib.reactMod.ComponentType[reactDashTransitionDashGroupLib.transitionMod.TransitionProps]
  ] = js.undefined
  var TransitionProps: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.TransitionProps] = js.undefined
  var ariaLabel: java.lang.String
  var direction: js.UndefOr[
    atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.up | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.down | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.left | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.right
  ] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var icon: reactLib.reactMod.ReactNode
  var onClose: js.UndefOr[reactLib.reactMod.ReactEventHandler[js.Object]] = js.undefined
  var open: scala.Boolean
  var openIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double | reactDashTransitionDashGroupLib.Anon_Enter] = js.undefined
}

object SpeedDialProps {
  @scala.inline
  def apply(
    ariaLabel: java.lang.String,
    icon: reactLib.reactMod.ReactNode,
    open: scala.Boolean,
    ButtonProps: stdLib.Partial[atMaterialDashUiCoreLib.buttonButtonMod.ButtonProps] = null,
    TransitionComponent: reactLib.reactMod.ComponentType[reactDashTransitionDashGroupLib.transitionMod.TransitionProps] = null,
    TransitionProps: reactDashTransitionDashGroupLib.transitionMod.TransitionProps = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[SpeedDialClassKey]] = null,
    direction: atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.up | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.down | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.left | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.right = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    onClose: reactLib.reactMod.ReactEventHandler[js.Object] = null,
    openIcon: reactLib.reactMod.ReactNode = null,
    style: reactLib.reactMod.CSSProperties = null,
    transitionDuration: scala.Double | reactDashTransitionDashGroupLib.Anon_Enter = null
  ): SpeedDialProps = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel, icon = icon.asInstanceOf[js.Any], open = open)
    if (ButtonProps != null) __obj.updateDynamic("ButtonProps")(ButtonProps)
    if (TransitionComponent != null) __obj.updateDynamic("TransitionComponent")(TransitionComponent.asInstanceOf[js.Any])
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (openIcon != null) __obj.updateDynamic("openIcon")(openIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedDialProps]
  }
}

