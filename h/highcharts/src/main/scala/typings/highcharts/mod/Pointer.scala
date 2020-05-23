package typings.highcharts.mod

import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts", "Pointer")
@js.native
class Pointer protected () extends js.Object {
  /**
    * The mouse and touch tracker object. Each Chart item has one assosiated
    * Pointer item that can be accessed from the Chart.pointer property.
    *
    * @param chart
    *        The chart instance.
    *
    * @param options
    *        The root options object. The pointer uses options from the chart
    *        and tooltip structures.
    */
  def this(chart: Chart_, options: Options) = this()
  /**
    * Destroys the Pointer object and disconnects DOM events.
    */
  def destroy(): Unit = js.native
  /**
    * Finds the closest point to a set of coordinates, using the k-d-tree
    * algorithm.
    *
    * @param series
    *        All the series to search in.
    *
    * @param shared
    *        Whether it is a shared tooltip or not.
    *
    * @param e
    *        The pointer event object, containing chart coordinates of the
    *        pointer.
    *
    * @return The point closest to given coordinates.
    */
  def findNearestKDPoints(series: js.Array[Series], shared: js.UndefOr[Boolean], e: PointerEventObject): js.UndefOr[Point] = js.native
  /**
    * Return the cached chartPosition if it is available on the Pointer,
    * otherwise find it. Running offset is quite expensive, so it should be
    * avoided when we know the chart hasn't moved.
    *
    * @return The offset of the chart container within the page
    */
  def getChartPosition(): OffsetObject = js.native
  /**
    * Get the click position in terms of axis values.
    *
    * @param e
    *        Pointer event, extended with `chartX` and `chartY` properties.
    */
  def getCoordinates(e: PointerEventObject): PointerAxisCoordinatesObject = js.native
  /**
    * Utility to detect whether an element has, or has a parent with, a
    * specificclass name. Used on detection of tracker objects and on deciding
    * whether hovering the tooltip should cause the active series to mouse out.
    *
    * @param element
    *        The element to investigate.
    *
    * @param className
    *        The class name to look for.
    *
    * @return True if either the element or one of its parents has the given
    *         class name.
    */
  def inClass(element: HTMLDOMElement, className: String): js.UndefOr[Boolean] = js.native
  def inClass(element: SVGDOMElement, className: String): js.UndefOr[Boolean] = js.native
  /**
    * Takes a browser event object and extends it with custom Highcharts
    * properties `chartX` and `chartY` in order to work on the internal
    * coordinate system.
    *
    * @param e
    *        Event object in standard browsers.
    *
    * @param chartPosition
    *        Additional chart offset.
    *
    * @return A browser event with extended properties `chartX` and `chartY`.
    */
  def normalize(e: MouseEvent): PointerEventObject = js.native
  def normalize(e: MouseEvent, chartPosition: OffsetObject): PointerEventObject = js.native
  def normalize(e: PointerEvent): PointerEventObject = js.native
  def normalize(e: PointerEvent, chartPosition: OffsetObject): PointerEventObject = js.native
  def normalize(e: TouchEvent): PointerEventObject = js.native
  def normalize(e: TouchEvent, chartPosition: OffsetObject): PointerEventObject = js.native
  /**
    * Reset the tracking by hiding the tooltip, the hover series state and the
    * hover point
    *
    * @param allowMove
    *        Instead of destroying the tooltip altogether, allow moving it if
    *        possible.
    */
  def reset(): Unit = js.native
  def reset(allowMove: Boolean): Unit = js.native
  def reset(allowMove: Boolean, delay: Double): Unit = js.native
}

