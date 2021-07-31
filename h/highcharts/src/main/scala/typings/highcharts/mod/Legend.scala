package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts", "Legend")
@js.native
class Legend protected () extends StObject {
  /**
    * The overview of the chart's series. The legend object is instanciated
    * internally in the chart constructor, and is available from the
    * `chart.legend` property. Each chart has only one legend.
    *
    * @param chart
    *        The chart instance.
    *
    * @param options
    *        Legend options.
    */
  def this(chart: Chart_, options: LegendOptions) = this()
  
  /**
    * All items for the legend, which is an array of series for most series and
    * an array of points for pie series and its derivatives.
    */
  val allItems: js.Array[Point | Series] = js.native
  
  /**
    * SVG element of the legend box.
    */
  val box: SVGElement = js.native
  
  /**
    * Chart of this legend.
    */
  val chart: Chart_ = js.native
  
  /**
    * SVG group of the legend.
    */
  val group: SVGElement = js.native
  
  /**
    * Legend options.
    */
  val options: LegendOptions = js.native
  
  /**
    * Set the legend item text.
    *
    * @param item
    *        The item for which to update the text in the legend.
    */
  def setText(item: Point): Unit = js.native
  def setText(item: Series): Unit = js.native
  
  /**
    * SVG element of the legend title.
    */
  val title: SVGElement = js.native
  
  /**
    * Update the legend with new options. Equivalent to running `chart.update`
    * with a legend configuration option.
    *
    * @param options
    *        Legend options.
    *
    * @param redraw
    *        Whether to redraw the chart after the axis is altered. If doing
    *        more operations on the chart, it is a good idea to set redraw to
    *        false and call Chart#redraw after. Whether to redraw the chart.
    *
    * @fires Highcharts.Legends#afterUpdate
    */
  def update(options: LegendOptions): Unit = js.native
  def update(options: LegendOptions, redraw: Boolean): Unit = js.native
}
