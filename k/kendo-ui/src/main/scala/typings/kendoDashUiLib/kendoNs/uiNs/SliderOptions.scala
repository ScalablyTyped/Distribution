package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ SliderChangeEvent, scala.Unit]] = js.undefined
  var decreaseButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  var dragHandleTitle: js.UndefOr[java.lang.String] = js.undefined
  var increaseButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  var largeStep: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var showButtons: js.UndefOr[scala.Boolean] = js.undefined
  var slide: js.UndefOr[js.Function1[/* e */ SliderSlideEvent, scala.Unit]] = js.undefined
  var smallStep: js.UndefOr[scala.Double] = js.undefined
  var tickPlacement: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[SliderTooltip] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object SliderOptions {
  @scala.inline
  def apply(
    change: js.Function1[/* e */ SliderChangeEvent, scala.Unit] = null,
    decreaseButtonTitle: java.lang.String = null,
    dragHandleTitle: java.lang.String = null,
    increaseButtonTitle: java.lang.String = null,
    largeStep: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    orientation: java.lang.String = null,
    showButtons: js.UndefOr[scala.Boolean] = js.undefined,
    slide: js.Function1[/* e */ SliderSlideEvent, scala.Unit] = null,
    smallStep: scala.Int | scala.Double = null,
    tickPlacement: java.lang.String = null,
    tooltip: SliderTooltip = null,
    value: scala.Int | scala.Double = null
  ): SliderOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (decreaseButtonTitle != null) __obj.updateDynamic("decreaseButtonTitle")(decreaseButtonTitle)
    if (dragHandleTitle != null) __obj.updateDynamic("dragHandleTitle")(dragHandleTitle)
    if (increaseButtonTitle != null) __obj.updateDynamic("increaseButtonTitle")(increaseButtonTitle)
    if (largeStep != null) __obj.updateDynamic("largeStep")(largeStep.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(showButtons)) __obj.updateDynamic("showButtons")(showButtons)
    if (slide != null) __obj.updateDynamic("slide")(slide)
    if (smallStep != null) __obj.updateDynamic("smallStep")(smallStep.asInstanceOf[js.Any])
    if (tickPlacement != null) __obj.updateDynamic("tickPlacement")(tickPlacement)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderOptions]
  }
}

