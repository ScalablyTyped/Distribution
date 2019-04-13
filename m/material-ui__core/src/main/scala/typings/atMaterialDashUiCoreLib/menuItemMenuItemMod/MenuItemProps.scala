package typings
package atMaterialDashUiCoreLib.menuItemMenuItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/ListItem/ListItem.ListItemProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/ListItem/ListItem.ListItemProps[P]} */ trait MenuItemProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[MenuItemClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var component: js.UndefOr[reactLib.reactMod.ReactType[MenuItemProps]] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[MenuItemClassKey]] = null,
    component: reactLib.reactMod.ReactType[MenuItemProps] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    role: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null
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

