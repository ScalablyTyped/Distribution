package typings.heremaps.HNs.utilNs

import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EventTarget enabled listening and dispatching events on all instances and derived classes.
  */
@JSGlobal("H.util.EventTarget")
@js.native
/**
  * Constructor
  */
class EventTarget () extends js.Object {
  /**
    * This method allows to listen for specific event triggered by the object. Keep in mind, that you must removeEventListener manually or dispose an object when you no longer need it.
    * Otherwise memory leak is possible.
    * @param type {string} - name of event
    * @param handler {Function} - event handler function
    * @param opt_capture {boolean=} - if set to true will listen in the capture phase (bubble otherwise)
    * @param opt_scope {Object=} - scope for the handler function
    */
  def addEventListener(`type`: String, handler: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, handler: EventListenerOrEventListenerObject, opt_capture: Boolean): Unit = js.native
  def addEventListener(
    `type`: String,
    handler: EventListenerOrEventListenerObject,
    opt_capture: Boolean,
    opt_scope: js.Any
  ): Unit = js.native
  /**
    * This method adds callback which is triggered when the object is being disposed
    * @param callback {Function} - The callback function.
    * @param opt_scope {Object=} - An optional scope to call the callback in.
    */
  def addOnDisposeCallback(callback: js.Function0[Unit]): Unit = js.native
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Any): Unit = js.native
  def dispatchEvent(evt: String): Unit = js.native
  /**
    * This method will dispatch event on the event target object
    * @param evt {H.util.Event | string} - event object or event name
    */
  def dispatchEvent(evt: Event): Unit = js.native
  /**
    * Removes listeners from this object. Classes that extend EventTarget may need to override this method in order to remove references to DOM Elements and additional listeners.
    */
  def dispose(): Unit = js.native
  /**
    * This method will removed previously added listener from the event target
    * @param type {string} - name of event
    * @param handler {Function} - event handler function
    * @param opt_capture {boolean=} - if set to true will listen in the capture phase (bubble otherwise)
    * @param opt_scope {Object=} - scope for the handler function
    */
  def removeEventListener(`type`: String, handler: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(`type`: String, handler: EventListenerOrEventListenerObject, opt_capture: Boolean): Unit = js.native
  def removeEventListener(
    `type`: String,
    handler: EventListenerOrEventListenerObject,
    opt_capture: Boolean,
    opt_scope: js.Any
  ): Unit = js.native
}

