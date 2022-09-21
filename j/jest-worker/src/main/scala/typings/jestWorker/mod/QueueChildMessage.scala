package typings.jestWorker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueChildMessage extends StObject {
  
  def onCustomMessage(message: js.Array[Any]): Unit
  def onCustomMessage(message: Any): Unit
  @JSName("onCustomMessage")
  var onCustomMessage_Original: OnCustomMessage
  
  def onEnd(err: js.Error, result: Any): Unit
  def onEnd(err: Null, result: Any): Unit
  @JSName("onEnd")
  var onEnd_Original: OnEnd
  
  def onStart(worker: WorkerInterface): Unit
  @JSName("onStart")
  var onStart_Original: OnStart
  
  var request: ChildMessageCall
}
object QueueChildMessage {
  
  inline def apply(
    onCustomMessage: /* message */ js.Array[Any] | Any => Unit,
    onEnd: (/* err */ js.Error | Null, /* result */ Any) => Unit,
    onStart: /* worker */ WorkerInterface => Unit,
    request: ChildMessageCall
  ): QueueChildMessage = {
    val __obj = js.Dynamic.literal(onCustomMessage = js.Any.fromFunction1(onCustomMessage), onEnd = js.Any.fromFunction2(onEnd), onStart = js.Any.fromFunction1(onStart), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueChildMessage]
  }
  
  extension [Self <: QueueChildMessage](x: Self) {
    
    inline def setOnCustomMessage(value: /* message */ js.Array[Any] | Any => Unit): Self = StObject.set(x, "onCustomMessage", js.Any.fromFunction1(value))
    
    inline def setOnEnd(value: (/* err */ js.Error | Null, /* result */ Any) => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction2(value))
    
    inline def setOnStart(value: /* worker */ WorkerInterface => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
    
    inline def setRequest(value: ChildMessageCall): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
