package typings
package atMaterialDashUiCoreLib.stepLabelStepLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.HTMLAttributes<std.HTMLDivElement>[P]} */ trait StepLabelProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[StepLabelClasskey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var StepIconComponent: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var StepIconProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.stepIconStepIconMod.StepIconProps]] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var alternativeLabel: js.UndefOr[scala.Boolean] = js.undefined
  var children: reactLib.reactMod.ReactNode
  var completed: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[atMaterialDashUiCoreLib.stepButtonStepButtonMod.StepButtonIcon] = js.undefined
  var last: js.UndefOr[scala.Boolean] = js.undefined
  var optional: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var orientation: js.UndefOr[atMaterialDashUiCoreLib.stepperStepperMod.Orientation] = js.undefined
}

object StepLabelProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    StepIconComponent: reactLib.reactMod.ReactType[_] = null,
    StepIconProps: stdLib.Partial[atMaterialDashUiCoreLib.stepIconStepIconMod.StepIconProps] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    alternativeLabel: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[StepLabelClasskey]] = null,
    completed: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    icon: atMaterialDashUiCoreLib.stepButtonStepButtonMod.StepButtonIcon = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    last: js.UndefOr[scala.Boolean] = js.undefined,
    optional: reactLib.reactMod.ReactNode = null,
    orientation: atMaterialDashUiCoreLib.stepperStepperMod.Orientation = null,
    style: reactLib.reactMod.CSSProperties = null
  ): StepLabelProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (StepIconComponent != null) __obj.updateDynamic("StepIconComponent")(StepIconComponent.asInstanceOf[js.Any])
    if (StepIconProps != null) __obj.updateDynamic("StepIconProps")(StepIconProps)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(alternativeLabel)) __obj.updateDynamic("alternativeLabel")(alternativeLabel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[StepLabelProps]
  }
}

