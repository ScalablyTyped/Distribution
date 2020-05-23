package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVbpParamsOptions extends js.Object {
  /**
    * (Highstock) The number of price zones.
    */
  var ranges: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
    * using OHLC and volume values.
    */
  var volumeSeriesID: js.UndefOr[String] = js.undefined
}

object PlotVbpParamsOptions {
  @scala.inline
  def apply(ranges: js.UndefOr[Double] = js.undefined, volumeSeriesID: String = null): PlotVbpParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ranges)) __obj.updateDynamic("ranges")(ranges.get.asInstanceOf[js.Any])
    if (volumeSeriesID != null) __obj.updateDynamic("volumeSeriesID")(volumeSeriesID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVbpParamsOptions]
  }
}

