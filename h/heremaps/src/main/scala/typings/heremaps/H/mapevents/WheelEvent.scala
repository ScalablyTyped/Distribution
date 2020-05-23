package typings.heremaps.H.mapevents

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
trait WheelEvent
  extends typings.heremaps.H.util.Event {
  var delta: Double
  var originalEvent: Event
  var viewportX: Double
  var viewportY: Double
}

object WheelEvent {
  @scala.inline
  def apply(
    currentTarget: js.Any,
    defaultPrevented: Boolean,
    delta: Double,
    originalEvent: Event,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: js.Any,
    `type`: String,
    viewportX: Double,
    viewportY: Double
  ): WheelEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], viewportX = viewportX.asInstanceOf[js.Any], viewportY = viewportY.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelEvent]
  }
}

