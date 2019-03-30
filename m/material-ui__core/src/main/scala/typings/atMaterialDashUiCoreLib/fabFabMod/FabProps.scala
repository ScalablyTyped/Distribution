package typings
package atMaterialDashUiCoreLib.fabFabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseProps, 'classes' | 'component'> ]: @material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseProps[P]} */ trait FabProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[FabClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var color: js.UndefOr[atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[FabProps]] = js.undefined
  var disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disableRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.small | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.medium | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.large
  ] = js.undefined
  var `type`: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.submit | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.reset | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.button
  ] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.round | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.extended
  ] = js.undefined
}

object FabProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[FabClassKey]] = null,
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color = null,
    component: reactLib.reactMod.ReactNs.ReactType[FabProps] = null,
    disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disableRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    size: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.small | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.medium | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.large = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    `type`: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.submit | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.reset | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.button = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.round | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.extended = null
  ): FabProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableRipple)) __obj.updateDynamic("disableRipple")(disableRipple)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (href != null) __obj.updateDynamic("href")(href)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[FabProps]
  }
}

