package typings
package atMaterialDashUiCoreLib.stepiconStepIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLDivElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement>, @material-ui/core.@material-ui/core/StepIcon/StepIcon.StepIconClasskey, never>) */ trait StepIconProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[StepIconClasskey] {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var completed: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var icon: reactLib.reactMod.ReactNs.ReactNode
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object StepIconProps {
  @scala.inline
  def apply(
    icon: reactLib.reactMod.ReactNs.ReactNode,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[StepIconClasskey]] = null,
    completed: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): StepIconProps = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[StepIconProps]
  }
}

