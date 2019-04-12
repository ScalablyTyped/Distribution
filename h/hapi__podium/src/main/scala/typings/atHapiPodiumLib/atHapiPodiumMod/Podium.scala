package typings
package atHapiPodiumLib.atHapiPodiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Podium
  extends atHapiPodiumLib.atHapiPodiumMod.PodiumNs._Events
     with /**
  * Creates a new podium emitter
  * @param events  if present, the value is passed to podium.registerEvent().
  */
org.scalablytyped.runtime.Instantiable0[Podium]
     with org.scalablytyped.runtime.Instantiable1[
      (/* events */ js.Array[atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Events]) | (/* events */ atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Events), 
      Podium
    ] {
  def addListener(
    criteria: atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Criteria,
    listener: atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Listener
  ): scala.Unit = js.native
  /**
    * podium.addListener(criteria, listener)
    * Same as podium.on()
    * @param criteria  the subscription criteria
    * @param listener  the handler method set to receive event updates. The function signature depends on the block, spread, and tags options.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumoncriteria-listener}
    */
  def addListener(criteria: java.lang.String, listener: atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Listener): scala.Unit = js.native
  def emit(criteria: atHapiPodiumLib.Anon_Channel, data: js.Any): scala.Unit = js.native
  def emit(criteria: atHapiPodiumLib.Anon_Channel, data: js.Any, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * podium.emit(criteria, data, [callback])
    * Emits an event update to all the subscribed listeners
    * @param criteria  the event update criteria
    * @param data  the value emitted to the subscribers.
    * @param callback  an optional callback method invoked when all subscribers have been notified using the signature function()
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumemitcriteria-data-callback}
    */
  def emit(criteria: java.lang.String, data: js.Any): scala.Unit = js.native
  def emit(criteria: java.lang.String, data: js.Any, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * podium.hasListeners(name)
    * Returns whether an event has any listeners subscribed
    * @param name  the event name string.
    * Returns true if the event name has any listeners, otherwise false.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumhaslistenersname}
    */
  def hasListeners(name: java.lang.String): scala.Boolean = js.native
  def on(
    criteria: atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Criteria,
    listener: atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Listener
  ): scala.Unit = js.native
  /**
    * podium.on(criteria, listener)
    * Subscribe a handler to an event
    * @param criteria  the subscription criteria
    * @param listener  the handler method set to receive event updates. The function signature depends on the block, spread, and tags options.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumoncriteria-listener}
    */
  def on(criteria: java.lang.String, listener: atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Listener): scala.Unit = js.native
  def once(
    criteria: atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Criteria,
    listener: atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Listener
  ): scala.Unit = js.native
  /**
    * podium.once(criteria, listener)
    * Same as podium.on() with the count option set to 1.
    * @param criteria  the subscription criteria
    * @param listener  the handler method set to receive event updates. The function signature depends on the block, spread, and tags options.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumoncriteria-listener}
    */
  def once(criteria: java.lang.String, listener: atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Listener): scala.Unit = js.native
  def registerEvent(events: atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Events): scala.Unit = js.native
  /**
    * podium.registerEvent(events)
    * Register the specified events and their optional configuration. Events must be registered before they can be emitted or subscribed to. This is done to detect event name mispelling and invalid event activities.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumregistereventevents}
    */
  def registerEvent(events: js.Array[atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Events]): scala.Unit = js.native
  def registerPodium(podiums: Podium): scala.Unit = js.native
  /**
    * podium.registerPodium(podiums)
    * Registers another emitter as an event source for the current emitter (any event update emitted by the source emitter is passed to any subscriber of the current emitter)
    * Note that any events registered with a source emitter are automatically added to the current emitter. If the events are already registered, they are left as-is.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumregisterpodiumpodiums}
    */
  def registerPodium(podiums: js.Array[Podium]): scala.Unit = js.native
  /**
    * podium.removeAllListeners(name)
    * Removes all listeners subscribed to a given event name
    * @param name  the event name string.
    * Returns a reference to the current emitter.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumremovealllistenersname}
    */
  def removeAllListeners(name: java.lang.String): Podium = js.native
  /**
    * podium.removeListener(name, listener)
    * Removes all listeners subscribed to a given event name matching the provided listener method where:
    * @param name  the event name string.
    * @param listener  the function reference provided when subscribed.
    * Returns a reference to the current emitter.
    * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumremovelistenername-listener}
    */
  def removeListener(name: java.lang.String, listener: atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Listener): Podium = js.native
}

