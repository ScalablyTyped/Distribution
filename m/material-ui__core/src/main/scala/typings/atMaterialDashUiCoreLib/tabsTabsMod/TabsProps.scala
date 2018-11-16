package typings
package atMaterialDashUiCoreLib.tabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick, @material-ui/core.@material-ui/core.StandardProps) */ 
trait TabsProps
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
  var width: js.UndefOr[java.lang.String] = js.undefined
}

