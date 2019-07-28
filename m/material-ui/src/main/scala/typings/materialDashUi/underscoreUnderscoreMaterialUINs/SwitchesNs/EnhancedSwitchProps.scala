package typings.materialDashUi.underscoreUnderscoreMaterialUINs.SwitchesNs

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactElement
import typings.react.reactMod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhancedSwitchProps extends CommonEnhancedSwitchProps[EnhancedSwitch] {
  var defaultSwitched: js.UndefOr[Boolean] = js.undefined
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[Boolean] = js.undefined
  var iconStyle: js.UndefOr[CSSProperties] = js.undefined
  var inputStyle: CSSProperties
  var inputType: String
  var labelPosition: js.UndefOr[String] = js.undefined
   // oneOf(['left', 'right'])
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  var onSwitch: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean, Unit]
  ] = js.undefined
  var rippleColor: js.UndefOr[String] = js.undefined
  var rippleStyle: js.UndefOr[CSSProperties] = js.undefined
  var switchElement: ReactElement
  var switched: Boolean
  var thumbStyle: js.UndefOr[CSSProperties] = js.undefined
  var trackStyle: js.UndefOr[CSSProperties] = js.undefined
  @JSName("value")
  var value_EnhancedSwitchProps: js.UndefOr[String] = js.undefined
  def onParentShouldUpdate(isInputChecked: Boolean): Unit
}

object EnhancedSwitchProps {
  @scala.inline
  def apply(
    inputStyle: CSSProperties,
    inputType: String,
    onParentShouldUpdate: Boolean => Unit,
    switchElement: ReactElement,
    switched: Boolean,
    CommonEnhancedSwitchProps: CommonEnhancedSwitchProps[EnhancedSwitch] = null,
    className: String = null,
    defaultSwitched: js.UndefOr[Boolean] = js.undefined,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    iconStyle: CSSProperties = null,
    id: String = null,
    labelPosition: String = null,
    labelStyle: CSSProperties = null,
    name: String = null,
    onBlur: FocusEventHandler[js.Object] = null,
    onFocus: FocusEventHandler[js.Object] = null,
    onMouseDown: MouseEventHandler[js.Object] = null,
    onMouseLeave: MouseEventHandler[js.Object] = null,
    onMouseUp: MouseEventHandler[js.Object] = null,
    onSwitch: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean) => Unit = null,
    onTouchEnd: TouchEventHandler[js.Object] = null,
    onTouchStart: TouchEventHandler[js.Object] = null,
    required: js.UndefOr[Boolean] = js.undefined,
    rippleColor: String = null,
    rippleStyle: CSSProperties = null,
    style: CSSProperties = null,
    thumbStyle: CSSProperties = null,
    trackStyle: CSSProperties = null,
    value: String = null
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

