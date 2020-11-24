package typings.highcharts.drilldownMod.highchartsAugmentingMod

import typings.highcharts.mod.Point
import typings.highcharts.mod.SeriesOptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart extends js.Object {
  
  /**
    * Add a series to the chart as drilldown from a specific point in the
    * parent series. This method is used for async drilldown, when clicking
    * a point in a series should result in loading and displaying a more
    * high-resolution series. When not async, the setup is simpler using
    * the drilldown.series options structure.
    *
    * @param point
    *        The point from which the drilldown will start.
    *
    * @param options
    *        The series options for the new, detailed series.
    */
  def addSeriesAsDrilldown(point: Point, options: SeriesOptionsType): Unit = js.native
  
  /**
    * When the chart is drilled down to a child series, calling
    * `chart.drillUp()` will drill up to the parent series.
    */
  def drillUp(): Unit = js.native
}
object Chart {
  
  @scala.inline
  def apply(addSeriesAsDrilldown: (Point, SeriesOptionsType) => Unit, drillUp: () => Unit): Chart = {
    val __obj = js.Dynamic.literal(addSeriesAsDrilldown = js.Any.fromFunction2(addSeriesAsDrilldown), drillUp = js.Any.fromFunction0(drillUp))
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
    def setAddSeriesAsDrilldown(value: (Point, SeriesOptionsType) => Unit): Self = this.set("addSeriesAsDrilldown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDrillUp(value: () => Unit): Self = this.set("drillUp", js.Any.fromFunction0(value))
  }
}
