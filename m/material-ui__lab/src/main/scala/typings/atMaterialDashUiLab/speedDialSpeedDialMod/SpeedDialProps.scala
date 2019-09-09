package typings.atMaterialDashUiLab.speedDialSpeedDialMod

import typings.atMaterialDashUiCore.Anon_ClassName
import typings.atMaterialDashUiCore.stylesWithStylesMod.ClassNameMap
import typings.atMaterialDashUiCore.stylesWithStylesMod.StyledComponentProps
import typings.atMaterialDashUiLab.PartialButtonProps
import typings.atMaterialDashUiLab.atMaterialDashUiLabStrings.down
import typings.atMaterialDashUiLab.atMaterialDashUiLabStrings.left
import typings.atMaterialDashUiLab.atMaterialDashUiLabStrings.right
import typings.atMaterialDashUiLab.atMaterialDashUiLabStrings.up
import typings.react.Event
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import typings.react.reactMod.SyntheticEvent
import typings.reactDashTransitionDashGroup.Anon_Appear
import typings.reactDashTransitionDashGroup.transitionMod.TransitionProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any> extends any ? std.Pick<react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any>, std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any>, 'classes' | 'children'>> : never */ trait SpeedDialProps
  extends StyledComponentProps[SpeedDialClassKey]
     with Anon_ClassName {
  /**
    * Props applied to the [`Button`](/api/button/) element.
    */
  var ButtonProps: js.UndefOr[PartialButtonProps] = js.undefined
  /**
    * The component used for the transition.
    */
  var TransitionComponent: js.UndefOr[ComponentType[TransitionProps]] = js.undefined
  /**
    * Props applied to the `Transition` element.
    */
  var TransitionProps: js.UndefOr[typings.reactDashTransitionDashGroup.transitionMod.TransitionProps] = js.undefined
  /**
    * The aria-label of the `Button` element.
    * Also used to provide the `id` for the `SpeedDial` element and its children.
    */
  var ariaLabel: String
  /**
    * SpeedDialActions to display when the SpeedDial is `open`.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * The direction the actions open relative to the floating action button.
    */
  var direction: js.UndefOr[up | down | left | right] = js.undefined
  /**
    * If `true`, the SpeedDial will be hidden.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * The icon to display in the SpeedDial Floating Action Button. The `SpeedDialIcon` component
    * provides a default Icon with animation.
    */
  var icon: js.UndefOr[ReactNode] = js.undefined
  /**
    * Callback fired when the component requests to be closed.
    *
    * @param {object} event The event source of the callback.
    * @param {string} key The key pressed.
    */
  var onClose: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[js.Object, Event], /* key */ String, Unit]
  ] = js.undefined
  /**
    * If `true`, the SpeedDial is open.
    */
  var open: Boolean
  /**
    * The icon to display in the SpeedDial Floating Action Button when the SpeedDial is open.
    */
  var openIcon: js.UndefOr[ReactNode] = js.undefined
  /**
    * The duration for the transition, in milliseconds.
    * You may specify a single timeout for all transitions, or individually with an object.
    */
  var transitionDuration: js.UndefOr[Double | Anon_Appear] = js.undefined
}

object SpeedDialProps {
  @scala.inline
  def apply(
    ariaLabel: String,
    open: Boolean,
    ButtonProps: PartialButtonProps = null,
    TransitionComponent: ComponentType[TransitionProps] = null,
    TransitionProps: TransitionProps = null,
    children: ReactNode = null,
    className: String = null,
    classes: Partial[ClassNameMap[SpeedDialClassKey]] = null,
    direction: up | down | left | right = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: ReactNode = null,
    innerRef: Ref[_] | RefObject[_] = null,
    onClose: (/* event */ SyntheticEvent[js.Object, Event], /* key */ String) => Unit = null,
    openIcon: ReactNode = null,
    style: CSSProperties = null,
    transitionDuration: Double | Anon_Appear = null
  ): SpeedDialProps = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel, open = open)
    if (ButtonProps != null) __obj.updateDynamic("ButtonProps")(ButtonProps)
    if (TransitionComponent != null) __obj.updateDynamic("TransitionComponent")(TransitionComponent.asInstanceOf[js.Any])
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (openIcon != null) __obj.updateDynamic("openIcon")(openIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedDialProps]
  }
}

