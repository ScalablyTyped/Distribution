package typings
package atMaterialDashUiCoreLib.badgeBadgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick<react.react.HTMLAttributes<react.HTMLDivElement>, std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement>, 'classes' | never>>, @material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement>, @material-ui/core.@material-ui/core/Badge/Badge.BadgeClassKey, never>) */ trait BadgeProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[BadgeClassKey] {
  var badgeContent: reactLib.reactMod.ReactNs.ReactNode
  var children: reactLib.reactMod.ReactNs.ReactNode
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[
    atMaterialDashUiCoreLib.coreMod.PropTypesNs.Color | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.error
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[BadgeProps]] = js.undefined
  var invisible: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

