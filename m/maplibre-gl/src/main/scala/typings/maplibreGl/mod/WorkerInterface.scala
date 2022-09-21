package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerInterface extends StObject {
  
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: MessageListener): scala.Unit
  
  def postMessage(message: Any): scala.Unit
  
  @JSName("removeEventListener")
  def removeEventListener_message(`type`: message, listener: MessageListener): scala.Unit
  
  def terminate(): scala.Unit
}
object WorkerInterface {
  
  inline def apply(
    addEventListener: (message, MessageListener) => scala.Unit,
    postMessage: Any => scala.Unit,
    removeEventListener: (message, MessageListener) => scala.Unit,
    terminate: () => scala.Unit
  ): WorkerInterface = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), postMessage = js.Any.fromFunction1(postMessage), removeEventListener = js.Any.fromFunction2(removeEventListener), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[WorkerInterface]
  }
  
  extension [Self <: WorkerInterface](x: Self) {
    
    inline def setAddEventListener(value: (message, MessageListener) => scala.Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setPostMessage(value: Any => scala.Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
    
    inline def setRemoveEventListener(value: (message, MessageListener) => scala.Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    inline def setTerminate(value: () => scala.Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
  }
}
