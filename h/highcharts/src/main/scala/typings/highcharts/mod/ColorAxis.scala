package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts", "ColorAxis")
@js.native
class ColorAxis protected () extends js.Object {
  /**
    * The ColorAxis object for inclusion in gradient legends.
    *
    * @param chart
    *        The related chart of the color axis.
    *
    * @param userOptions
    *        The color axis options for initialization.
    */
  def this(chart: Chart_, userOptions: ColorAxisOptions) = this()
  /**
    * Internal function to draw a crosshair.
    *
    * @param e
    *        The event arguments from the modified pointer event, extended with
    *        `chartX` and `chartY`
    *
    * @param point
    *        The Point object if the crosshair snaps to points.
    *
    * @fires Highcharts.ColorAxis#afterDrawCrosshair
    * @fires Highcharts.ColorAxis#drawCrosshair
    */
  def drawCrosshair(): Unit = js.native
  def drawCrosshair(e: PointerEventObject): Unit = js.native
  def drawCrosshair(e: PointerEventObject, point: Point): Unit = js.native
  /**
    * Returns true if the series has points at all.
    *
    * @return True, if the series has points, otherwise false.
    */
  def hasData(): Boolean = js.native
  /**
    * Initializes the color axis.
    *
    * @param chart
    *        The related chart of the color axis.
    *
    * @param userOptions
    *        The color axis options for initialization.
    */
  def init(chart: Chart_, userOptions: ColorAxisOptions): Unit = js.native
  /**
    * Removes the color axis and the related legend item.
    *
    * @param redraw
    *        Whether to redraw the chart following the remove.
    */
  def remove(): Unit = js.native
  def remove(redraw: Boolean): Unit = js.native
  /**
    * Updates a color axis instance with a new set of options. The options are
    * merged with the existing options, so only new or altered options need to
    * be specified.
    *
    * @param newOptions
    *        The new options that will be merged in with existing options on
    *        the color axis.
    *
    * @param redraw
    *        Whether to redraw the chart after the color axis is altered. If
    *        doing more operations on the chart, it is a good idea to set
    *        redraw to `false` and call Highcharts.Chart#redraw after.
    */
  def update(newOptions: ColorAxisOptions): Unit = js.native
  def update(newOptions: ColorAxisOptions, redraw: Boolean): Unit = js.native
}

