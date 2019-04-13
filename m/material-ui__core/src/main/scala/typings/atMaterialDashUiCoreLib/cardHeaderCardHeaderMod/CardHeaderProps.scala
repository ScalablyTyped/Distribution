package typings
package atMaterialDashUiCoreLib.cardHeaderCardHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement>, 'classes' | 'title'> ]: react.react.HTMLAttributes<std.HTMLDivElement>[P]} */ trait CardHeaderProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[CardHeaderClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var action: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var avatar: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactType[CardHeaderProps]] = js.undefined
  var disableTypography: js.UndefOr[scala.Boolean] = js.undefined
  var subheader: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var subheaderTypographyProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.typographyTypographyMod.TypographyProps]] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var titleTypographyProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.typographyTypographyMod.TypographyProps]] = js.undefined
}

object CardHeaderProps {
  @scala.inline
  def apply(
    action: reactLib.reactMod.ReactNode = null,
    avatar: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[CardHeaderClassKey]] = null,
    component: reactLib.reactMod.ReactType[CardHeaderProps] = null,
    disableTypography: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    style: reactLib.reactMod.CSSProperties = null,
    subheader: reactLib.reactMod.ReactNode = null,
    subheaderTypographyProps: stdLib.Partial[atMaterialDashUiCoreLib.typographyTypographyMod.TypographyProps] = null,
    title: reactLib.reactMod.ReactNode = null,
    titleTypographyProps: stdLib.Partial[atMaterialDashUiCoreLib.typographyTypographyMod.TypographyProps] = null
  ): CardHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTypography)) __obj.updateDynamic("disableTypography")(disableTypography)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (subheader != null) __obj.updateDynamic("subheader")(subheader.asInstanceOf[js.Any])
    if (subheaderTypographyProps != null) __obj.updateDynamic("subheaderTypographyProps")(subheaderTypographyProps)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTypographyProps != null) __obj.updateDynamic("titleTypographyProps")(titleTypographyProps)
    __obj.asInstanceOf[CardHeaderProps]
  }
}

