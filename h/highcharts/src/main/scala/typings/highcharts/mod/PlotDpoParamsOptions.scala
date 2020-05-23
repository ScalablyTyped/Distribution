package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotDpoParamsOptions extends js.Object {
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Period for Detrended Price Oscillator
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotDpoParamsOptions {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, period: js.UndefOr[Double] = js.undefined): PlotDpoParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotDpoParamsOptions]
  }
}

