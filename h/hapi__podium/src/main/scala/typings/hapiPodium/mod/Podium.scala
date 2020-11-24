package typings.hapiPodium.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.hapiPodium.anon.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Podium
  extends _Events
     with /**
  * Creates a new podium emitter
  * @param events  if present, the value is passed to podium.registerEvent().
  */
Instantiable0[Podium]
     with Instantiable1[(/* events */ js.Array[Events]) | (/* events */ Events), Podium] {
  
  /**
    * podium.addListener(criteria, listener)
    * Same as podium.on()
    * @param criteria  the subscription criteria
    * @param listener  the handler method set to receive event updates. The function signature depends on the block, spread, and tags options.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumoncriteria-listener}
    */
  def addListener(criteria: String, listener: Listener): Unit = js.native
  def addListener(criteria: Criteria, listener: Listener): Unit = js.native
  
  /**
    * podium.emit(criteria, data, [callback])
    * Emits an event update to all the subscribed listeners
    * @param criteria  the event update criteria
    * @param data  the value emitted to the subscribers.
    * @param callback  an optional callback method invoked when all subscribers have been notified using the signature function()
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumemitcriteria-data-callback}
    */
  def emit(criteria: String, data: js.Any): Unit = js.native
  def emit(criteria: String, data: js.Any, callback: js.Function0[Unit]): Unit = js.native
  def emit(criteria: Channel, data: js.Any): Unit = js.native
  def emit(criteria: Channel, data: js.Any, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * podium.hasListeners(name)
    * Returns whether an event has any listeners subscribed
    * @param name  the event name string.
    * Returns true if the event name has any listeners, otherwise false.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumhaslistenersname}
    */
  def hasListeners(name: String): Boolean = js.native
  
  /**
    * podium.on(criteria, listener)
    * Subscribe a handler to an event
    * @param criteria  the subscription criteria
    * @param listener  the handler method set to receive event updates. The function signature depends on the block, spread, and tags options.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumoncriteria-listener}
    */
  def on(criteria: String, listener: Listener): Unit = js.native
  def on(criteria: Criteria, listener: Listener): Unit = js.native
  
  /**
    * podium.once(criteria, listener)
    * Same as podium.on() with the count option set to 1.
    * @param criteria  the subscription criteria
    * @param listener  the handler method set to receive event updates. The function signature depends on the block, spread, and tags options.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumoncriteria-listener}
    */
  def once(criteria: String, listener: Listener): Unit = js.native
  def once(criteria: Criteria, listener: Listener): Unit = js.native
  
  /**
    * podium.registerEvent(events)
    * Register the specified events and their optional configuration. Events must be registered before they can be emitted or subscribed to. This is done to detect event name mispelling and invalid event activities.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumregistereventevents}
    */
  def registerEvent(events: js.Array[Events]): Unit = js.native
  def registerEvent(events: Events): Unit = js.native
  
  /**
    * podium.registerPodium(podiums)
    * Registers another emitter as an event source for the current emitter (any event update emitted by the source emitter is passed to any subscriber of the current emitter)
    * Note that any events registered with a source emitter are automatically added to the current emitter. If the events are already registered, they are left as-is.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumregisterpodiumpodiums}
    */
  def registerPodium(podiums: js.Array[Podium]): Unit = js.native
  def registerPodium(podiums: Podium): Unit = js.native
  
  /**
    * podium.removeAllListeners(name)
    * Removes all listeners subscribed to a given event name
    * @param name  the event name string.
    * Returns a reference to the current emitter.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumremovealllistenersname}
    */
  def removeAllListeners(name: String): Podium = js.native
  
  /**
    * podium.removeListener(name, listener)
    * Removes all listeners subscribed to a given event name matching the provided listener method where:
    * @param name  the event name string.
    * @param listener  the function reference provided when subscribed.
    * Returns a reference to the current emitter.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumremovelistenername-listener}
    */
  def removeListener(name: String, listener: Listener): Podium = js.native
}
