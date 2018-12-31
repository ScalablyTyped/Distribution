package typings
package atMaterialDashUiCoreLib.bottomnavigationBottomNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick<react.react.HTMLAttributes<react.HTMLDivElement>, std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement>, 'classes' | 'onChange'>>, @material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement>, @material-ui/core.@material-ui/core/BottomNavigation/BottomNavigation.BottomNavigationClassKey, 'onChange'>) */ trait BottomNavigationProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[BottomNavigationClassKey] {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[BottomNavigationProps]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], 
      /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var showLabels: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

