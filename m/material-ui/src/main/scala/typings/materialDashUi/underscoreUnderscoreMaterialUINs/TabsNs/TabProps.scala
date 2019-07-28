package typings.materialDashUi.underscoreUnderscoreMaterialUINs.TabsNs

import typings.materialDashUi.underscoreUnderscoreMaterialUINs.SharedEnhancedButtonProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends SharedEnhancedButtonProps[Tab] {
  var buttonStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var onActive: js.UndefOr[js.Function1[/* tab */ Tab, Unit]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    buttonStyle: CSSProperties = null,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    containerElement: ReactNode | String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusRippleColor: String = null,
    focusRippleOpacity: Int | Double = null,
    href: String = null,
    icon: ReactNode = null,
    keyboardFocused: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null,
    onActive: /* tab */ Tab => Unit = null,
    onBlur: FocusEventHandler[js.Object] = null,
    onClick: MouseEventHandler[js.Object] = null,
    onFocus: FocusEventHandler[js.Object] = null,
    onKeyDown: KeyboardEventHandler[js.Object] = null,
    onKeyUp: KeyboardEventHandler[js.Object] = null,
    onKeyboardFocus: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    target: String = null,
    touchRippleColor: String = null,
    touchRippleOpacity: Int | Double = null,
    `type`: String = null,
    value: js.Any = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle)
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (className != null) __obj.updateDynamic("className")(className)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor)
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onActive != null) __obj.updateDynamic("onActive")(js.Any.fromFunction1(onActive))
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor)
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TabProps]
  }
}

