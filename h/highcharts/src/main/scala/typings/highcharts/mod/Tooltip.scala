package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts", "Tooltip")
@js.native
class Tooltip protected () extends js.Object {
  /**
    * Tooltip of a chart.
    *
    * @param chart
    *        The chart instance.
    *
    * @param options
    *        Tooltip options.
    */
  def this(chart: Chart_, options: TooltipOptions) = this()
  /**
    * Chart of the tooltip.
    */
  val chart: Chart_ = js.native
  /**
    * Reference to the tooltip's container, when [Highcharts.Tooltip#outside]
    * is set to true, otherwise it's undefined.
    */
  var container: js.UndefOr[HTMLDOMElement] = js.native
  /**
    * Used tooltip options.
    */
  val options: TooltipOptions = js.native
  /**
    * Whether to allow the tooltip to render outside the chart's SVG element
    * box. By default (false), the tooltip is rendered within the chart's SVG
    * element, which results in the tooltip being aligned inside the chart
    * area.
    */
  val outside: Boolean = js.native
  /**
    * Reference to the tooltip's renderer, when [Highcharts.Tooltip#outside] is
    * set to true, otherwise it's undefined.
    */
  var renderer: js.UndefOr[SVGRenderer] = js.native
  /**
    * When the tooltip is shared, the entire plot area will capture mouse
    * movement or touch events.
    */
  val shared: js.UndefOr[Boolean] = js.native
  /**
    * True, if the tooltip is split into one label per series, with the header
    * close to the axis.
    */
  val split: js.UndefOr[Boolean] = js.native
  /**
    * In case no user defined formatter is given, this will be used. Note that
    * the context here is an object holding point, series, x, y etc.
    */
  def defaultFormatter(tooltip: Tooltip): js.Array[String] = js.native
  /**
    * Removes and destroys the tooltip and its elements.
    */
  def destroy(): Unit = js.native
  /**
    * Creates the Tooltip label element if it does not exist, then returns it.
    */
  def getLabel(): SVGElement = js.native
  /**
    * Hides the tooltip with a fade out animation.
    *
    * @param delay
    *        The fade out in milliseconds. If no value is provided the value of
    *        the tooltip.hideDelay option is used. A value of 0 disables the
    *        fade out animation.
    */
  def hide(): Unit = js.native
  def hide(delay: Double): Unit = js.native
  def refresh(pointOrPoints: js.Array[Point]): Unit = js.native
  def refresh(pointOrPoints: js.Array[Point], mouseEvent: PointerEventObject): Unit = js.native
  /**
    * Refresh the tooltip's text and position.
    *
    * @param pointOrPoints
    *        Either a point or an array of points.
    *
    * @param mouseEvent
    *        Mouse event, that is responsible for the refresh and should be
    *        used for the tooltip update.
    */
  def refresh(pointOrPoints: Point): Unit = js.native
  def refresh(pointOrPoints: Point, mouseEvent: PointerEventObject): Unit = js.native
  /**
    * Updates the tooltip with the provided tooltip options.
    *
    * @param options
    *        The tooltip options to update.
    */
  def update(options: TooltipOptions): Unit = js.native
}

