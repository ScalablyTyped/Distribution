package typings.highcharts.highchartsMod

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
    index: Int | Double = null,
    period: Int | Double = null,
    periodSenkouSpanB: Int | Double = null,
    periodTenkan: Int | Double = null
  ): PlotIkhParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (periodSenkouSpanB != null) __obj.updateDynamic("periodSenkouSpanB")(periodSenkouSpanB.asInstanceOf[js.Any])
    if (periodTenkan != null) __obj.updateDynamic("periodTenkan")(periodTenkan.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotIkhParamsOptions]
  }
}

