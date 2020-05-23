package typings.highcharts.mod

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
  def apply(period: js.UndefOr[Double] = js.undefined): PlotAroonParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAroonParamsOptions]
  }
}

