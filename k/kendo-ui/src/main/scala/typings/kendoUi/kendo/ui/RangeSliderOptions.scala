package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSliderOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ RangeSliderChangeEvent, Unit]] = js.undefined
  var largeStep: js.UndefOr[Double] = js.undefined
  var leftDragHandleTitle: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var rightDragHandleTitle: js.UndefOr[String] = js.undefined
  var selectionEnd: js.UndefOr[Double] = js.undefined
  var selectionStart: js.UndefOr[Double] = js.undefined
  var slide: js.UndefOr[js.Function1[/* e */ RangeSliderSlideEvent, Unit]] = js.undefined
  var smallStep: js.UndefOr[Double] = js.undefined
  var tickPlacement: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[RangeSliderTooltip] = js.undefined
}

object RangeSliderOptions {
  @scala.inline
  def apply(
    change: /* e */ RangeSliderChangeEvent => Unit = null,
    largeStep: js.UndefOr[Double] = js.undefined,
    leftDragHandleTitle: String = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    name: String = null,
    orientation: String = null,
    rightDragHandleTitle: String = null,
    selectionEnd: js.UndefOr[Double] = js.undefined,
    selectionStart: js.UndefOr[Double] = js.undefined,
    slide: /* e */ RangeSliderSlideEvent => Unit = null,
    smallStep: js.UndefOr[Double] = js.undefined,
    tickPlacement: String = null,
    tooltip: RangeSliderTooltip = null
  ): RangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(largeStep)) __obj.updateDynamic("largeStep")(largeStep.get.asInstanceOf[js.Any])
    if (leftDragHandleTitle != null) __obj.updateDynamic("leftDragHandleTitle")(leftDragHandleTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (rightDragHandleTitle != null) __obj.updateDynamic("rightDragHandleTitle")(rightDragHandleTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionEnd)) __obj.updateDynamic("selectionEnd")(selectionEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionStart)) __obj.updateDynamic("selectionStart")(selectionStart.get.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction1(slide))
    if (!js.isUndefined(smallStep)) __obj.updateDynamic("smallStep")(smallStep.get.asInstanceOf[js.Any])
    if (tickPlacement != null) __obj.updateDynamic("tickPlacement")(tickPlacement.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSliderOptions]
  }
}

