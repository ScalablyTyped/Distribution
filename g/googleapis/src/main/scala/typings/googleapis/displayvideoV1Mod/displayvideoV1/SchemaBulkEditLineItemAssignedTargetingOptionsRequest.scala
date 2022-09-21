package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditLineItemAssignedTargetingOptionsRequest extends StObject {
  
  /**
    * The assigned targeting options to create in batch, specified as a list of `CreateAssignedTargetingOptionsRequest`.
    */
  var createRequests: js.UndefOr[js.Array[SchemaCreateAssignedTargetingOptionsRequest]] = js.undefined
  
  /**
    * The assigned targeting options to delete in batch, specified as a list of `DeleteAssignedTargetingOptionsRequest`.
    */
  var deleteRequests: js.UndefOr[js.Array[SchemaDeleteAssignedTargetingOptionsRequest]] = js.undefined
}
object SchemaBulkEditLineItemAssignedTargetingOptionsRequest {
  
  inline def apply(): SchemaBulkEditLineItemAssignedTargetingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditLineItemAssignedTargetingOptionsRequest]
  }
  
  extension [Self <: SchemaBulkEditLineItemAssignedTargetingOptionsRequest](x: Self) {
    
    inline def setCreateRequests(value: js.Array[SchemaCreateAssignedTargetingOptionsRequest]): Self = StObject.set(x, "createRequests", value.asInstanceOf[js.Any])
    
    inline def setCreateRequestsUndefined: Self = StObject.set(x, "createRequests", js.undefined)
    
    inline def setCreateRequestsVarargs(value: SchemaCreateAssignedTargetingOptionsRequest*): Self = StObject.set(x, "createRequests", js.Array(value*))
    
    inline def setDeleteRequests(value: js.Array[SchemaDeleteAssignedTargetingOptionsRequest]): Self = StObject.set(x, "deleteRequests", value.asInstanceOf[js.Any])
    
    inline def setDeleteRequestsUndefined: Self = StObject.set(x, "deleteRequests", js.undefined)
    
    inline def setDeleteRequestsVarargs(value: SchemaDeleteAssignedTargetingOptionsRequest*): Self = StObject.set(x, "deleteRequests", js.Array(value*))
  }
}
