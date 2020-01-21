package typings.highcharts.drilldownMod.highchartsAugmentingMod

import typings.highcharts.mod.Point
import typings.highcharts.mod.SeriesOptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def addSeriesAsDrilldown(point: Point, options: SeriesOptionsType): Unit
  /**
    * When the chart is drilled down to a child series, calling
    * `chart.drillUp()` will drill up to the parent series.
    */
  def drillUp(): Unit
}

object Chart {
  @scala.inline
  def apply(addSeriesAsDrilldown: (Point, SeriesOptionsType) => Unit, drillUp: () => Unit): Chart = {
    val __obj = js.Dynamic.literal(addSeriesAsDrilldown = js.Any.fromFunction2(addSeriesAsDrilldown), drillUp = js.Any.fromFunction0(drillUp))
  
    __obj.asInstanceOf[Chart]
  }
}

