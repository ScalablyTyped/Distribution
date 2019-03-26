package typings
package atMaterialDashUiCoreLib.buttonButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseProps, 'classes' | 'component'> ]: @material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseProps[P]} */ trait ButtonProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ButtonClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var color: js.UndefOr[atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[ButtonProps]] = js.undefined
  var disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disableRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var mini: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.small | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.medium | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.large
  ] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.text | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.flat | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.contained | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.raised | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.fab | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.extendedFab
  ] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[ButtonClassKey]] = null,
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color = null,
    component: reactLib.reactMod.ReactNs.ReactType[ButtonProps] = null,
    disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disableRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    mini: js.UndefOr[scala.Boolean] = js.undefined,
    size: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.small | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.medium | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.large = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    `type`: java.lang.String = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.text | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.flat | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.contained | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.raised | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.fab | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.extendedFab = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableRipple)) __obj.updateDynamic("disableRipple")(disableRipple)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (href != null) __obj.updateDynamic("href")(href)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

