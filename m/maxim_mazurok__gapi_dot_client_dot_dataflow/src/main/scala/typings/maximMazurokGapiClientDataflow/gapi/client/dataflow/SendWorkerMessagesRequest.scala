package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendWorkerMessagesRequest extends StObject {
  
  /** The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job. */
  var location: js.UndefOr[String] = js.undefined
  
  /** The WorkerMessages to send. */
  var workerMessages: js.UndefOr[js.Array[WorkerMessage]] = js.undefined
}
object SendWorkerMessagesRequest {
  
  inline def apply(): SendWorkerMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendWorkerMessagesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendWorkerMessagesRequest] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setWorkerMessages(value: js.Array[WorkerMessage]): Self = StObject.set(x, "workerMessages", value.asInstanceOf[js.Any])
    
    inline def setWorkerMessagesUndefined: Self = StObject.set(x, "workerMessages", js.undefined)
    
    inline def setWorkerMessagesVarargs(value: WorkerMessage*): Self = StObject.set(x, "workerMessages", js.Array(value*))
  }
}
