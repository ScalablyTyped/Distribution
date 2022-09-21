package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditPartnerAssignedTargetingOptionsRequest extends StObject {
  
  /**
    * The assigned targeting options to create in batch, specified as a list of `CreateAssignedTargetingOptionsRequest`. Supported targeting types: * `TARGETING_TYPE_CHANNEL`
    */
  var createRequests: js.UndefOr[js.Array[SchemaCreateAssignedTargetingOptionsRequest]] = js.undefined
  
  /**
    * The assigned targeting options to delete in batch, specified as a list of `DeleteAssignedTargetingOptionsRequest`. Supported targeting types: * `TARGETING_TYPE_CHANNEL`
    */
  var deleteRequests: js.UndefOr[js.Array[SchemaDeleteAssignedTargetingOptionsRequest]] = js.undefined
}
object SchemaBulkEditPartnerAssignedTargetingOptionsRequest {
  
  inline def apply(): SchemaBulkEditPartnerAssignedTargetingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditPartnerAssignedTargetingOptionsRequest]
  }
  
  extension [Self <: SchemaBulkEditPartnerAssignedTargetingOptionsRequest](x: Self) {
    
    inline def setCreateRequests(value: js.Array[SchemaCreateAssignedTargetingOptionsRequest]): Self = StObject.set(x, "createRequests", value.asInstanceOf[js.Any])
    
    inline def setCreateRequestsUndefined: Self = StObject.set(x, "createRequests", js.undefined)
    
    inline def setCreateRequestsVarargs(value: SchemaCreateAssignedTargetingOptionsRequest*): Self = StObject.set(x, "createRequests", js.Array(value*))
    
    inline def setDeleteRequests(value: js.Array[SchemaDeleteAssignedTargetingOptionsRequest]): Self = StObject.set(x, "deleteRequests", value.asInstanceOf[js.Any])
    
    inline def setDeleteRequestsUndefined: Self = StObject.set(x, "deleteRequests", js.undefined)
    
    inline def setDeleteRequestsVarargs(value: SchemaDeleteAssignedTargetingOptionsRequest*): Self = StObject.set(x, "deleteRequests", js.Array(value*))
  }
}
