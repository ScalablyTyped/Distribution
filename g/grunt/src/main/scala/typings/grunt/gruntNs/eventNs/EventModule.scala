package typings.grunt.gruntNs.eventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/hij1nx/EventEmitter2}
  */
trait EventModule extends js.Object {
  /**
    * Adds a listener to the end of the listeners array for the specified event.
    */
  def addListener(event: java.lang.String, listener: js.Function): EventModule
  /**
    * Execute each of the listeners that may be listening for the specified event name
    * in order with the list of arguments.
    */
  def emit(event: java.lang.String, args: js.Any*): js.Any
  /**
    * Returns an array of listeners for the specified event.
    * This array can be manipulated, e.g. to remove listeners.
    */
  def listeners(event: java.lang.String): js.Array[js.Function]
  /**
    * Returns an array of listeners that are listening for any event that is specified.
    * This array can be manipulated, e.g. to remove listeners.
    */
  def listenersAny(): js.Array[js.Function]
  /**
    * Adds a listener that will execute n times for the event before being removed.
    * The listener is invoked only the first time the event is fired, after which it is removed.
    */
  def many(event: java.lang.String, timesToListen: Double, listener: js.Function): EventModule
  def off(event: java.lang.String, listener: js.Function): EventModule
  /**
    * Removes the listener that will be fired when any event is emitted.
    */
  def offAny(listener: js.Function): EventModule
  def on(event: java.lang.String, listener: js.Function): EventModule
  /**
    * Adds a listener that will be fired when any event is emitted.
    */
  def onAny(listener: js.Function): EventModule
  /**
    * Adds a one time listener for the event.
    * The listener is invoked only the first time the event is fired, after which it is removed.
    */
  def once(event: java.lang.String, listener: js.Function): EventModule
  /**
    * Removes all listeners, or those of the specified event.
    */
  def removeAllListeners(event: java.lang.String): EventModule
  /**
    * Remove a listener from the listener array for the specified event.
    * Caution: changes array indices in the listener array behind the listener.
    */
  def removeListener(event: java.lang.String, listener: js.Function): EventModule
  /**
    * By default EventEmitters will print a warning if more than 10 listeners are added to it.
    * This is a useful default which helps finding memory leaks. Obviously not all Emitters
    * should be limited to 10. This function allows that to be increased.
    *
    * Set to zero for unlimited.
    */
  def setMaxListener(n: Double): Unit
}

object EventModule {
  @scala.inline
  def apply(
    addListener: (java.lang.String, js.Function) => EventModule,
    emit: (java.lang.String, /* repeated */ js.Any) => js.Any,
    listeners: java.lang.String => js.Array[js.Function],
    listenersAny: () => js.Array[js.Function],
    many: (java.lang.String, Double, js.Function) => EventModule,
    off: (java.lang.String, js.Function) => EventModule,
    offAny: js.Function => EventModule,
    on: (java.lang.String, js.Function) => EventModule,
    onAny: js.Function => EventModule,
    once: (java.lang.String, js.Function) => EventModule,
    removeAllListeners: java.lang.String => EventModule,
    removeListener: (java.lang.String, js.Function) => EventModule,
    setMaxListener: Double => Unit
  ): EventModule = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), listeners = js.Any.fromFunction1(listeners), listenersAny = js.Any.fromFunction0(listenersAny), many = js.Any.fromFunction3(many), off = js.Any.fromFunction2(off), offAny = js.Any.fromFunction1(offAny), on = js.Any.fromFunction2(on), onAny = js.Any.fromFunction1(onAny), once = js.Any.fromFunction2(once), removeAllListeners = js.Any.fromFunction1(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), setMaxListener = js.Any.fromFunction1(setMaxListener))
  
    __obj.asInstanceOf[EventModule]
  }
}

