package typings.materialDashUi.underscoreUnderscoreMaterialUINs

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.materialDashUi.underscoreUnderscoreMaterialUINs.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp, style, tabIndex. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ trait FloatingActionButtonProps
  extends HTMLAttributes[js.Object] {
  // <EnhancedButton/> is the element that get the 'other' properties
  var backgroundColor: js.UndefOr[String] = js.undefined
  var centerRipple: js.UndefOr[Boolean] = js.undefined
  var containerElement: js.UndefOr[ReactNode | String] = js.undefined
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  var disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledColor: js.UndefOr[String] = js.undefined
  var focusRippleColor: js.UndefOr[String] = js.undefined
  var focusRippleOpacity: js.UndefOr[Double] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var iconClassName: js.UndefOr[String] = js.undefined
  var iconStyle: js.UndefOr[CSSProperties] = js.undefined
  var keyboardFocused: js.UndefOr[Boolean] = js.undefined
  var mini: js.UndefOr[Boolean] = js.undefined
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.undefined
  var secondary: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var touchRippleColor: js.UndefOr[String] = js.undefined
  var touchRippleOpacity: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var zDepth: js.UndefOr[Double] = js.undefined
}

object FloatingActionButtonProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[js.Object] = null,
    SharedEnhancedButtonProps: SharedEnhancedButtonProps[FloatingActionButton] = null,
    backgroundColor: String = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledColor: String = null,
    iconClassName: String = null,
    iconStyle: CSSProperties = null,
    mini: js.UndefOr[Boolean] = js.undefined,
    onMouseDown: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onTouchEnd: TouchEvent[js.Object] => Unit = null,
    onTouchStart: TouchEvent[js.Object] => Unit = null,
    secondary: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    zDepth: Int | Double = null
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
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (style != null) __obj.updateDynamic("style")(style)
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingActionButtonProps]
  }
}

