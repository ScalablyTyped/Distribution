package typings
package atMaterialDashUiCoreLib.bottomNavigationBottomNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement>, 'classes' | 'onChange'> ]: react.react.HTMLAttributes<std.HTMLDivElement>[P]} */ trait BottomNavigationProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[BottomNavigationClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var children: reactLib.reactMod.ReactNode
  var component: js.UndefOr[reactLib.reactMod.ReactType[BottomNavigationProps]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* event */ reactLib.reactMod.ChangeEvent[js.Object], /* value */ js.Any, scala.Unit]
  ] = js.undefined
  var showLabels: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object BottomNavigationProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    className: java.lang.String = null,
    classes: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[BottomNavigationClassKey]
    ] = null,
    component: reactLib.reactMod.ReactType[BottomNavigationProps] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    onChange: (/* event */ reactLib.reactMod.ChangeEvent[js.Object], /* value */ js.Any) => scala.Unit = null,
    showLabels: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    value: js.Any = null
  ): BottomNavigationProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BottomNavigationProps]
  }
}

