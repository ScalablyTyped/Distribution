package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaisedButtonProps extends SharedEnhancedButtonProps[RaisedButton] {
  // <EnhancedButton/> is the element that get the 'other' properties
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var buttonStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var disabledBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var disabledLabelColor: js.UndefOr[java.lang.String] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var labelColor: js.UndefOr[java.lang.String] = js.undefined
  var labelPosition: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.before | materialDashUiLib.materialDashUiLibStrings.after
  ] = js.undefined
  var labelStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var linkButton: js.UndefOr[scala.Boolean] = js.undefined
  var onMouseDown: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[js.Object]] = js.undefined
  var onMouseEnter: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[js.Object]] = js.undefined
  var onMouseLeave: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[js.Object]] = js.undefined
  var onMouseUp: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[js.Object]] = js.undefined
  var onTouchEnd: js.UndefOr[reactLib.reactMod.ReactNs.TouchEventHandler[js.Object]] = js.undefined
  var onTouchStart: js.UndefOr[reactLib.reactMod.ReactNs.TouchEventHandler[js.Object]] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var rippleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var secondary: js.UndefOr[scala.Boolean] = js.undefined
}

object RaisedButtonProps {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    buttonStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    centerRipple: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    containerElement: reactLib.reactMod.ReactNs.ReactNode | java.lang.String = null,
    disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[scala.Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledBackgroundColor: java.lang.String = null,
    disabledLabelColor: java.lang.String = null,
    focusRippleColor: java.lang.String = null,
    focusRippleOpacity: scala.Int | scala.Double = null,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    keyboardFocused: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    labelColor: java.lang.String = null,
    labelPosition: materialDashUiLib.materialDashUiLibStrings.before | materialDashUiLib.materialDashUiLibStrings.after = null,
    labelStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    linkButton: js.UndefOr[scala.Boolean] = js.undefined,
    onBlur: reactLib.reactMod.ReactNs.FocusEventHandler[js.Object] = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onFocus: reactLib.reactMod.ReactNs.FocusEventHandler[js.Object] = null,
    onKeyDown: reactLib.reactMod.ReactNs.KeyboardEventHandler[js.Object] = null,
    onKeyUp: reactLib.reactMod.ReactNs.KeyboardEventHandler[js.Object] = null,
    onKeyboardFocus: (/* e */ reactLib.reactMod.ReactNs.FocusEvent[js.Object], /* isKeyboardFocused */ scala.Boolean) => scala.Unit = null,
    onMouseDown: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onMouseEnter: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onMouseLeave: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onMouseUp: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onTouchEnd: reactLib.reactMod.ReactNs.TouchEventHandler[js.Object] = null,
    onTouchStart: reactLib.reactMod.ReactNs.TouchEventHandler[js.Object] = null,
    overlayStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    rippleStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    target: java.lang.String = null,
    touchRippleColor: java.lang.String = null,
    touchRippleOpacity: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): RaisedButtonProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle)
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (className != null) __obj.updateDynamic("className")(className)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledBackgroundColor != null) __obj.updateDynamic("disabledBackgroundColor")(disabledBackgroundColor)
    if (disabledLabelColor != null) __obj.updateDynamic("disabledLabelColor")(disabledLabelColor)
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor)
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (href != null) __obj.updateDynamic("href")(href)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (!js.isUndefined(linkButton)) __obj.updateDynamic("linkButton")(linkButton)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (rippleStyle != null) __obj.updateDynamic("rippleStyle")(rippleStyle)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor)
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RaisedButtonProps]
  }
}

