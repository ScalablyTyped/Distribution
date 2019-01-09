package typings
package atMaterialDashUiCoreLib.tabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseProps, 'classes' | 'onChange' | 'action' | 'component'> ]: @material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseProps, @material-ui/core.@material-ui/core/Tabs/Tabs.TabsClassKey, 'onChange' | 'action' | 'component'>) */ trait TabsProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TabsClassKey] {
  var ScrollButtonComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var TabIndicatorProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.tabsTabIndicatorMod.TabIndicatorProps]] = js.undefined
  var action: js.UndefOr[js.Function1[/* actions */ TabsActions, scala.Unit]] = js.undefined
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[TabsProps]] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var indicatorColor: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | java.lang.String
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], 
      /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var scrollButtons: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.on | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.off
  ] = js.undefined
  var scrollable: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var textColor: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit | java.lang.String
  ] = js.undefined
  var value: js.Any
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.scrollable | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.fullWidth
  ] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

