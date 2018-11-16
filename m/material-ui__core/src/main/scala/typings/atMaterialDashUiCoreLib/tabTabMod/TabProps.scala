package typings
package atMaterialDashUiCoreLib.tabTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick, @material-ui/core.@material-ui/core.StandardProps) */ 
trait TabProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TabClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[atMaterialDashUiCoreLib.Anon_Checked], 
      /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.EventHandler[_]] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var textColor: js.UndefOr[
    java.lang.String | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit
  ] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

