package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPriceenvelopesParamsOptions extends js.Object {
  /**
    * (Highstock) Percentage below the moving average that should be displayed.
    * 0.1 means 90%. Relative to the calculated value.
    */
  var bottomBand: js.UndefOr[Double] = js.undefined
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
    * (Highstock) Percentage above the moving average that should be displayed.
    * 0.1 means 110%. Relative to the calculated value.
    */
  var topBand: js.UndefOr[Double] = js.undefined
}

object PlotPriceenvelopesParamsOptions {
  @scala.inline
  def apply(
    bottomBand: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    period: js.UndefOr[Double] = js.undefined,
    topBand: js.UndefOr[Double] = js.undefined
  ): PlotPriceenvelopesParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottomBand)) __obj.updateDynamic("bottomBand")(bottomBand.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topBand)) __obj.updateDynamic("topBand")(topBand.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPriceenvelopesParamsOptions]
  }
}

