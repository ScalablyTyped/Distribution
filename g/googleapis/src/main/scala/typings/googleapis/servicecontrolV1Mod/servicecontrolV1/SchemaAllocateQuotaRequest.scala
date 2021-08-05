package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for the AllocateQuota method.
  */
trait SchemaAllocateQuotaRequest extends StObject {
  
  /**
    * Operation that describes the quota allocation.
    */
  var allocateOperation: js.UndefOr[SchemaQuotaOperation] = js.undefined
  
  /**
    * Specifies which version of service configuration should be used to
    * process the request. If unspecified or no matching version can be found,
    * the latest one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.undefined
}
object SchemaAllocateQuotaRequest {
  
  inline def apply(): SchemaAllocateQuotaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocateQuotaRequest]
  }
  
  extension [Self <: SchemaAllocateQuotaRequest](x: Self) {
    
    inline def setAllocateOperation(value: SchemaQuotaOperation): Self = StObject.set(x, "allocateOperation", value.asInstanceOf[js.Any])
    
    inline def setAllocateOperationUndefined: Self = StObject.set(x, "allocateOperation", js.undefined)
    
    inline def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
  }
}
