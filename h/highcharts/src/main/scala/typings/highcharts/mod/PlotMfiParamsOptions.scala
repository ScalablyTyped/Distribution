package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMfiParamsOptions extends js.Object {
  /**
    * (Highstock) Number of maximum decimals that are used in MFI calculations.
    */
  var decimals: js.UndefOr[Double] = js.undefined
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

object PlotMfiParamsOptions {
  @scala.inline
  def apply(
    decimals: js.UndefOr[Double] = js.undefined,
    period: js.UndefOr[Double] = js.undefined,
    volumeSeriesID: String = null
  ): PlotMfiParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decimals)) __obj.updateDynamic("decimals")(decimals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (volumeSeriesID != null) __obj.updateDynamic("volumeSeriesID")(volumeSeriesID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMfiParamsOptions]
  }
}

