package typings.materialDashUi.__MaterialUI

import typings.materialDashUi.__MaterialUI.propTypes.cornersAndCenter
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.materialDashUi.__MaterialUI.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp, style, tabIndex. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ trait IconButtonProps
  extends HTMLAttributes[js.Object] {
  var centerRipple: js.UndefOr[Boolean] = js.undefined
  var containerElement: js.UndefOr[ReactNode | String] = js.undefined
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  var disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var focusRippleColor: js.UndefOr[String] = js.undefined
  var focusRippleOpacity: js.UndefOr[Double] = js.undefined
  var hoveredStyle: js.UndefOr[CSSProperties] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var iconClassName: js.UndefOr[String] = js.undefined
  var iconStyle: js.UndefOr[CSSProperties] = js.undefined
  var keyboardFocused: js.UndefOr[Boolean] = js.undefined
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[ReactNode | String] = js.undefined
  var tooltipPosition: js.UndefOr[cornersAndCenter] = js.undefined
  var tooltipStyles: js.UndefOr[CSSProperties] = js.undefined
  var touch: js.UndefOr[Boolean] = js.undefined
  var touchRippleColor: js.UndefOr[String] = js.undefined
  var touchRippleOpacity: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object IconButtonProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[js.Object] = null,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    containerElement: ReactNode | String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusRippleColor: String = null,
    focusRippleOpacity: Int | Double = null,
    hoveredStyle: CSSProperties = null,
    href: String = null,
    iconClassName: String = null,
    iconStyle: CSSProperties = null,
    keyboardFocused: js.UndefOr[Boolean] = js.undefined,
    onBlur: FocusEvent[js.Object] => Unit = null,
    onFocus: FocusEvent[js.Object] => Unit = null,
    onKeyboardFocus: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    onMouseEnter: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    style: CSSProperties = null,
    target: String = null,
    tooltip: ReactNode | String = null,
    tooltipPosition: cornersAndCenter = null,
    tooltipStyles: CSSProperties = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    touchRippleColor: String = null,
    touchRippleOpacity: Int | Double = null,
    `type`: String = null
  ): IconButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (className != null) __obj.updateDynamic("className")(className)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor)
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (hoveredStyle != null) __obj.updateDynamic("hoveredStyle")(hoveredStyle)
    if (href != null) __obj.updateDynamic("href")(href)
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(target)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition)
    if (tooltipStyles != null) __obj.updateDynamic("tooltipStyles")(tooltipStyles)
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch)
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor)
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IconButtonProps]
  }
}

