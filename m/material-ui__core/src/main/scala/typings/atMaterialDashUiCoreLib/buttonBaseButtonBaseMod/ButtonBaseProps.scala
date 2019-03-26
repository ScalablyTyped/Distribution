package typings
package atMaterialDashUiCoreLib.buttonBaseButtonBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.AnchorHTMLAttributes<std.HTMLElement> & react.react.React.ButtonHTMLAttributes<std.HTMLElement>, 'classes' | never> ]: react.react.React.AnchorHTMLAttributes<std.HTMLElement> & react.react.React.ButtonHTMLAttributes<std.HTMLElement>[P]} */ trait ButtonBaseProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ButtonBaseClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var TouchRippleProps: js.UndefOr[
    stdLib.Partial[atMaterialDashUiCoreLib.buttonBaseTouchRippleMod.TouchRippleProps]
  ] = js.undefined
  var action: js.UndefOr[js.Function1[/* actions */ ButtonBaseActions, scala.Unit]] = js.undefined
  var buttonRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_]] = js.undefined
  var centerRipple: js.UndefOr[scala.Boolean] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[ButtonBaseProps]] = js.undefined
  var disableRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined
  var focusRipple: js.UndefOr[scala.Boolean] = js.undefined
  var focusVisibleClassName: js.UndefOr[java.lang.String] = js.undefined
  var onFocusVisible: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[_]] = js.undefined
}

object ButtonBaseProps {
  @scala.inline
  def apply(
    TouchRippleProps: stdLib.Partial[atMaterialDashUiCoreLib.buttonBaseTouchRippleMod.TouchRippleProps] = null,
    action: /* actions */ ButtonBaseActions => scala.Unit = null,
    buttonRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    centerRipple: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[ButtonBaseClassKey]] = null,
    component: reactLib.reactMod.ReactNs.ReactType[ButtonBaseProps] = null,
    disableRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined,
    focusRipple: js.UndefOr[scala.Boolean] = js.undefined,
    focusVisibleClassName: java.lang.String = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    onFocusVisible: reactLib.reactMod.ReactNs.FocusEventHandler[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ButtonBaseProps = {
    val __obj = js.Dynamic.literal()
    if (TouchRippleProps != null) __obj.updateDynamic("TouchRippleProps")(TouchRippleProps)
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (buttonRef != null) __obj.updateDynamic("buttonRef")(buttonRef.asInstanceOf[js.Any])
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(disableRipple)) __obj.updateDynamic("disableRipple")(disableRipple)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (!js.isUndefined(focusRipple)) __obj.updateDynamic("focusRipple")(focusRipple)
    if (focusVisibleClassName != null) __obj.updateDynamic("focusVisibleClassName")(focusVisibleClassName)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onFocusVisible != null) __obj.updateDynamic("onFocusVisible")(onFocusVisible)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ButtonBaseProps]
  }
}

