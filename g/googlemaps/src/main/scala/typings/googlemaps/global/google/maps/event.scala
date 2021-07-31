package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.MapsEventListener
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object event {
  
  @JSGlobal("google.maps.event")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Cross browser event handler registration. This listener is removed by
    * calling removeListener(handle) for the handle that is returned by this
    * function.
    */
  @scala.inline
  def addDomListener(instance: js.Object, eventName: String, handler: js.Function1[/* event */ Event, Unit]): MapsEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addDomListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[MapsEventListener]
  @scala.inline
  def addDomListener(
    instance: js.Object,
    eventName: String,
    handler: js.Function1[/* event */ Event, Unit],
    capture: Boolean
  ): MapsEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addDomListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[MapsEventListener]
  
  /**
    * Wrapper around addDomListener that removes the listener after the first
    * event.
    */
  @scala.inline
  def addDomListenerOnce(instance: js.Object, eventName: String, handler: js.Function1[/* event */ Event, Unit]): MapsEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addDomListenerOnce")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[MapsEventListener]
  @scala.inline
  def addDomListenerOnce(
    instance: js.Object,
    eventName: String,
    handler: js.Function1[/* event */ Event, Unit],
    capture: Boolean
  ): MapsEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addDomListenerOnce")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[MapsEventListener]
  
  /**
    * Adds the given listener function to the given event name for the given
    * object instance. Returns an identifier for this listener that can be used
    * with removeListener().
    */
  @scala.inline
  def addListener(instance: js.Object, eventName: String, handler: js.Function1[/* repeated */ js.Any, Unit]): MapsEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[MapsEventListener]
  
  /**
    * Like addListener, but the handler removes itself after handling the first
    * event.
    */
  @scala.inline
  def addListenerOnce(instance: js.Object, eventName: String, handler: js.Function1[/* repeated */ js.Any, Unit]): MapsEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addListenerOnce")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[MapsEventListener]
  
  /**
    * Removes all listeners for all events for the given instance.
    */
  @scala.inline
  def clearInstanceListeners(instance: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInstanceListeners")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Removes all listeners for the given event for the given instance.
    */
  @scala.inline
  def clearListeners(instance: js.Object, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Removes the given listener, which should have been returned by
    * addListener above. Equivalent to calling listener.remove().
    */
  @scala.inline
  def removeListener(listener: MapsEventListener): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Triggers the given event. All arguments after eventName are passed as
    * arguments to the listeners.
    */
  @scala.inline
  def trigger(instance: js.Any, eventName: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
