package typings
package atMaterialDashUiCoreLib.typographyTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLElement>, 'classes' | never> ]: react.react.HTMLAttributes<std.HTMLElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<std.HTMLElement>, @material-ui/core.@material-ui/core/Typography/Typography.TypographyClassKey, never>) */ trait TypographyProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TypographyClassKey] {
  var align: js.UndefOr[atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Alignment] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.textPrimary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.textSecondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.error
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[TypographyProps]] = js.undefined
  var gutterBottom: js.UndefOr[scala.Boolean] = js.undefined
  var headlineMapping: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ type in @material-ui/core.@material-ui/core/Typography/Typography.Style ]: string}
    */ js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ type in @material-ui/core.@material-ui/core/Typography/Typography.Style ]: string}
    */ atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.TypographyProps with js.Any
  ] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var noWrap: js.UndefOr[scala.Boolean] = js.undefined
  var paragraph: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var variant: js.UndefOr[Style | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit] = js.undefined
}

object TypographyProps {
  @scala.inline
  def apply(
    align: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Alignment = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[TypographyClassKey]] = null,
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.textPrimary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.textSecondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.error = null,
    component: reactLib.reactMod.ReactNs.ReactType[TypographyProps] = null,
    gutterBottom: js.UndefOr[scala.Boolean] = js.undefined,
    headlineMapping: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ type in @material-ui/core.@material-ui/core/Typography/Typography.Style ]: string}
    */ atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.TypographyProps with js.Any = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    noWrap: js.UndefOr[scala.Boolean] = js.undefined,
    paragraph: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    variant: Style | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit = null
  ): TypographyProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(gutterBottom)) __obj.updateDynamic("gutterBottom")(gutterBottom)
    if (headlineMapping != null) __obj.updateDynamic("headlineMapping")(headlineMapping)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap)
    if (!js.isUndefined(paragraph)) __obj.updateDynamic("paragraph")(paragraph)
    if (style != null) __obj.updateDynamic("style")(style)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyProps]
  }
}

