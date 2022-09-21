package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendWorkerMessagesResponse extends StObject {
  
  /** The servers response to the worker messages. */
  var workerMessageResponses: js.UndefOr[js.Array[WorkerMessageResponse]] = js.undefined
}
object SendWorkerMessagesResponse {
  
  inline def apply(): SendWorkerMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendWorkerMessagesResponse]
  }
  
  extension [Self <: SendWorkerMessagesResponse](x: Self) {
    
    inline def setWorkerMessageResponses(value: js.Array[WorkerMessageResponse]): Self = StObject.set(x, "workerMessageResponses", value.asInstanceOf[js.Any])
    
    inline def setWorkerMessageResponsesUndefined: Self = StObject.set(x, "workerMessageResponses", js.undefined)
    
    inline def setWorkerMessageResponsesVarargs(value: WorkerMessageResponse*): Self = StObject.set(x, "workerMessageResponses", js.Array(value*))
  }
}
