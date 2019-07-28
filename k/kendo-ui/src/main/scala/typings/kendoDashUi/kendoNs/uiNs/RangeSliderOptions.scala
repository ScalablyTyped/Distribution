package typings.kendoDashUi.kendoNs.uiNs

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
    largeStep: Int | Double = null,
    leftDragHandleTitle: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    orientation: String = null,
    rightDragHandleTitle: String = null,
    selectionEnd: Int | Double = null,
    selectionStart: Int | Double = null,
    slide: /* e */ RangeSliderSlideEvent => Unit = null,
    smallStep: Int | Double = null,
    tickPlacement: String = null,
    tooltip: RangeSliderTooltip = null
  ): RangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (largeStep != null) __obj.updateDynamic("largeStep")(largeStep.asInstanceOf[js.Any])
    if (leftDragHandleTitle != null) __obj.updateDynamic("leftDragHandleTitle")(leftDragHandleTitle)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (rightDragHandleTitle != null) __obj.updateDynamic("rightDragHandleTitle")(rightDragHandleTitle)
    if (selectionEnd != null) __obj.updateDynamic("selectionEnd")(selectionEnd.asInstanceOf[js.Any])
    if (selectionStart != null) __obj.updateDynamic("selectionStart")(selectionStart.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction1(slide))
    if (smallStep != null) __obj.updateDynamic("smallStep")(smallStep.asInstanceOf[js.Any])
    if (tickPlacement != null) __obj.updateDynamic("tickPlacement")(tickPlacement)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[RangeSliderOptions]
  }
}

