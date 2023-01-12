package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDebugConfigRequest extends StObject {
  
  /** The internal component id for which debug configuration is requested. */
  var componentId: js.UndefOr[String] = js.undefined
  
  /** The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id. */
  var location: js.UndefOr[String] = js.undefined
  
  /** The worker id, i.e., VM hostname. */
  var workerId: js.UndefOr[String] = js.undefined
}
object GetDebugConfigRequest {
  
  inline def apply(): GetDebugConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDebugConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDebugConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
