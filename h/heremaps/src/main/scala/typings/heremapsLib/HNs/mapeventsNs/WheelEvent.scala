package typings
package heremapsLib.HNs.mapeventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WheelEvent is fired when the mouse wheel is used over the map. It contains information about cursor position and the map object which resides directly under the cursor.
  * @property delta {number} - Wheel move delta
  * @property viewportX {number} - Map viewport x position
  * @property viewportY {number} - Map viewport y position
  * @property target {(H.map.Object | H.Map)} - Target for the event
  * @property originalEvent {Event} - Original mouse wheel event
  * @property currentTarget {(H.map.Object | H.Map)} - Object which has listener attached
  * @property type {string} - Name of the dispatched event
  * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
  */
@JSGlobal("H.mapevents.WheelEvent")
@js.native
class WheelEvent protected ()
  extends heremapsLib.HNs.utilNs.Event {
  /**
    * Constructor
    * @param deltaY {number} - The wheel move delta on y-axis
    * @param viewportX {number} - The x coordinate on the viewport
    * @param viewportY {number} - The y coordinate on the viewport
    * @param target {(H.Map | H.map.Object)} - The event's target element
    * @param originalEvent {Event} - target of the event
    */
  def this(deltaY: scala.Double, viewportX: scala.Double, viewportY: scala.Double, target: heremapsLib.HNs.Map, originalEvent: Event) = this()
  def this(deltaY: scala.Double, viewportX: scala.Double, viewportY: scala.Double, target: heremapsLib.HNs.mapNs.Object, originalEvent: Event) = this()
  var delta: scala.Double = js.native
  var originalEvent: Event = js.native
  var viewportX: scala.Double = js.native
  var viewportY: scala.Double = js.native
}

