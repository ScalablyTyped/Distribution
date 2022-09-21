package typings.jestWorker.mod

import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerPoolInterface extends StObject {
  
  def createWorker(options: WorkerOptions2): WorkerInterface
  
  def end(): js.Promise[PoolExitResult]
  
  def getStderr(): ReadableStream[Any]
  
  def getStdout(): ReadableStream[Any]
  
  def getWorkers(): js.Array[WorkerInterface]
  
  def send(
    workerId: Double,
    request: ChildMessage,
    onStart: OnStart,
    onEnd: OnEnd,
    onCustomMessage: OnCustomMessage
  ): Unit
  @JSName("send")
  var send_Original: WorkerCallback
}
object WorkerPoolInterface {
  
  inline def apply(
    createWorker: WorkerOptions2 => WorkerInterface,
    end: () => js.Promise[PoolExitResult],
    getStderr: () => ReadableStream[Any],
    getStdout: () => ReadableStream[Any],
    getWorkers: () => js.Array[WorkerInterface],
    send: (/* workerId */ Double, /* request */ ChildMessage, /* onStart */ OnStart, /* onEnd */ OnEnd, /* onCustomMessage */ OnCustomMessage) => Unit
  ): WorkerPoolInterface = {
    val __obj = js.Dynamic.literal(createWorker = js.Any.fromFunction1(createWorker), end = js.Any.fromFunction0(end), getStderr = js.Any.fromFunction0(getStderr), getStdout = js.Any.fromFunction0(getStdout), getWorkers = js.Any.fromFunction0(getWorkers), send = js.Any.fromFunction5(send))
    __obj.asInstanceOf[WorkerPoolInterface]
  }
  
  extension [Self <: WorkerPoolInterface](x: Self) {
    
    inline def setCreateWorker(value: WorkerOptions2 => WorkerInterface): Self = StObject.set(x, "createWorker", js.Any.fromFunction1(value))
    
    inline def setEnd(value: () => js.Promise[PoolExitResult]): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setGetStderr(value: () => ReadableStream[Any]): Self = StObject.set(x, "getStderr", js.Any.fromFunction0(value))
    
    inline def setGetStdout(value: () => ReadableStream[Any]): Self = StObject.set(x, "getStdout", js.Any.fromFunction0(value))
    
    inline def setGetWorkers(value: () => js.Array[WorkerInterface]): Self = StObject.set(x, "getWorkers", js.Any.fromFunction0(value))
    
    inline def setSend(
      value: (/* workerId */ Double, /* request */ ChildMessage, /* onStart */ OnStart, /* onEnd */ OnEnd, /* onCustomMessage */ OnCustomMessage) => Unit
    ): Self = StObject.set(x, "send", js.Any.fromFunction5(value))
  }
}
