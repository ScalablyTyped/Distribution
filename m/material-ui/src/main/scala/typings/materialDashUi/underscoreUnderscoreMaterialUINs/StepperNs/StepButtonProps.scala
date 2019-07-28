package typings.materialDashUi.underscoreUnderscoreMaterialUINs.StepperNs

import typings.materialDashUi.underscoreUnderscoreMaterialUINs.SharedEnhancedButtonProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.react.reactMod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepButtonProps extends SharedEnhancedButtonProps[StepButton] {
  var active: js.UndefOr[Boolean] = js.undefined
  var completed: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[ReactNode | String | Double] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[js.Object]] = js.undefined
}

object StepButtonProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    completed: js.UndefOr[Boolean] = js.undefined,
    containerElement: ReactNode | String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusRippleColor: String = null,
    focusRippleOpacity: Int | Double = null,
    href: String = null,
    icon: ReactNode | String | Double = null,
    keyboardFocused: js.UndefOr[Boolean] = js.undefined,
    onBlur: FocusEventHandler[js.Object] = null,
    onClick: MouseEventHandler[js.Object] = null,
    onFocus: FocusEventHandler[js.Object] = null,
    onKeyDown: KeyboardEventHandler[js.Object] = null,
    onKeyUp: KeyboardEventHandler[js.Object] = null,
    onKeyboardFocus: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    onMouseEnter: MouseEventHandler[js.Object] = null,
    onMouseLeave: MouseEventHandler[js.Object] = null,
    onTouchStart: TouchEventHandler[js.Object] = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    target: String = null,
    touchRippleColor: String = null,
    touchRippleOpacity: Int | Double = null,
    `type`: String = null
  ): StepButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
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
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor)
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StepButtonProps]
  }
}

