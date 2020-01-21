package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMacdParamsOptions extends js.Object {
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The long period for indicator calculations.
    */
  var longPeriod: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The short period for indicator calculations.
    */
  var shortPeriod: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The base period for signal calculations.
    */
  var signalPeriod: js.UndefOr[Double] = js.undefined
}

object PlotMacdParamsOptions {
  @scala.inline
  def apply(
    index: Int | Double = null,
    longPeriod: Int | Double = null,
    period: Int | Double = null,
    shortPeriod: Int | Double = null,
    signalPeriod: Int | Double = null
  ): PlotMacdParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (longPeriod != null) __obj.updateDynamic("longPeriod")(longPeriod.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (shortPeriod != null) __obj.updateDynamic("shortPeriod")(shortPeriod.asInstanceOf[js.Any])
    if (signalPeriod != null) __obj.updateDynamic("signalPeriod")(signalPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMacdParamsOptions]
  }
}

