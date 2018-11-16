package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Circle")
@js.native
class Circle () extends MVCObject {
  /**
       * Create a circle using the passed CircleOptions, which specify the
       * center, radius, and style.
       */
  def this(opts: CircleOptions) = this()
  /** Gets the LatLngBounds of this Circle. */
  def getBounds(): LatLngBounds = js.native
  /** Returns the center of this circle. */
  def getCenter(): LatLng = js.native
  /** Returns whether this circle can be dragged by the user. */
  def getDraggable(): scala.Boolean = js.native
  /** Returns whether this circle can be edited by the user. */
  def getEditable(): scala.Boolean = js.native
  /** Returns the map on which this circle is displayed. */
  def getMap(): Map = js.native
  /** Returns the radius of this circle (in meters). */
  def getRadius(): scala.Double = js.native
  /** Returns whether this circle is visible on the map. */
  def getVisible(): scala.Boolean = js.native
  /** Sets the center of this circle. */
  def setCenter(center: LatLng): scala.Unit = js.native
  /** Sets the center of this circle. */
  def setCenter(center: LatLngLiteral): scala.Unit = js.native
  /** If set to true, the user can drag this circle over the map. */
  def setDraggable(draggable: scala.Boolean): scala.Unit = js.native
  /**
       * If set to true, the user can edit this circle by dragging the control
       * points shown at the center and around the circumference of the circle.
       */
  def setEditable(editable: scala.Boolean): scala.Unit = js.native
  /**
       * Renders the circle on the specified map. If map is set to null, the
       * circle will be removed.
       */
  def setMap(): scala.Unit = js.native
  /**
       * Renders the circle on the specified map. If map is set to null, the
       * circle will be removed.
       */
  def setMap(map: Map): scala.Unit = js.native
  def setOptions(options: CircleOptions): scala.Unit = js.native
  /** Sets the radius of this circle (in meters). */
  def setRadius(radius: scala.Double): scala.Unit = js.native
  /** Hides this circle if set to false. */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
}

