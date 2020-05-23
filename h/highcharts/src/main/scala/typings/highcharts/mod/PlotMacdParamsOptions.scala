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
    index: js.UndefOr[Double] = js.undefined,
    longPeriod: js.UndefOr[Double] = js.undefined,
    period: js.UndefOr[Double] = js.undefined,
    shortPeriod: js.UndefOr[Double] = js.undefined,
    signalPeriod: js.UndefOr[Double] = js.undefined
  ): PlotMacdParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longPeriod)) __obj.updateDynamic("longPeriod")(longPeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shortPeriod)) __obj.updateDynamic("shortPeriod")(shortPeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(signalPeriod)) __obj.updateDynamic("signalPeriod")(signalPeriod.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMacdParamsOptions]
  }
}

