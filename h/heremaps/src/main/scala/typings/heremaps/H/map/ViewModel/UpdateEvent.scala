package typings.heremaps.H.map.ViewModel

import typings.heremaps.H.util.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update event is fired whenever view model data is changed. It contains property which hold currently requested data
  * @fixme find documentation and update constructor typings
  * @property target {*} - Object which triggered the event
  * @property currentTarget {*} - Object which has listener attached
  * @property type {string} - Name of the dispatched event
  * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
  */
@js.native
trait UpdateEvent extends Event

object UpdateEvent {
  @scala.inline
  def apply(
    currentTarget: js.Any,
    defaultPrevented: Boolean,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: js.Any,
    `type`: String
  ): UpdateEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEvent]
  }
}

