package typings
package atMaterialDashUiCoreLib.menuItemMenuItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/ListItem.ListItemProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/ListItem.ListItemProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/ListItem.ListItemProps, @material-ui/core.@material-ui/core/MenuItem/MenuItem.MenuItemClassKey, never>) */ trait MenuItemProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[MenuItemClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[MenuItemProps]] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[MenuItemClassKey]] = null,
    component: reactLib.reactMod.ReactNs.ReactType[MenuItemProps] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    role: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[MenuItemProps]
  }
}

