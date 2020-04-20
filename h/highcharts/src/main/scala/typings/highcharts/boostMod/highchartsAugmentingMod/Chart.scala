package typings.highcharts.boostMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart extends js.Object {
  /**
    * Returns true if the chart is in series boost mode.
    *
    * @param chart
    *        the chart to check
    *
    * @return true if the chart is in series boost mode
    */
  def isChartSeriesBoosting(chart: Chart): Boolean
}

object Chart {
  @scala.inline
  def apply(isChartSeriesBoosting: Chart => Boolean): Chart = {
    val __obj = js.Dynamic.literal(isChartSeriesBoosting = js.Any.fromFunction1(isChartSeriesBoosting))
    __obj.asInstanceOf[Chart]
  }
}

