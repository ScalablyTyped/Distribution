package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAroonParamsOptions extends js.Object {
  /**
    * (Highstock) Period for Aroon indicator
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotAroonParamsOptions {
  @scala.inline
  def apply(period: Int | Double = null): PlotAroonParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAroonParamsOptions]
  }
}

