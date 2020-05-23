package typings.jqrangeslider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQEditRangeSliderOptions extends JQNumericRangeSliderOptions {
  var `type`: js.UndefOr[String] = js.undefined
}

object JQEditRangeSliderOptions {
  @scala.inline
  def apply(
    arrows: js.UndefOr[Boolean] = js.undefined,
    bounds: JQRangeSliderNumericRange = null,
    defaultValues: JQRangeSliderNumericRange = null,
    delayOut: js.UndefOr[Double] = js.undefined,
    durationIn: js.UndefOr[Double] = js.undefined,
    durationOut: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    formatter: /* int */ Double => String = null,
    range: Boolean | JQRangeSliderRangeLength = null,
    scales: js.Array[jQRangeSliderScale] = null,
    step: js.UndefOr[Double] = js.undefined,
    symmetricPositionning: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    valueLabels: String = null,
    wheelMode: String = null,
    wheelSpeed: js.UndefOr[Double] = js.undefined
  ): JQEditRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows.get.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (defaultValues != null) __obj.updateDynamic("defaultValues")(defaultValues.asInstanceOf[js.Any])
    if (!js.isUndefined(delayOut)) __obj.updateDynamic("delayOut")(delayOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(durationIn)) __obj.updateDynamic("durationIn")(durationIn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(durationOut)) __obj.updateDynamic("durationOut")(durationOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (scales != null) __obj.updateDynamic("scales")(scales.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(symmetricPositionning)) __obj.updateDynamic("symmetricPositionning")(symmetricPositionning.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueLabels != null) __obj.updateDynamic("valueLabels")(valueLabels.asInstanceOf[js.Any])
    if (wheelMode != null) __obj.updateDynamic("wheelMode")(wheelMode.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelSpeed)) __obj.updateDynamic("wheelSpeed")(wheelSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQEditRangeSliderOptions]
  }
}

