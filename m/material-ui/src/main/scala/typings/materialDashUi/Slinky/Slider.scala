package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.materialDashUiStrings.`x-reverse`
import typings.materialDashUi.materialDashUiStrings.`y-reverse`
import typings.materialDashUi.materialDashUiStrings.x
import typings.materialDashUi.materialDashUiStrings.y
import typings.materialDashUi.sliderMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.SliderProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onBlur, name, style, onFocus, disabled, required */
object Slider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.sliderMod.default].asInstanceOf[String | js.Object]
  def apply(
    axis: x | `x-reverse` | y | `y-reverse` = null,
    defaultValue: Int | Double = null,
    description: String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* value */ Double) => Unit = null,
    onDragStart: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onDragStop: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    sliderStyle: CSSProperties = null,
    step: Int | Double = null,
    value: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (error != null) __obj.updateDynamic("error")(error)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction1(onDragStop))
    if (sliderStyle != null) __obj.updateDynamic("sliderStyle")(sliderStyle)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SliderProps
}

