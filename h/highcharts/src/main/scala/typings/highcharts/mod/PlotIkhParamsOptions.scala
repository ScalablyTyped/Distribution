package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotIkhParamsOptions extends js.Object {
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
  /**
    * (Highstock) The base period for Senkou Span B calculations
    */
  var periodSenkouSpanB: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The base period for Tenkan calculations.
    */
  var periodTenkan: js.UndefOr[Double] = js.undefined
}

object PlotIkhParamsOptions {
  @scala.inline
  def apply(
    index: js.UndefOr[Double] = js.undefined,
    period: js.UndefOr[Double] = js.undefined,
    periodSenkouSpanB: js.UndefOr[Double] = js.undefined,
    periodTenkan: js.UndefOr[Double] = js.undefined
  ): PlotIkhParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (!js.isUndefined(periodSenkouSpanB)) __obj.updateDynamic("periodSenkouSpanB")(periodSenkouSpanB.get.asInstanceOf[js.Any])
    if (!js.isUndefined(periodTenkan)) __obj.updateDynamic("periodTenkan")(periodTenkan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotIkhParamsOptions]
  }
}

