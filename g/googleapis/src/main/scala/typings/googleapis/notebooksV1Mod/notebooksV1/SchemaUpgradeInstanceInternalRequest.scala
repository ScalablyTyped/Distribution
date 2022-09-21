package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpgradeInstanceInternalRequest extends StObject {
  
  /**
    * Optional. The optional UpgradeType. Setting this field will search for additional compute images to upgrade this instance.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The VM hardware token for authenticating the VM. https://cloud.google.com/compute/docs/instances/verifying-instance-identity
    */
  var vmId: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpgradeInstanceInternalRequest {
  
  inline def apply(): SchemaUpgradeInstanceInternalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpgradeInstanceInternalRequest]
  }
  
  extension [Self <: SchemaUpgradeInstanceInternalRequest](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    inline def setVmIdNull: Self = StObject.set(x, "vmId", null)
    
    inline def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
  }
}
