package typings
package atMaterialDashUiCoreLib.linkLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.AnchorHTMLAttributes<std.HTMLAnchorElement> & @material-ui/core.@material-ui/core/Typography/Typography.TypographyProps, 'classes' | 'component'> ]: react.react.React.AnchorHTMLAttributes<std.HTMLAnchorElement> & @material-ui/core.@material-ui/core/Typography/Typography.TypographyProps[P]} */ trait LinkProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[LinkClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var TypographyClasses: js.UndefOr[
    stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.typographyTypographyMod.TypographyClassKey]
    ]
  ] = js.undefined
  var block: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[LinkProps]] = js.undefined
  var underline: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.none | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.hover | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.always
  ] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    TypographyClasses: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.typographyTypographyMod.TypographyClassKey]
    ] = null,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[LinkClassKey]] = null,
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color = null,
    component: reactLib.reactMod.ReactNs.ReactType[LinkProps] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    underline: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.none | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.hover | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.always = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    if (TypographyClasses != null) __obj.updateDynamic("TypographyClasses")(TypographyClasses)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
}

