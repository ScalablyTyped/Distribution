package typings
package atMaterialDashUiCoreLib.formControlFormControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HtmlHTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.React.HtmlHTMLAttributes<std.HTMLDivElement>[P]} */ trait FormControlProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[FormControlClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[FormControlProps]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var margin: js.UndefOr[atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Margin] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.ReactNs.EventHandler[_]] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.ReactNs.EventHandler[_]] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled
  ] = js.undefined
}

object FormControlProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[FormControlClassKey]] = null,
    component: reactLib.reactMod.ReactNs.ReactType[FormControlProps] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    margin: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Margin = null,
    onBlur: reactLib.reactMod.ReactNs.EventHandler[_] = null,
    onFocus: reactLib.reactMod.ReactNs.EventHandler[_] = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled = null
  ): FormControlProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (style != null) __obj.updateDynamic("style")(style)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlProps]
  }
}

