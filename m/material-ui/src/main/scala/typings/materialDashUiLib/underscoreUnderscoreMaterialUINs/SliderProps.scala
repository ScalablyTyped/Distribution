package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  var axis: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.x | materialDashUiLib.materialDashUiLibStrings.`x-reverse` | materialDashUiLib.materialDashUiLibStrings.y | materialDashUiLib.materialDashUiLibStrings.`y-reverse`
  ] = js.undefined
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[js.Object]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* value */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var onDragStart: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[js.Object]] = js.undefined
  var onDragStop: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[js.Object]] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[js.Object]] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var sliderStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    axis: materialDashUiLib.materialDashUiLibStrings.x | materialDashUiLib.materialDashUiLibStrings.`x-reverse` | materialDashUiLib.materialDashUiLibStrings.y | materialDashUiLib.materialDashUiLibStrings.`y-reverse` = null,
    defaultValue: scala.Int | scala.Double = null,
    description: java.lang.String = null,
    disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onBlur: reactLib.reactMod.ReactNs.FocusEventHandler[js.Object] = null,
    onChange: js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* value */ scala.Double, 
      scala.Unit
    ] = null,
    onDragStart: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onDragStop: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onFocus: reactLib.reactMod.ReactNs.FocusEventHandler[js.Object] = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    sliderStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    step: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    value: scala.Int | scala.Double = null
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(onDragStop)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (sliderStyle != null) __obj.updateDynamic("sliderStyle")(sliderStyle)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

