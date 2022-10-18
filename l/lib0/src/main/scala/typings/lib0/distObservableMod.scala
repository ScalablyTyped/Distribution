package typings.lib0

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distObservableMod {
  
  @JSImport("lib0/dist/observable", "Observable")
  @js.native
  open class Observable[N] () extends StObject {
    
    /**
      * Some desc.
      * @type {Map<N, any>}
      */
    var _observers: Map[N, Any] = js.native
    
    def destroy(): Unit = js.native
    
    /**
      * Emit a named event. All registered event listeners that listen to the
      * specified name will receive the event.
      *
      * @todo This should catch exceptions
      *
      * @param {N} name The event name.
      * @param {Array<any>} args The arguments that are applied to the event listener.
      */
    def emit(name: N, args: js.Array[Any]): Unit = js.native
    
    /**
      * @param {N} name
      * @param {function} f
      */
    def off(name: N, f: js.Function): Unit = js.native
    
    /**
      * @param {N} name
      * @param {function} f
      */
    def on(name: N, f: js.Function): Unit = js.native
    
    /**
      * @param {N} name
      * @param {function} f
      */
    def once(name: N, f: js.Function): Unit = js.native
  }
}
