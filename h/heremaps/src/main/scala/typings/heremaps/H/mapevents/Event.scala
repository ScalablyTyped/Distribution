package typings.heremaps.H.mapevents

import typings.heremaps.H.Map_
import typings.heremaps.H.map.Object
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
@JSGlobal("H.mapevents.Event")
@js.native
class Event protected ()
  extends typings.heremaps.H.util.Event {
  /**
    * Constructor
    * @param type {string} - type of event
    * @param pointers {Array<H.mapevents.Pointer>} - pointers which are currently on the screen
    * @param changedPointers {Array<H.mapevents.Pointer>} - pointers which changed during event
    * @param targetPointers {Array<H.mapevents.Pointer>} - pointers on the event target
    * @param currentPointer {H.mapevents.Pointer} - pointer which triggered the event
    * @param target {(H.Map | H.map.Object)} - target map object which triggered event
    * @param originalEvent {Event} - original dom event
    */
  def this(
    `type`: String,
    pointers: js.Array[Pointer],
    changedPointers: js.Array[Pointer],
    targetPointers: js.Array[Pointer],
    currentPointer: Pointer,
    target: Map_,
    originalEvent: Event
  ) = this()
  def this(
    `type`: String,
    pointers: js.Array[Pointer],
    changedPointers: js.Array[Pointer],
    targetPointers: js.Array[Pointer],
    currentPointer: Pointer,
    target: Object,
    originalEvent: Event
  ) = this()
  var changedPointers: js.Array[Pointer] = js.native
  var currentPointer: Pointer = js.native
  var originalEvent: Event = js.native
  var pointers: js.Array[Pointer] = js.native
  var targetPointers: js.Array[Pointer] = js.native
}

