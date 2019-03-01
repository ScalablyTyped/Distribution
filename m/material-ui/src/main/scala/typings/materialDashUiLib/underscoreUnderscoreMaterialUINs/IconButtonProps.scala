package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- materialDashUiLib.underscoreUnderscoreMaterialUINs.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp, style, tabIndex. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ trait IconButtonProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[js.Object] {
  var centerRipple: js.UndefOr[scala.Boolean] = js.undefined
  var containerElement: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | java.lang.String] = js.undefined
  var disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disableKeyboardFocus: js.UndefOr[scala.Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var focusRippleColor: js.UndefOr[java.lang.String] = js.undefined
  var focusRippleOpacity: js.UndefOr[scala.Double] = js.undefined
  var hoveredStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var iconClassName: js.UndefOr[java.lang.String] = js.undefined
  var iconStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var keyboardFocused: js.UndefOr[scala.Boolean] = js.undefined
  var onKeyboardFocus: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.FocusEvent[js.Object], 
      /* isKeyboardFocused */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | java.lang.String] = js.undefined
  var tooltipPosition: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.cornersAndCenter] = js.undefined
  var tooltipStyles: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var touch: js.UndefOr[scala.Boolean] = js.undefined
  var touchRippleColor: js.UndefOr[java.lang.String] = js.undefined
  var touchRippleOpacity: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IconButtonProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[js.Object] = null,
    SharedEnhancedButtonProps: SharedEnhancedButtonProps[IconButton] = null,
    className: java.lang.String = null,
    disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    hoveredStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    iconClassName: java.lang.String = null,
    iconStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    onBlur: reactLib.reactMod.ReactNs.FocusEventHandler[js.Object] = null,
    onFocus: reactLib.reactMod.ReactNs.FocusEventHandler[js.Object] = null,
    onKeyboardFocus: js.Function2[
      /* e */ reactLib.reactMod.ReactNs.FocusEvent[js.Object], 
      /* isKeyboardFocused */ scala.Boolean, 
      scala.Unit
    ] = null,
    onMouseEnter: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onMouseLeave: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onMouseOut: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tooltip: reactLib.reactMod.ReactNs.ReactNode | java.lang.String = null,
    tooltipPosition: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.cornersAndCenter = null,
    tooltipStyles: reactLib.reactMod.ReactNs.CSSProperties = null,
    touch: js.UndefOr[scala.Boolean] = js.undefined
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
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(onKeyboardFocus)
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

