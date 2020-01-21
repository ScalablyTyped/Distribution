package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPpoParamsOptions extends js.Object {
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    *
    * By default index value used to be set to 0. Since Highstock 7 by default
    * index is set to 3 which means that the ema indicator will be calculated
    * using Close values.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Periods for Percentage Price Oscillator calculations.
    */
  var periods: js.UndefOr[js.Array[Double]] = js.undefined
}

object PlotPpoParamsOptions {
  @scala.inline
  def apply(index: Int | Double = null, periods: js.Array[Double] = null): PlotPpoParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (periods != null) __obj.updateDynamic("periods")(periods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPpoParamsOptions]
  }
}

