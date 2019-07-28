package typings.materialDashUi.underscoreUnderscoreMaterialUINs

import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.cornersAndCenter
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.materialDashUi.underscoreUnderscoreMaterialUINs.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp, style, tabIndex. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ trait IconButtonProps
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
    SharedEnhancedButtonProps: SharedEnhancedButtonProps[IconButton] = null,
    className: String = null,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hoveredStyle: CSSProperties = null,
    iconClassName: String = null,
    iconStyle: CSSProperties = null,
    onBlur: FocusEventHandler[js.Object] = null,
    onFocus: FocusEventHandler[js.Object] = null,
    onKeyboardFocus: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    onMouseEnter: MouseEventHandler[js.Object] = null,
    onMouseLeave: MouseEventHandler[js.Object] = null,
    onMouseOut: MouseEventHandler[js.Object] = null,
    style: CSSProperties = null,
    tooltip: ReactNode | String = null,
    tooltipPosition: cornersAndCenter = null,
    tooltipStyles: CSSProperties = null,
    touch: js.UndefOr[Boolean] = js.undefined
  ): IconButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, SharedEnhancedButtonProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (hoveredStyle != null) __obj.updateDynamic("hoveredStyle")(hoveredStyle)
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition)
    if (tooltipStyles != null) __obj.updateDynamic("tooltipStyles")(tooltipStyles)
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch)
    __obj.asInstanceOf[IconButtonProps]
  }
}

