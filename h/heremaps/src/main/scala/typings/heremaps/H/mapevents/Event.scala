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
@js.native
trait Event
  extends typings.heremaps.H.util.Event {
  var changedPointers: js.Array[Pointer] = js.native
  var currentPointer: Pointer = js.native
  var originalEvent: Event = js.native
  var pointers: js.Array[Pointer] = js.native
  var targetPointers: js.Array[Pointer] = js.native
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
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangedPointersVarargs(value: Pointer*): Self = this.set("changedPointers", js.Array(value :_*))
    @scala.inline
    def setChangedPointers(value: js.Array[Pointer]): Self = this.set("changedPointers", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentPointer(value: Pointer): Self = this.set("currentPointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalEvent(value: Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointersVarargs(value: Pointer*): Self = this.set("pointers", js.Array(value :_*))
    @scala.inline
    def setPointers(value: js.Array[Pointer]): Self = this.set("pointers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetPointersVarargs(value: Pointer*): Self = this.set("targetPointers", js.Array(value :_*))
    @scala.inline
    def setTargetPointers(value: js.Array[Pointer]): Self = this.set("targetPointers", value.asInstanceOf[js.Any])
  }
  
}

