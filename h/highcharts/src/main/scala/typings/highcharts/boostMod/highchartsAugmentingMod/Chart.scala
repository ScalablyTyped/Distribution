package typings.highcharts.boostMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart extends js.Object {
  
  /**
    * Returns true if the chart is in series boost mode.
    *
    * @param chart
    *        the chart to check
    *
    * @return true if the chart is in series boost mode
    */
  def isChartSeriesBoosting(chart: Chart): Boolean = js.native
}
object Chart {
  
  @scala.inline
  def apply(isChartSeriesBoosting: Chart => Boolean): Chart = {
    val __obj = js.Dynamic.literal(isChartSeriesBoosting = js.Any.fromFunction1(isChartSeriesBoosting))
    __obj.asInstanceOf[Chart]
  }
  
  @scala.inline
  implicit class ChartOps[Self <: Chart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsChartSeriesBoosting(value: Chart => Boolean): Self = this.set("isChartSeriesBoosting", js.Any.fromFunction1(value))
  }
}
