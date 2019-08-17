package typings.atMaterialDashUiLab.speedDialSpeedDialMod

import typings.atMaterialDashUiCore.Anon_ClassName
import typings.atMaterialDashUiCore.stylesWithStylesMod.ClassNameMap
import typings.atMaterialDashUiCore.stylesWithStylesMod.StyledComponentProps
import typings.atMaterialDashUiLab.PartialButtonProps
import typings.atMaterialDashUiLab.atMaterialDashUiLabStrings.down
import typings.atMaterialDashUiLab.atMaterialDashUiLabStrings.left
import typings.atMaterialDashUiLab.atMaterialDashUiLabStrings.right
import typings.atMaterialDashUiLab.atMaterialDashUiLabStrings.up
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactEventHandler
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import typings.reactDashTransitionDashGroup.Anon_Appear
import typings.reactDashTransitionDashGroup.transitionMod.TransitionProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any> extends any ? std.Pick<react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any>, std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any>, 'classes' | never>> : never */ trait SpeedDialProps
  extends StyledComponentProps[SpeedDialClassKey]
     with Anon_ClassName {
  var ButtonProps: js.UndefOr[PartialButtonProps] = js.undefined
  var TransitionComponent: js.UndefOr[ComponentType[TransitionProps]] = js.undefined
  var TransitionProps: js.UndefOr[typings.reactDashTransitionDashGroup.transitionMod.TransitionProps] = js.undefined
  var ariaLabel: String
  var direction: js.UndefOr[up | down | left | right] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var icon: ReactNode
  var onClose: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  var open: Boolean
  var openIcon: js.UndefOr[ReactNode] = js.undefined
  var transitionDuration: js.UndefOr[Double | Anon_Appear] = js.undefined
}

object SpeedDialProps {
  @scala.inline
  def apply(
    ariaLabel: String,
    icon: ReactNode,
    open: Boolean,
    ButtonProps: PartialButtonProps = null,
    TransitionComponent: ComponentType[TransitionProps] = null,
    TransitionProps: TransitionProps = null,
    className: String = null,
    classes: Partial[ClassNameMap[SpeedDialClassKey]] = null,
    direction: up | down | left | right = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref[_] | RefObject[_] = null,
    onClose: ReactEventHandler[js.Object] = null,
    openIcon: ReactNode = null,
    style: CSSProperties = null,
    transitionDuration: Double | Anon_Appear = null
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

