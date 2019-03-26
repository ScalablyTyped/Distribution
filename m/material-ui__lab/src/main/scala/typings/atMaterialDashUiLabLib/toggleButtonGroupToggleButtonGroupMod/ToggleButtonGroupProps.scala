package typings
package atMaterialDashUiLabLib.toggleButtonGroupToggleButtonGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HTMLAttributes<std.HTMLDivElement>, 'classes' | 'onChange'> ]: react.react.React.HTMLAttributes<std.HTMLDivElement>[P]} */ trait ToggleButtonGroupProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ToggleButtonGroupClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ToggleButtonGroupProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[ToggleButtonGroupClassKey]
    ] = null,
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    onChange: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* value */ js.Any) => scala.Unit = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    value: js.Any = null
  ): ToggleButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ToggleButtonGroupProps]
  }
}

