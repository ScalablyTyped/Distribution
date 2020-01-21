package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotRsiParamsOptions extends js.Object {
  /**
    * (Highstock) Number of maximum decimals that are used in RSI calculations.
    */
  var decimals: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotRsiParamsOptions {
  @scala.inline
  def apply(decimals: Int | Double = null, period: Int | Double = null): PlotRsiParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotRsiParamsOptions]
  }
}

