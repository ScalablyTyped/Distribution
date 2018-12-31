package typings
package atMaterialDashUiCoreLib.bottomnavigationactionBottomNavigationActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick<@material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps, std.Exclude<keyof @material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps, 'classes' | 'onChange'>>, @material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps, @material-ui/core.@material-ui/core/BottomNavigationAction/BottomNavigationAction.BottomNavigationActionClassKey, 'onChange'>) */ trait BottomNavigationActionProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[BottomNavigationActionClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], 
      /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.ReactEventHandler[_]] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var showLabel: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

