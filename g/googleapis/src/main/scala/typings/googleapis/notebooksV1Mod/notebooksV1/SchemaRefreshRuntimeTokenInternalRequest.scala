package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRefreshRuntimeTokenInternalRequest extends StObject {
  
  /**
    * Required. The VM hardware token for authenticating the VM. https://cloud.google.com/compute/docs/instances/verifying-instance-identity
    */
  var vmId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRefreshRuntimeTokenInternalRequest {
  
  inline def apply(): SchemaRefreshRuntimeTokenInternalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRefreshRuntimeTokenInternalRequest]
  }
  
  extension [Self <: SchemaRefreshRuntimeTokenInternalRequest](x: Self) {
    
    inline def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    inline def setVmIdNull: Self = StObject.set(x, "vmId", null)
    
    inline def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
  }
}
