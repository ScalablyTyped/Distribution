package typings
package atMaterialDashUiCoreLib.badgeBadgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick, @material-ui/core.@material-ui/core.StandardProps) */ 
trait BadgeProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[BadgeClassKey] {
  var badgeContent: reactLib.reactMod.ReactNs.ReactNode
  var children: reactLib.reactMod.ReactNs.ReactNode
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[
    atMaterialDashUiCoreLib.coreMod.PropTypesNs.Color | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.error
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[BadgeProps]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

