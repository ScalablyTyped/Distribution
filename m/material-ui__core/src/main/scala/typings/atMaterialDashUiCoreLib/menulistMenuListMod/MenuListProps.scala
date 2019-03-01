package typings
package atMaterialDashUiCoreLib.menulistMenuListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/List.ListProps, 'classes' | 'onKeyDown'> ]: @material-ui/core.@material-ui/core/List.ListProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/List.ListProps, @material-ui/core.@material-ui/core/MenuList/MenuList.MenuListClassKey, 'onKeyDown'>) */ trait MenuListProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[MenuListClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disableListWrap: js.UndefOr[scala.Boolean] = js.undefined
  var onKeyDown: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactEventHandler[reactLib.reactMod.ReactNs.KeyboardEvent[_]]
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object MenuListProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[MenuListClassKey]] = null,
    disableListWrap: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    onKeyDown: reactLib.reactMod.ReactNs.ReactEventHandler[reactLib.reactMod.ReactNs.KeyboardEvent[_]] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): MenuListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disableListWrap)) __obj.updateDynamic("disableListWrap")(disableListWrap)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[MenuListProps]
  }
}

