package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPivotpointsParamsOptions extends js.Object {
  /**
    * (Highstock) Algorithm used to calculate ressistance and support lines
    * based on pivot points. Implemented algorithms: `'standard'`,
    * `'fibonacci'` and `'camarilla'`
    */
  var algorithm: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotPivotpointsParamsOptions {
  @scala.inline
  def apply(algorithm: String = null, period: Int | Double = null): PlotPivotpointsParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPivotpointsParamsOptions]
  }
}

