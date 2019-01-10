package typings
package atMaterialDashUiCoreLib.linkLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLAnchorElement> & @material-ui/core.@material-ui/core/Typography.TypographyProps, 'classes' | 'component'> ]: react.react.HTMLAttributes<react.HTMLAnchorElement> & @material-ui/core.@material-ui/core/Typography.TypographyProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLAnchorElement> & @material-ui/core.@material-ui/core/Typography.TypographyProps, @material-ui/core.@material-ui/core/Link/Link.LinkClassKey, 'component'>) */ trait LinkProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[LinkClassKey] {
  var TypographyClasses: js.UndefOr[
    stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.typographyTypographyMod.TypographyClassKey]
    ]
  ] = js.undefined
  var block: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[atMaterialDashUiCoreLib.coreMod.PropTypesNs.Color] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[LinkProps]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var underline: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.none | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.hover | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.always
  ] = js.undefined
}

