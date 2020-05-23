package typings.heremaps.H.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base Event class which is used for all events dispatched by any EventTarget within the api.
  * @property target {*} - Object which triggered the event
  * @property currentTarget {*} - Object which has listener attached
  * @property type {string} - Name of the dispatched event
  * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
  */
trait Event extends js.Object {
  var currentTarget: js.Any
  var defaultPrevented: Boolean
  var target: js.Any
  var `type`: String
  /**
    * Sets defaultPrevented to true. Which can be used to prevent some default behavior.
    */
  def preventDefault(): Unit
  /**
    * Stops propagation for current event.
    */
  def stopPropagation(): Unit
}

object Event {
  @scala.inline
  def apply(
    currentTarget: js.Any,
    defaultPrevented: Boolean,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: js.Any,
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

