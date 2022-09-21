package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Evented")
@js.native
open class Evented () extends StObject {
  
  var _eventedParent: Evented = js.native
  
  var _eventedParentData: Any | js.Function0[Any] = js.native
  
  var _listeners: Listeners = js.native
  
  var _oneTimeListeners: Listeners = js.native
  
  def fire(event: String): this.type = js.native
  def fire(event: String, properties: Any): this.type = js.native
  def fire(event: Event): this.type = js.native
  def fire(event: Event, properties: Any): this.type = js.native
  
  /**
  	 * Returns a true if this instance of Evented or any forwardeed instances of Evented have a listener for the specified type.
  	 *
  	 * @param {string} type The event type
  	 * @returns {boolean} `true` if there is at least one registered listener for specified event type, `false` otherwise
  	 * @private
  	 */
  def listens(`type`: String): Any = js.native
  
  /**
  	 * Removes a previously registered event listener.
  	 *
  	 * @param {string} type The event type to remove listeners for.
  	 * @param {Function} listener The listener function to remove.
  	 * @returns {Object} `this`
  	 */
  def off(`type`: String, listener: Listener): this.type = js.native
  
  /**
  	 * Adds a listener to a specified event type.
  	 *
  	 * @param {string} type The event type to add a listen for.
  	 * @param {Function} listener The function to be called when the event is fired.
  	 *   The listener function is called with the data object passed to `fire`,
  	 *   extended with `target` and `type` properties.
  	 * @returns {Object} `this`
  	 */
  def on(`type`: String, listener: Listener): this.type = js.native
  
  /**
  	 * Adds a listener that will be called only once to a specified event type.
  	 *
  	 * The listener will be called first time the event fires after the listener is registered.
  	 *
  	 * @param {string} type The event type to listen for.
  	 * @param {Function} listener The function to be called when the event is fired the first time.
  	 * @returns {Object} `this`
  	 */
  def once(`type`: String, listener: Listener): this.type = js.native
  
  /**
  	 * Bubble all events fired by this instance of Evented to this parent instance of Evented.
  	 *
  	 * @private
  	 * @returns {Object} `this`
  	 * @private
  	 */
  def setEventedParent(): this.type = js.native
  def setEventedParent(parent: Null, data: js.Function0[Any]): this.type = js.native
  def setEventedParent(parent: Null, data: Any): this.type = js.native
  def setEventedParent(parent: scala.Unit, data: js.Function0[Any]): this.type = js.native
  def setEventedParent(parent: scala.Unit, data: Any): this.type = js.native
  def setEventedParent(parent: Evented): this.type = js.native
  def setEventedParent(parent: Evented, data: js.Function0[Any]): this.type = js.native
  def setEventedParent(parent: Evented, data: Any): this.type = js.native
}
