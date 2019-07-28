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
    delayOut: Int | Double = null,
    durationIn: Int | Double = null,
    durationOut: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    formatter: /* int */ Double => String = null,
    range: Boolean | JQRangeSliderRangeLength = null,
    scales: js.Array[jQRangeSliderScale] = null,
    step: Int | Double = null,
    symmetricPositionning: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    valueLabels: String = null,
    wheelMode: String = null,
    wheelSpeed: Int | Double = null
  ): JQEditRangeSliderOptions = {
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
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (valueLabels != null) __obj.updateDynamic("valueLabels")(valueLabels)
    if (wheelMode != null) __obj.updateDynamic("wheelMode")(wheelMode)
    if (wheelSpeed != null) __obj.updateDynamic("wheelSpeed")(wheelSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQEditRangeSliderOptions]
  }
}

