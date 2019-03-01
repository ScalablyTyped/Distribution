package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- materialDashUiLib.underscoreUnderscoreMaterialUINs.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp, style, tabIndex. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ trait FloatingActionButtonProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[js.Object] {
  // <EnhancedButton/> is the element that get the 'other' properties
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var centerRipple: js.UndefOr[scala.Boolean] = js.undefined
  var containerElement: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | java.lang.String] = js.undefined
  var disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disableKeyboardFocus: js.UndefOr[scala.Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var disabledColor: js.UndefOr[java.lang.String] = js.undefined
  var focusRippleColor: js.UndefOr[java.lang.String] = js.undefined
  var focusRippleOpacity: js.UndefOr[scala.Double] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var iconClassName: js.UndefOr[java.lang.String] = js.undefined
  var iconStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var keyboardFocused: js.UndefOr[scala.Boolean] = js.undefined
  var mini: js.UndefOr[scala.Boolean] = js.undefined
  var onKeyboardFocus: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.FocusEvent[js.Object], 
      /* isKeyboardFocused */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var secondary: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var touchRippleColor: js.UndefOr[java.lang.String] = js.undefined
  var touchRippleOpacity: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var zDepth: js.UndefOr[scala.Double] = js.undefined
}

object FloatingActionButtonProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[js.Object] = null,
    SharedEnhancedButtonProps: SharedEnhancedButtonProps[FloatingActionButton] = null,
    backgroundColor: java.lang.String = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledColor: java.lang.String = null,
    iconClassName: java.lang.String = null,
    iconStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    mini: js.UndefOr[scala.Boolean] = js.undefined,
    onMouseDown: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onMouseEnter: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onMouseLeave: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onMouseUp: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onTouchEnd: reactLib.reactMod.ReactNs.TouchEventHandler[js.Object] = null,
    onTouchStart: reactLib.reactMod.ReactNs.TouchEventHandler[js.Object] = null,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    zDepth: scala.Int | scala.Double = null
  ): FloatingActionButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, SharedEnhancedButtonProps)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledColor != null) __obj.updateDynamic("disabledColor")(disabledColor)
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (style != null) __obj.updateDynamic("style")(style)
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingActionButtonProps]
  }
}

