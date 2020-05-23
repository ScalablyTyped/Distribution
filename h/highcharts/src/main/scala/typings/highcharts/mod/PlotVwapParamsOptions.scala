package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVwapParamsOptions extends js.Object {
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
    * using OHLC and volume values.
    */
  var volumeSeriesID: js.UndefOr[String] = js.undefined
}

object PlotVwapParamsOptions {
  @scala.inline
  def apply(period: js.UndefOr[Double] = js.undefined, volumeSeriesID: String = null): PlotVwapParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (volumeSeriesID != null) __obj.updateDynamic("volumeSeriesID")(volumeSeriesID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVwapParamsOptions]
  }
}

