package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", "MatrixScheduler")
@js.native
open class MatrixScheduler () extends StObject {
  def this(retryAlgorithm: RetryAlgorithm) = this()
  def this(retryAlgorithm: Unit, queueAlgorithm: QueueAlgorithm) = this()
  def this(retryAlgorithm: RetryAlgorithm, queueAlgorithm: QueueAlgorithm) = this()
  
  def getQueueForEvent(event: MatrixEvent[EventContentTypeMessage, EventType]): (js.Array[MatrixEvent[EventContentTypeMessage, EventType]]) | Null = js.native
  
  def queueEvent(event: MatrixEvent[EventContentTypeMessage, EventType]): js.Promise[Unit] | Null = js.native
  
  def removeEventFromQueue(event: MatrixEvent[EventContentTypeMessage, EventType]): Boolean = js.native
  
  def setProcessFunction(fn: ProcessFn): Unit = js.native
}
/* static members */
object MatrixScheduler {
  
  @JSImport("matrix-js-sdk", "MatrixScheduler")
  @js.native
  val ^ : js.Any = js.native
  
  inline def QUEUE_MESSAGES(event: MatrixEvent[EventContentTypeMessage, EventType]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("QUEUE_MESSAGES")(event.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def RETRY_BACKOFF_RATELIMIT(event: MatrixEvent[EventContentTypeMessage, EventType], attempts: Double, err: MatrixError): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("RETRY_BACKOFF_RATELIMIT")(event.asInstanceOf[js.Any], attempts.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[Double]
}
