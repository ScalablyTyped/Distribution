package typings.heremaps.H.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event indicates a change. It contains the old and the new value.
  * @property target {*} - Object which triggered the event
  * @property currentTarget {*} - Object which has listener attached
  * @property type {string} - Name of the dispatched event
  * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
  */
@js.native
trait ChangeEvent extends Event

object ChangeEvent {
  @scala.inline
  def apply(
    currentTarget: js.Any,
    defaultPrevented: Boolean,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: js.Any,
    `type`: String
  ): ChangeEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
}

