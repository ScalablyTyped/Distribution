package typings
package atMaterialDashUiCoreLib.listItemTextListItemTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.React.HTMLAttributes<std.HTMLDivElement>[P]} */ trait ListItemTextProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ListItemTextClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var disableTypography: js.UndefOr[scala.Boolean] = js.undefined
  var inset: js.UndefOr[scala.Boolean] = js.undefined
  var primary: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var primaryTypographyProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.typographyTypographyMod.TypographyProps]] = js.undefined
  var secondary: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var secondaryTypographyProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.typographyTypographyMod.TypographyProps]] = js.undefined
}

object ListItemTextProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[ListItemTextClassKey]] = null,
    disableTypography: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    inset: js.UndefOr[scala.Boolean] = js.undefined,
    primary: reactLib.reactMod.ReactNs.ReactNode = null,
    primaryTypographyProps: stdLib.Partial[atMaterialDashUiCoreLib.typographyTypographyMod.TypographyProps] = null,
    secondary: reactLib.reactMod.ReactNs.ReactNode = null,
    secondaryTypographyProps: stdLib.Partial[atMaterialDashUiCoreLib.typographyTypographyMod.TypographyProps] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ListItemTextProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disableTypography)) __obj.updateDynamic("disableTypography")(disableTypography)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (primaryTypographyProps != null) __obj.updateDynamic("primaryTypographyProps")(primaryTypographyProps)
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (secondaryTypographyProps != null) __obj.updateDynamic("secondaryTypographyProps")(secondaryTypographyProps)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ListItemTextProps]
  }
}

