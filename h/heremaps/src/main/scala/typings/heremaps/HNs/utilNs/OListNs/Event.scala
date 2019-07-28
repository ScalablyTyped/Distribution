package typings.heremaps.HNs.utilNs.OListNs

import typings.heremaps.HNs.utilNs.OList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The event class for events that are dispatched by OList
  * @property target {*} - Object which triggered the event
  * @property currentTarget {*} - Object which has listener attached
  * @property type {string} - Name of the dispatched event
  * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
  */
@JSGlobal("H.util.OList.Event")
@js.native
class Event protected ()
  extends typings.heremaps.HNs.utilNs.Event {
  /**
    * Constructor
    * @param list {H.util.OList} - The OList instance which is emitting the event
    * @param type {H.util.OList.prototype.EventType} - The type of the event
    * @param idx {number} - The affected index within this list
    * @param added {?*} - The value of the entry which was added or set
    * @param removed {?*} - The value of the entry which was removed or replaced
    * @param moved {?*} - The value of the entry which was moved
    */
  def this(list: OList, `type`: String, idx: Double, added: js.Any, removed: js.Any, moved: js.Any) = this()
}

