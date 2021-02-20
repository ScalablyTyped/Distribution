package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendDebugCaptureRequest extends StObject {
  
  /** The internal component id for which debug information is sent. */
  var componentId: js.UndefOr[String] = js.native
  
  /** The encoded debug information. */
  var data: js.UndefOr[String] = js.native
  
  /** The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id. */
  var location: js.UndefOr[String] = js.native
  
  /** The worker id, i.e., VM hostname. */
  var workerId: js.UndefOr[String] = js.native
}
object SendDebugCaptureRequest {
  
  @scala.inline
  def apply(): SendDebugCaptureRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendDebugCaptureRequest]
  }
  
  @scala.inline
  implicit class SendDebugCaptureRequestMutableBuilder[Self <: SendDebugCaptureRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
