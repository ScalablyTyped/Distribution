package typings
package atMaterialDashUiCoreLib.bottomNavigationActionBottomNavigationActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseProps, 'classes' | 'onChange'> ]: @material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseProps[P]} */ trait BottomNavigationActionProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[BottomNavigationActionClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var icon: js.UndefOr[java.lang.String | reactLib.reactMod.ReactElement[_]] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* event */ reactLib.reactMod.ChangeEvent[js.Object], /* value */ js.Any, scala.Unit]
  ] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactEventHandler[_]] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var showLabel: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object BottomNavigationActionProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[BottomNavigationActionClassKey]
    ] = null,
    icon: java.lang.String | reactLib.reactMod.ReactElement[_] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    label: reactLib.reactMod.ReactNode = null,
    onChange: (/* event */ reactLib.reactMod.ChangeEvent[js.Object], /* value */ js.Any) => scala.Unit = null,
    onClick: reactLib.reactMod.ReactEventHandler[_] = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    showLabel: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    value: js.Any = null
  ): BottomNavigationActionProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BottomNavigationActionProps]
  }
}

