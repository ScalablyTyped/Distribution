package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPcParamsOptions extends js.Object {
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotPcParamsOptions {
  @scala.inline
  def apply(period: js.UndefOr[Double] = js.undefined): PlotPcParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPcParamsOptions]
  }
}

