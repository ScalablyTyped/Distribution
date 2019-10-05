package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ SliderChangeEvent, Unit]] = js.undefined
  var decreaseButtonTitle: js.UndefOr[String] = js.undefined
  var dragHandleTitle: js.UndefOr[String] = js.undefined
  var increaseButtonTitle: js.UndefOr[String] = js.undefined
  var largeStep: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var showButtons: js.UndefOr[Boolean] = js.undefined
  var slide: js.UndefOr[js.Function1[/* e */ SliderSlideEvent, Unit]] = js.undefined
  var smallStep: js.UndefOr[Double] = js.undefined
  var tickPlacement: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[SliderTooltip] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object SliderOptions {
  @scala.inline
  def apply(
    change: /* e */ SliderChangeEvent => Unit = null,
    decreaseButtonTitle: String = null,
    dragHandleTitle: String = null,
    increaseButtonTitle: String = null,
    largeStep: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    orientation: String = null,
    showButtons: js.UndefOr[Boolean] = js.undefined,
    slide: /* e */ SliderSlideEvent => Unit = null,
    smallStep: Int | Double = null,
    tickPlacement: String = null,
    tooltip: SliderTooltip = null,
    value: Int | Double = null
  ): SliderOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (decreaseButtonTitle != null) __obj.updateDynamic("decreaseButtonTitle")(decreaseButtonTitle)
    if (dragHandleTitle != null) __obj.updateDynamic("dragHandleTitle")(dragHandleTitle)
    if (increaseButtonTitle != null) __obj.updateDynamic("increaseButtonTitle")(increaseButtonTitle)
    if (largeStep != null) __obj.updateDynamic("largeStep")(largeStep.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(showButtons)) __obj.updateDynamic("showButtons")(showButtons)
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction1(slide))
    if (smallStep != null) __obj.updateDynamic("smallStep")(smallStep.asInstanceOf[js.Any])
    if (tickPlacement != null) __obj.updateDynamic("tickPlacement")(tickPlacement)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderOptions]
  }
}

