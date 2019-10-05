package typings.materialDashUi.__MaterialUI

import typings.materialDashUi.materialDashUiStrings.`x-reverse`
import typings.materialDashUi.materialDashUiStrings.`y-reverse`
import typings.materialDashUi.materialDashUiStrings.x
import typings.materialDashUi.materialDashUiStrings.y
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  var axis: js.UndefOr[x | `x-reverse` | y | `y-reverse`] = js.undefined
  var defaultValue: js.UndefOr[Double] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* value */ Double, Unit]
  ] = js.undefined
  var onDragStart: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onDragStop: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var sliderStyle: js.UndefOr[CSSProperties] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    axis: x | `x-reverse` | y | `y-reverse` = null,
    defaultValue: Int | Double = null,
    description: String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    onBlur: FocusEvent[js.Object] => Unit = null,
    onChange: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* value */ Double) => Unit = null,
    onDragStart: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onDragStop: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onFocus: FocusEvent[js.Object] => Unit = null,
    required: js.UndefOr[Boolean] = js.undefined,
    sliderStyle: CSSProperties = null,
    step: Int | Double = null,
    style: CSSProperties = null,
    value: Int | Double = null
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
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction1(onDragStop))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (sliderStyle != null) __obj.updateDynamic("sliderStyle")(sliderStyle)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

