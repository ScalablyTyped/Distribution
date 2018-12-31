package typings
package heremapsLib.HNs.utilNs

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
@JSGlobal("H.util.Event")
@js.native
class Event protected () extends js.Object {
  /**
    * Constructor
    * @param type {string} - Event Type.
    * @param opt_target {Object=} - Reference to the object that is the target of this event. It has to implement the {@link EventTargetInstance} interface.
    */
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, opt_target: js.Any) = this()
  var currentTarget: js.Any = js.native
  var defaultPrevented: scala.Boolean = js.native
  var target: js.Any = js.native
  var `type`: java.lang.String = js.native
  /**
    * Sets defaultPrevented to true. Which can be used to prevent some default behavior.
    */
  def preventDefault(): scala.Unit = js.native
  /**
    * Stops propagation for current event.
    */
  def stopPropagation(): scala.Unit = js.native
}

