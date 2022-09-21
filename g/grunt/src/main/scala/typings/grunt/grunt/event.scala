package typings.grunt.grunt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object event {
  
  /**
    * {@link https://github.com/hij1nx/EventEmitter2}
    */
  trait EventModule extends StObject {
    
    /**
      * Adds a listener to the end of the listeners array for the specified event.
      */
    def addListener(event: String, listener: js.Function): EventModule
    
    /**
      * Execute each of the listeners that may be listening for the specified event name
      * in order with the list of arguments.
      */
    def emit(event: String, args: Any*): Any
    
    /**
      * Returns an array of listeners for the specified event.
      * This array can be manipulated, e.g. to remove listeners.
      */
    def listeners(event: String): js.Array[js.Function]
    
    /**
      * Returns an array of listeners that are listening for any event that is specified.
      * This array can be manipulated, e.g. to remove listeners.
      */
    def listenersAny(): js.Array[js.Function]
    
    /**
      * Adds a listener that will execute n times for the event before being removed.
      * The listener is invoked only the first time the event is fired, after which it is removed.
      */
    def many(event: String, timesToListen: Double, listener: js.Function): EventModule
    
    def off(event: String, listener: js.Function): EventModule
    
    /**
      * Removes the listener that will be fired when any event is emitted.
      */
    def offAny(listener: js.Function): EventModule
    
    def on(event: String, listener: js.Function): EventModule
    
    /**
      * Adds a listener that will be fired when any event is emitted.
      */
    def onAny(listener: js.Function): EventModule
    
    /**
      * Adds a one time listener for the event.
      * The listener is invoked only the first time the event is fired, after which it is removed.
      */
    def once(event: String, listener: js.Function): EventModule
    
    /**
      * Removes all listeners, or those of the specified event.
      */
    def removeAllListeners(event: String): EventModule
    
    /**
      * Remove a listener from the listener array for the specified event.
      * Caution: changes array indices in the listener array behind the listener.
      */
    def removeListener(event: String, listener: js.Function): EventModule
    
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
    
    inline def apply(
      addListener: (String, js.Function) => EventModule,
      emit: (String, /* repeated */ Any) => Any,
      listeners: String => js.Array[js.Function],
      listenersAny: () => js.Array[js.Function],
      many: (String, Double, js.Function) => EventModule,
      off: (String, js.Function) => EventModule,
      offAny: js.Function => EventModule,
      on: (String, js.Function) => EventModule,
      onAny: js.Function => EventModule,
      once: (String, js.Function) => EventModule,
      removeAllListeners: String => EventModule,
      removeListener: (String, js.Function) => EventModule,
      setMaxListener: Double => Unit
    ): EventModule = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), listeners = js.Any.fromFunction1(listeners), listenersAny = js.Any.fromFunction0(listenersAny), many = js.Any.fromFunction3(many), off = js.Any.fromFunction2(off), offAny = js.Any.fromFunction1(offAny), on = js.Any.fromFunction2(on), onAny = js.Any.fromFunction1(onAny), once = js.Any.fromFunction2(once), removeAllListeners = js.Any.fromFunction1(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), setMaxListener = js.Any.fromFunction1(setMaxListener))
      __obj.asInstanceOf[EventModule]
    }
    
    extension [Self <: EventModule](x: Self) {
      
      inline def setAddListener(value: (String, js.Function) => EventModule): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setEmit(value: (String, /* repeated */ Any) => Any): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setListeners(value: String => js.Array[js.Function]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
      
      inline def setListenersAny(value: () => js.Array[js.Function]): Self = StObject.set(x, "listenersAny", js.Any.fromFunction0(value))
      
      inline def setMany(value: (String, Double, js.Function) => EventModule): Self = StObject.set(x, "many", js.Any.fromFunction3(value))
      
      inline def setOff(value: (String, js.Function) => EventModule): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOffAny(value: js.Function => EventModule): Self = StObject.set(x, "offAny", js.Any.fromFunction1(value))
      
      inline def setOn(value: (String, js.Function) => EventModule): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnAny(value: js.Function => EventModule): Self = StObject.set(x, "onAny", js.Any.fromFunction1(value))
      
      inline def setOnce(value: (String, js.Function) => EventModule): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      inline def setRemoveAllListeners(value: String => EventModule): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction1(value))
      
      inline def setRemoveListener(value: (String, js.Function) => EventModule): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
      
      inline def setSetMaxListener(value: Double => Unit): Self = StObject.set(x, "setMaxListener", js.Any.fromFunction1(value))
    }
  }
}
