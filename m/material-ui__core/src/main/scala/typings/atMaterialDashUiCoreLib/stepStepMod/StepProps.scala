package typings
package atMaterialDashUiCoreLib.stepStepMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.React.HTMLAttributes<std.HTMLDivElement>[P]} */ trait StepProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[StepClasskey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var alternativeLabel: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var completed: js.UndefOr[scala.Boolean] = js.undefined
  var connector: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var last: js.UndefOr[scala.Boolean] = js.undefined
  var orientation: js.UndefOr[atMaterialDashUiCoreLib.stepperStepperMod.Orientation] = js.undefined
}

object StepProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    alternativeLabel: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[StepClasskey]] = null,
    completed: js.UndefOr[scala.Boolean] = js.undefined,
    connector: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    last: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: atMaterialDashUiCoreLib.stepperStepperMod.Orientation = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): StepProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(alternativeLabel)) __obj.updateDynamic("alternativeLabel")(alternativeLabel)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
    if (connector != null) __obj.updateDynamic("connector")(connector)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[StepProps]
  }
}

