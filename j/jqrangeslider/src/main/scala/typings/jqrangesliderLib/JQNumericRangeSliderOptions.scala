package typings
package jqrangesliderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQNumericRangeSliderOptions extends JQRangeSliderOptions {
  var bounds: js.UndefOr[JQRangeSliderNumericRange] = js.undefined
   // min and max values of the slider
  var defaultValues: js.UndefOr[JQRangeSliderNumericRange] = js.undefined
   // values selected by default on construction
  var formatter: js.UndefOr[js.Function1[/* int */ scala.Double, java.lang.String]] = js.undefined
   // customize displayed label text
  var step: js.UndefOr[scala.Double] = js.undefined
}

object JQNumericRangeSliderOptions {
  @scala.inline
  def apply(
    arrows: js.UndefOr[scala.Boolean] = js.undefined,
    bounds: JQRangeSliderNumericRange = null,
    defaultValues: JQRangeSliderNumericRange = null,
    delayOut: scala.Int | scala.Double = null,
    durationIn: scala.Int | scala.Double = null,
    durationOut: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: /* int */ scala.Double => java.lang.String = null,
    range: scala.Boolean | JQRangeSliderRangeLength = null,
    scales: js.Array[jQRangeSliderScale] = null,
    step: scala.Int | scala.Double = null,
    symmetricPositionning: js.UndefOr[scala.Boolean] = js.undefined,
    valueLabels: java.lang.String = null,
    wheelMode: java.lang.String = null,
    wheelSpeed: scala.Int | scala.Double = null
  ): JQNumericRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (defaultValues != null) __obj.updateDynamic("defaultValues")(defaultValues)
    if (delayOut != null) __obj.updateDynamic("delayOut")(delayOut.asInstanceOf[js.Any])
    if (durationIn != null) __obj.updateDynamic("durationIn")(durationIn.asInstanceOf[js.Any])
    if (durationOut != null) __obj.updateDynamic("durationOut")(durationOut.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (scales != null) __obj.updateDynamic("scales")(scales)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(symmetricPositionning)) __obj.updateDynamic("symmetricPositionning")(symmetricPositionning)
    if (valueLabels != null) __obj.updateDynamic("valueLabels")(valueLabels)
    if (wheelMode != null) __obj.updateDynamic("wheelMode")(wheelMode)
    if (wheelSpeed != null) __obj.updateDynamic("wheelSpeed")(wheelSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQNumericRangeSliderOptions]
  }
}

