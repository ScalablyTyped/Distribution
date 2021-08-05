package typings.jestWorker

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PostMessage extends StObject {
    
    def postMessage(message: js.Any): Unit
  }
  object PostMessage {
    
    inline def apply(postMessage: js.Any => Unit): PostMessage = {
      val __obj = js.Dynamic.literal(postMessage = js.Any.fromFunction1(postMessage))
      __obj.asInstanceOf[PostMessage]
    }
    
    extension [Self <: PostMessage](x: Self) {
      
      inline def setPostMessage(value: js.Any => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofEventEmitter extends StObject {
    
    /* static member */
    var defaultMaxListeners: Double = js.native
    
    /**
      * This symbol shall be used to install a listener for only monitoring `'error'`
      * events. Listeners installed using this symbol are called before the regular
      * `'error'` listeners are called.
      *
      * Installing a listener using this symbol does not change the behavior once an
      * `'error'` event is emitted, therefore the process will still crash if no
      * regular `'error'` listener is installed.
      */
    /* static member */
    val errorMonitor: js.Symbol = js.native
    
    /** @deprecated since v4.0.0 */
    /* static member */
    def listenerCount(emitter: EventEmitter, event: String): Double = js.native
    def listenerCount(emitter: EventEmitter, event: js.Symbol): Double = js.native
  }
}
