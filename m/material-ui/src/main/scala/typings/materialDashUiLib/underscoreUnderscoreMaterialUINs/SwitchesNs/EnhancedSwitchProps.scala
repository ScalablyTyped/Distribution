package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.SwitchesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhancedSwitchProps extends CommonEnhancedSwitchProps[EnhancedSwitch] {
  var defaultSwitched: js.UndefOr[scala.Boolean] = js.undefined
  var disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined
  var iconStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var inputStyle: reactLib.reactMod.CSSProperties
  var inputType: java.lang.String
  var labelPosition: js.UndefOr[java.lang.String] = js.undefined
   // oneOf(['left', 'right'])
  var labelStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var onSwitch: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* isInputChecked */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var rippleColor: js.UndefOr[java.lang.String] = js.undefined
  var rippleStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var switchElement: reactLib.reactMod.ReactElement[_]
  var switched: scala.Boolean
  var thumbStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var trackStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  @JSName("value")
  var value_EnhancedSwitchProps: js.UndefOr[java.lang.String] = js.undefined
  def onParentShouldUpdate(isInputChecked: scala.Boolean): scala.Unit
}

object EnhancedSwitchProps {
  @scala.inline
  def apply(
    inputStyle: reactLib.reactMod.CSSProperties,
    inputType: java.lang.String,
    onParentShouldUpdate: scala.Boolean => scala.Unit,
    switchElement: reactLib.reactMod.ReactElement[_],
    switched: scala.Boolean,
    CommonEnhancedSwitchProps: CommonEnhancedSwitchProps[EnhancedSwitch] = null,
    className: java.lang.String = null,
    defaultSwitched: js.UndefOr[scala.Boolean] = js.undefined,
    disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    iconStyle: reactLib.reactMod.CSSProperties = null,
    id: java.lang.String = null,
    labelPosition: java.lang.String = null,
    labelStyle: reactLib.reactMod.CSSProperties = null,
    name: java.lang.String = null,
    onBlur: reactLib.reactMod.FocusEventHandler[js.Object] = null,
    onFocus: reactLib.reactMod.FocusEventHandler[js.Object] = null,
    onMouseDown: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onMouseLeave: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onMouseUp: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onSwitch: (/* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], /* isInputChecked */ scala.Boolean) => scala.Unit = null,
    onTouchEnd: reactLib.reactMod.TouchEventHandler[js.Object] = null,
    onTouchStart: reactLib.reactMod.TouchEventHandler[js.Object] = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    rippleColor: java.lang.String = null,
    rippleStyle: reactLib.reactMod.CSSProperties = null,
    style: reactLib.reactMod.CSSProperties = null,
    thumbStyle: reactLib.reactMod.CSSProperties = null,
    trackStyle: reactLib.reactMod.CSSProperties = null,
    value: java.lang.String = null
  ): EnhancedSwitchProps = {
    val __obj = js.Dynamic.literal(inputStyle = inputStyle, inputType = inputType, onParentShouldUpdate = js.Any.fromFunction1(onParentShouldUpdate), switchElement = switchElement, switched = switched)
    js.Dynamic.global.Object.assign(__obj, CommonEnhancedSwitchProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultSwitched)) __obj.updateDynamic("defaultSwitched")(defaultSwitched)
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (id != null) __obj.updateDynamic("id")(id)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onSwitch != null) __obj.updateDynamic("onSwitch")(js.Any.fromFunction2(onSwitch))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor)
    if (rippleStyle != null) __obj.updateDynamic("rippleStyle")(rippleStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle)
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EnhancedSwitchProps]
  }
}

