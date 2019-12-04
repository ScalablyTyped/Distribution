package typings.highcharts.modulesDatagroupingMod

import typings.highcharts.highchartsMod.PlotSeriesDataGroupingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("highcharts", JSImport.Namespace)
@js.native
object highchartsMod extends js.Object {
  @js.native
  trait Axis extends js.Object {
    /**
      * (Highstock) Highstock only. Force data grouping on all the axis'
      * series.
      *
      * @param dataGrouping
      *        A `dataGrouping` configuration. Use `false` to disable data
      *        grouping dynamically.
      *
      * @param redraw
      *        Whether to redraw the chart or wait for a later call to
      *        Chart#redraw.
      */
    def setDataGrouping(): Unit = js.native
    def setDataGrouping(dataGrouping: Boolean): Unit = js.native
    def setDataGrouping(dataGrouping: Boolean, redraw: Boolean): Unit = js.native
    def setDataGrouping(dataGrouping: PlotSeriesDataGroupingOptions): Unit = js.native
    def setDataGrouping(dataGrouping: PlotSeriesDataGroupingOptions, redraw: Boolean): Unit = js.native
  }
  
}

