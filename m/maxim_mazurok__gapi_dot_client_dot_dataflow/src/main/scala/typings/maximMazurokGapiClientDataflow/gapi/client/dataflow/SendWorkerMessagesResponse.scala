package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendWorkerMessagesResponse extends StObject {
  
  /** The servers response to the worker messages. */
  var workerMessageResponses: js.UndefOr[js.Array[WorkerMessageResponse]] = js.native
}
object SendWorkerMessagesResponse {
  
  @scala.inline
  def apply(): SendWorkerMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendWorkerMessagesResponse]
  }
  
  @scala.inline
  implicit class SendWorkerMessagesResponseMutableBuilder[Self <: SendWorkerMessagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkerMessageResponses(value: js.Array[WorkerMessageResponse]): Self = StObject.set(x, "workerMessageResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerMessageResponsesUndefined: Self = StObject.set(x, "workerMessageResponses", js.undefined)
    
    @scala.inline
    def setWorkerMessageResponsesVarargs(value: WorkerMessageResponse*): Self = StObject.set(x, "workerMessageResponses", js.Array(value :_*))
  }
}
