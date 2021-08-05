package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEditPartnerAssignedTargetingOptionsRequest extends StObject {
  
  /** The assigned targeting options to create in batch, specified as a list of `CreateAssignedTargetingOptionsRequest`. Supported targeting types: * `TARGETING_TYPE_CHANNEL` */
  var createRequests: js.UndefOr[js.Array[CreateAssignedTargetingOptionsRequest]] = js.undefined
  
  /** The assigned targeting options to delete in batch, specified as a list of `DeleteAssignedTargetingOptionsRequest`. Supported targeting types: * `TARGETING_TYPE_CHANNEL` */
  var deleteRequests: js.UndefOr[js.Array[DeleteAssignedTargetingOptionsRequest]] = js.undefined
}
object BulkEditPartnerAssignedTargetingOptionsRequest {
  
  inline def apply(): BulkEditPartnerAssignedTargetingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditPartnerAssignedTargetingOptionsRequest]
  }
  
  extension [Self <: BulkEditPartnerAssignedTargetingOptionsRequest](x: Self) {
    
    inline def setCreateRequests(value: js.Array[CreateAssignedTargetingOptionsRequest]): Self = StObject.set(x, "createRequests", value.asInstanceOf[js.Any])
    
    inline def setCreateRequestsUndefined: Self = StObject.set(x, "createRequests", js.undefined)
    
    inline def setCreateRequestsVarargs(value: CreateAssignedTargetingOptionsRequest*): Self = StObject.set(x, "createRequests", js.Array(value :_*))
    
    inline def setDeleteRequests(value: js.Array[DeleteAssignedTargetingOptionsRequest]): Self = StObject.set(x, "deleteRequests", value.asInstanceOf[js.Any])
    
    inline def setDeleteRequestsUndefined: Self = StObject.set(x, "deleteRequests", js.undefined)
    
    inline def setDeleteRequestsVarargs(value: DeleteAssignedTargetingOptionsRequest*): Self = StObject.set(x, "deleteRequests", js.Array(value :_*))
  }
}
