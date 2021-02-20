package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.MapsEventListener
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object event {
  
  /**
    * Cross browser event handler registration. This listener is removed by
    * calling removeListener(handle) for the handle that is returned by this
    * function.
    */
  @JSGlobal("google.maps.event.addDomListener")
  @js.native
  def addDomListener(instance: js.Object, eventName: String, handler: js.Function1[/* event */ Event, Unit]): MapsEventListener = js.native
  @JSGlobal("google.maps.event.addDomListener")
  @js.native
  def addDomListener(
    instance: js.Object,
    eventName: String,
    handler: js.Function1[/* event */ Event, Unit],
    capture: Boolean
  ): MapsEventListener = js.native
  
  /**
    * Wrapper around addDomListener that removes the listener after the first
    * event.
    */
  @JSGlobal("google.maps.event.addDomListenerOnce")
  @js.native
  def addDomListenerOnce(instance: js.Object, eventName: String, handler: js.Function1[/* event */ Event, Unit]): MapsEventListener = js.native
  @JSGlobal("google.maps.event.addDomListenerOnce")
  @js.native
  def addDomListenerOnce(
    instance: js.Object,
    eventName: String,
    handler: js.Function1[/* event */ Event, Unit],
    capture: Boolean
  ): MapsEventListener = js.native
  
  /**
    * Adds the given listener function to the given event name for the given
    * object instance. Returns an identifier for this listener that can be used
    * with removeListener().
    */
  @JSGlobal("google.maps.event.addListener")
  @js.native
  def addListener(instance: js.Object, eventName: String, handler: js.Function1[/* repeated */ js.Any, Unit]): MapsEventListener = js.native
  
  /**
    * Like addListener, but the handler removes itself after handling the first
    * event.
    */
  @JSGlobal("google.maps.event.addListenerOnce")
  @js.native
  def addListenerOnce(instance: js.Object, eventName: String, handler: js.Function1[/* repeated */ js.Any, Unit]): MapsEventListener = js.native
  
  /**
    * Removes all listeners for all events for the given instance.
    */
  @JSGlobal("google.maps.event.clearInstanceListeners")
  @js.native
  def clearInstanceListeners(instance: js.Object): Unit = js.native
  
  /**
    * Removes all listeners for the given event for the given instance.
    */
  @JSGlobal("google.maps.event.clearListeners")
  @js.native
  def clearListeners(instance: js.Object, eventName: String): Unit = js.native
  
  /**
    * Removes the given listener, which should have been returned by
    * addListener above. Equivalent to calling listener.remove().
    */
  @JSGlobal("google.maps.event.removeListener")
  @js.native
  def removeListener(listener: MapsEventListener): Unit = js.native
  
  /**
    * Triggers the given event. All arguments after eventName are passed as
    * arguments to the listeners.
    */
  @JSGlobal("google.maps.event.trigger")
  @js.native
  def trigger(instance: js.Any, eventName: String, args: js.Any*): Unit = js.native
}
