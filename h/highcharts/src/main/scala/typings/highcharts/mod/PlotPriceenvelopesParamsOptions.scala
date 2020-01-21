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
    bottomBand: Int | Double = null,
    index: Int | Double = null,
    period: Int | Double = null,
    topBand: Int | Double = null
  ): PlotPriceenvelopesParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (bottomBand != null) __obj.updateDynamic("bottomBand")(bottomBand.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (topBand != null) __obj.updateDynamic("topBand")(topBand.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPriceenvelopesParamsOptions]
  }
}

