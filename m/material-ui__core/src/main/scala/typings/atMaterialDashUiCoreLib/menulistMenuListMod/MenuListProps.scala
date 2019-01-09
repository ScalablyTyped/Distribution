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

