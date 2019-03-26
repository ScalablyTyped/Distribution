package typings
package atMaterialDashUiCoreLib.stepContentStepContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.React.HTMLAttributes<std.HTMLDivElement>[P]} */ trait StepContentProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[StepContentClasskey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var TransitionComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps]
  ] = js.undefined
  var TransitionProps: js.UndefOr[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var alternativeLabel: js.UndefOr[scala.Boolean] = js.undefined
  var children: reactLib.reactMod.ReactNs.ReactNode
  var completed: js.UndefOr[scala.Boolean] = js.undefined
  var last: js.UndefOr[scala.Boolean] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var orientation: js.UndefOr[atMaterialDashUiCoreLib.stepperStepperMod.Orientation] = js.undefined
  var transitionDuration: js.UndefOr[scala.Nothing | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto] = js.undefined
}

object StepContentProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    TransitionComponent: reactLib.reactMod.ReactNs.ComponentType[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps] = null,
    TransitionProps: atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    alternativeLabel: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[StepContentClasskey]] = null,
    completed: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    last: js.UndefOr[scala.Boolean] = js.undefined,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: atMaterialDashUiCoreLib.stepperStepperMod.Orientation = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    transitionDuration: scala.Nothing | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto = null
  ): StepContentProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (TransitionComponent != null) __obj.updateDynamic("TransitionComponent")(TransitionComponent.asInstanceOf[js.Any])
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(alternativeLabel)) __obj.updateDynamic("alternativeLabel")(alternativeLabel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepContentProps]
  }
}

