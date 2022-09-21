package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportRuntimeEventRequest extends StObject {
  
  /**
    * Required. The Event to be reported.
    */
  var event: js.UndefOr[SchemaEvent] = js.undefined
  
  /**
    * Required. The VM hardware token for authenticating the VM. https://cloud.google.com/compute/docs/instances/verifying-instance-identity
    */
  var vmId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportRuntimeEventRequest {
  
  inline def apply(): SchemaReportRuntimeEventRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportRuntimeEventRequest]
  }
  
  extension [Self <: SchemaReportRuntimeEventRequest](x: Self) {
    
    inline def setEvent(value: SchemaEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    inline def setVmIdNull: Self = StObject.set(x, "vmId", null)
    
    inline def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
  }
}
