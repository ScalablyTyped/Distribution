package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotKeltnerchannelsParamsOptions extends js.Object {
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The ATR multiplier.
    */
  var multiplierATR: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The ATR period.
    */
  var periodATR: js.UndefOr[Double] = js.undefined
}

object PlotKeltnerchannelsParamsOptions {
  @scala.inline
  def apply(
    index: Int | Double = null,
    multiplierATR: Int | Double = null,
    period: Int | Double = null,
    periodATR: Int | Double = null
  ): PlotKeltnerchannelsParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (multiplierATR != null) __obj.updateDynamic("multiplierATR")(multiplierATR.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (periodATR != null) __obj.updateDynamic("periodATR")(periodATR.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotKeltnerchannelsParamsOptions]
  }
}

