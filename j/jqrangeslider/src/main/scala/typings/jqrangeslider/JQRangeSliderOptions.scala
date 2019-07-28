package typings.jqrangeslider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQRangeSliderOptions extends js.Object {
   // speed of the wheel scrolling
  var arrows: js.UndefOr[Boolean] = js.undefined
   // fade out length when displaying value labels (only when valueLabels = "change")
  var delayOut: js.UndefOr[Double] = js.undefined
   // when to show value labels: "show" (always), "hide" (never) and "change" (only if slider changed)
  var durationIn: js.UndefOr[Double] = js.undefined
   // fade in length when displaying value labels (only when valueLabels = "change")
  var durationOut: js.UndefOr[Double] = js.undefined
   // show handles and make them clearly select the range. Warning: must be used with 'minimum' and must not be used with 'scale'
  var enabled: js.UndefOr[Boolean] = js.undefined
   // duration labels are shown after the user changed its values (only when valueLabels = "change")
  var range: js.UndefOr[Boolean | JQRangeSliderRangeLength] = js.undefined
   // configure a read-only slider
  var scales: js.UndefOr[js.Array[jQRangeSliderScale]] = js.undefined
   // lets you specify minimum and/or maximum range length
  var symmetricPositionning: js.UndefOr[Boolean] = js.undefined
   // hide the arrows or not
  var valueLabels: js.UndefOr[String] = js.undefined
  var wheelMode: js.UndefOr[String] = js.undefined
   // function of the wheel, "zoom", "scroll" or null
  var wheelSpeed: js.UndefOr[Double] = js.undefined
}

object JQRangeSliderOptions {
  @scala.inline
  def apply(
    arrows: js.UndefOr[Boolean] = js.undefined,
    delayOut: Int | Double = null,
    durationIn: Int | Double = null,
    durationOut: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    range: Boolean | JQRangeSliderRangeLength = null,
    scales: js.Array[jQRangeSliderScale] = null,
    symmetricPositionning: js.UndefOr[Boolean] = js.undefined,
    valueLabels: String = null,
    wheelMode: String = null,
    wheelSpeed: Int | Double = null
  ): JQRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows)
    if (delayOut != null) __obj.updateDynamic("delayOut")(delayOut.asInstanceOf[js.Any])
    if (durationIn != null) __obj.updateDynamic("durationIn")(durationIn.asInstanceOf[js.Any])
    if (durationOut != null) __obj.updateDynamic("durationOut")(durationOut.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (scales != null) __obj.updateDynamic("scales")(scales)
    if (!js.isUndefined(symmetricPositionning)) __obj.updateDynamic("symmetricPositionning")(symmetricPositionning)
    if (valueLabels != null) __obj.updateDynamic("valueLabels")(valueLabels)
    if (wheelMode != null) __obj.updateDynamic("wheelMode")(wheelMode)
    if (wheelSpeed != null) __obj.updateDynamic("wheelSpeed")(wheelSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQRangeSliderOptions]
  }
}

