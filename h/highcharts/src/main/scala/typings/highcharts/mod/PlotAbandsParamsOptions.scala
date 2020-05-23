package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAbandsParamsOptions extends js.Object {
  /**
    * (Highstock) The algorithms factor value used to calculate bands.
    */
  var factor: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotAbandsParamsOptions {
  @scala.inline
  def apply(
    factor: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    period: js.UndefOr[Double] = js.undefined
  ): PlotAbandsParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAbandsParamsOptions]
  }
}

