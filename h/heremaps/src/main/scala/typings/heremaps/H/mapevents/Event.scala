package typings.heremaps.H.mapevents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom map event. Contains list of pointers on the map, list of changed pointers and original event. Inherits from H.util.Event.
  * @property pointers {Array<H.mapevents.Pointer>} - Pointers which are currently on the screen
  * @property changedPointers {Array<H.mapevents.Pointer>} - Pointers which has changed in course of event
  * @property targetPointers {Array<H.mapevents.Pointer>} - Pointers which are on same target as the current pointer
  * @property currentPointer {H.mapevents.Pointer} - Current pointer
  * @property originalEvent {Event} - Original event fired by the browser
  * @property target {(H.map.Object | H.Map)} - Object which triggered event. Can be the map object (i.e marker or polyline) or the map itself
  * @property currentTarget {(H.map.Object | H.Map)} - Object which has listener attached
  * @property type {string} - Name of the dispatched event
  * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
  */
trait Event
  extends typings.heremaps.H.util.Event {
  var changedPointers: js.Array[Pointer]
  var currentPointer: Pointer
  var originalEvent: Event
  var pointers: js.Array[Pointer]
  var targetPointers: js.Array[Pointer]
}

object Event {
  @scala.inline
  def apply(
    changedPointers: js.Array[Pointer],
    currentPointer: Pointer,
    currentTarget: js.Any,
    defaultPrevented: Boolean,
    originalEvent: Event,
    pointers: js.Array[Pointer],
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: js.Any,
    targetPointers: js.Array[Pointer],
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(changedPointers = changedPointers.asInstanceOf[js.Any], currentPointer = currentPointer.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], targetPointers = targetPointers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

