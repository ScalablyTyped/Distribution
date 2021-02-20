package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendWorkerMessagesRequest extends StObject {
  
  /** The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job. */
  var location: js.UndefOr[String] = js.native
  
  /** The WorkerMessages to send. */
  var workerMessages: js.UndefOr[js.Array[WorkerMessage]] = js.native
}
object SendWorkerMessagesRequest {
  
  @scala.inline
  def apply(): SendWorkerMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendWorkerMessagesRequest]
  }
  
  @scala.inline
  implicit class SendWorkerMessagesRequestMutableBuilder[Self <: SendWorkerMessagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setWorkerMessages(value: js.Array[WorkerMessage]): Self = StObject.set(x, "workerMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerMessagesUndefined: Self = StObject.set(x, "workerMessages", js.undefined)
    
    @scala.inline
    def setWorkerMessagesVarargs(value: WorkerMessage*): Self = StObject.set(x, "workerMessages", js.Array(value :_*))
  }
}
