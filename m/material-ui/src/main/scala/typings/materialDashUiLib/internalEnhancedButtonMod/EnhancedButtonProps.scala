package typings
package materialDashUiLib.internalEnhancedButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhancedButtonProps
  extends materialDashUiLib.underscoreUnderscoreMaterialUINs.SharedEnhancedButtonProps[EnhancedButton]

object EnhancedButtonProps {
  @scala.inline
  def apply(
    centerRipple: js.UndefOr[scala.Boolean] = js.undefined,
    containerElement: reactLib.reactMod.ReactNs.ReactNode | java.lang.String = null,
    disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[scala.Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined,
    focusRippleColor: java.lang.String = null,
    focusRippleOpacity: scala.Int | scala.Double = null,
    href: java.lang.String = null,
    keyboardFocused: js.UndefOr[scala.Boolean] = js.undefined,
    onBlur: reactLib.reactMod.ReactNs.FocusEventHandler[js.Object] = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onFocus: reactLib.reactMod.ReactNs.FocusEventHandler[js.Object] = null,
    onKeyDown: reactLib.reactMod.ReactNs.KeyboardEventHandler[js.Object] = null,
    onKeyUp: reactLib.reactMod.ReactNs.KeyboardEventHandler[js.Object] = null,
    onKeyboardFocus: js.Function2[
      /* e */ reactLib.reactMod.ReactNs.FocusEvent[js.Object], 
      /* isKeyboardFocused */ scala.Boolean, 
      scala.Unit
    ] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    target: java.lang.String = null,
    touchRippleColor: java.lang.String = null,
    touchRippleOpacity: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): EnhancedButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor)
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(onKeyboardFocus)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor)
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EnhancedButtonProps]
  }
}

