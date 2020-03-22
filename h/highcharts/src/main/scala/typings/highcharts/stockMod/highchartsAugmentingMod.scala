package typings.highcharts.stockMod

import typings.highcharts.mod.DataGroupingOptionsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("highcharts", JSImport.Namespace)
@js.native
object highchartsAugmentingMod extends js.Object {
  @js.native
  trait Axis extends js.Object {
    /**
      * Highstock only. Set the compare mode on all series belonging to an Y
      * axis after render time.
      *
      * @param compare
      *        The compare mode. Can be one of `null` (default), `"value"` or
      *        `"percent"`.
      *
      * @param redraw
      *        Whether to redraw the chart or to wait for a later call to
      *        Chart#redraw.
      */
    def setCompare(): Unit = js.native
    def setCompare(compare: String): Unit = js.native
    def setCompare(compare: String, redraw: Boolean): Unit = js.native
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
    def setDataGrouping(dataGrouping: DataGroupingOptionsObject): Unit = js.native
    def setDataGrouping(dataGrouping: DataGroupingOptionsObject, redraw: Boolean): Unit = js.native
  }
  
  @js.native
  trait Series extends js.Object {
    /**
      * Highstock only. Set the compare mode of the series after render time.
      * In most cases it is more useful running Axis#setCompare on the X axis
      * to update all its series.
      *
      * @param compare
      *        Can be one of `null` (default), `"percent"` or `"value"`.
      */
    def setCompare(): Unit = js.native
    def setCompare(compare: String): Unit = js.native
  }
  
}

