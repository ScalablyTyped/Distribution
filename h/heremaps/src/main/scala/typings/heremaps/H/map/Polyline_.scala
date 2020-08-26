package typings.heremaps.H.map

import typings.heremaps.H.geo.LineString
import typings.heremaps.H.geo.MultiLineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a polyline in geo-space. It is defined by a path containing the vertices of a polyline (lat, lng, alt values) and a pen to use when tracing the path on the map.
  */
@js.native
trait Polyline_ extends GeoShape {
  /**
    * This method adds a listener for a specific event.
    * Note that to prevent potential memory leaks, you must either call removeEventListener or dispose on the given object when you no longer need it.
    * @param type {string} - The name of the event
    * @param handler {function()} - An event handler function
    * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
    * @param opt_scope {{}=} - An object defining the scope for the handler function
    */
  def addEventListener(`type`: String, handler: js.Function0[Unit]): Unit = js.native
  def addEventListener(
    `type`: String,
    handler: js.Function0[Unit],
    opt_capture: js.UndefOr[scala.Nothing],
    opt_scope: js.Object
  ): Unit = js.native
  def addEventListener(`type`: String, handler: js.Function0[Unit], opt_capture: Boolean): Unit = js.native
  def addEventListener(`type`: String, handler: js.Function0[Unit], opt_capture: Boolean, opt_scope: js.Object): Unit = js.native
  /**
    * Clips the geometry of the Polyline to a rectangular area
    * @param geoRect {H.geo.Rect} - The rectangle to clip against.
    * @returns {Array<Array<number>>} - a list of geometry segments that intersecting the given rectangle.
    * Each segment is represented as a list of alternating latitude and longitude coordinates that describes a line string.
    */
  def clip(geoRect: typings.heremaps.H.geo.Rect): js.Array[js.Array[Double]] = js.native
  /**
    * This method compares the rendering z-order of the given object with another object. (The 'given object' mean the object on which the method has been invoke.)
    * @param other {H.map.Object} -The map object with which to compare the given object.
    * @return {number} - A value lower than 0 indicates that the given object has a lower z-order. 0 indicates that both objects have the same z-order.
    * A value greater than 0, indicates that the given object has a higher z-order.
    */
  def compareZOrder(other: Object): Double = js.native
  /**
    * Returns the smallest rectangle which encloses the whole geometry of the GeoShape.
    * @return {H.geo.Rect}
    */
  def getBounds(): typings.heremaps.H.geo.Rect = js.native
  /**
    * To obtain the polyline's geometry. If you modify the obtained geometry, you must call setGeometry(geometry) afterwards to not violate the integrity of the polyline.
    * @return {H.geo.LineString | H.geo.MultiLineString}
    */
  def getGeometry(): LineString | MultiLineString = js.native
  /**
    * This method removes a previously added listener from the EventTarget instance.
    * @param type {string} - The name of the event
    * @param handler {function()} - An event handler function
    * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
    * @param opt_scope {{}=} - An object defining the scope for the handler function
    */
  def removeEventListener(`type`: String, handler: js.Function0[Unit]): Unit = js.native
  def removeEventListener(
    `type`: String,
    handler: js.Function0[Unit],
    opt_capture: js.UndefOr[scala.Nothing],
    opt_scope: js.Object
  ): Unit = js.native
  def removeEventListener(`type`: String, handler: js.Function0[Unit], opt_capture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, handler: js.Function0[Unit], opt_capture: Boolean, opt_scope: js.Object): Unit = js.native
  /**
    * To set the polyline's geometry. If the given geometry is modified afterwards, it must be set again via setGeometry(geometry) to not violate the integrity of the polyline.
    * @param geometry {H.geo.LineString | H.geo.MultiLineString} - the geometry to set.
    * @return {H.map.Polyline} - The polyline instance itself.
    */
  def setGeometry(geometry: LineString): Polyline = js.native
  def setGeometry(geometry: MultiLineString): Polyline = js.native
}

