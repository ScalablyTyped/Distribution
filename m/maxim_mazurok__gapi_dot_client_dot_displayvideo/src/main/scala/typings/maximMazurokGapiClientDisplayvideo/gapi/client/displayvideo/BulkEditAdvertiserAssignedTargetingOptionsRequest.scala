package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEditAdvertiserAssignedTargetingOptionsRequest extends StObject {
  
  /**
    * The assigned targeting options to create in batch, specified as a list of `CreateAssignedTargetingOptionsRequest`. Supported targeting types: * `TARGETING_TYPE_CHANNEL` *
    * `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION` * `TARGETING_TYPE_OMID` * `TARGETING_TYPE_SENSITIVE_CATEGORY_EXCLUSION`
    */
  var createRequests: js.UndefOr[js.Array[CreateAssignedTargetingOptionsRequest]] = js.undefined
  
  /**
    * The assigned targeting options to delete in batch, specified as a list of `DeleteAssignedTargetingOptionsRequest`. Supported targeting types: * `TARGETING_TYPE_CHANNEL` *
    * `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION` * `TARGETING_TYPE_OMID` * `TARGETING_TYPE_SENSITIVE_CATEGORY_EXCLUSION`
    */
  var deleteRequests: js.UndefOr[js.Array[DeleteAssignedTargetingOptionsRequest]] = js.undefined
}
object BulkEditAdvertiserAssignedTargetingOptionsRequest {
  
  inline def apply(): BulkEditAdvertiserAssignedTargetingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditAdvertiserAssignedTargetingOptionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkEditAdvertiserAssignedTargetingOptionsRequest] (val x: Self) extends AnyVal {
    
    inline def setCreateRequests(value: js.Array[CreateAssignedTargetingOptionsRequest]): Self = StObject.set(x, "createRequests", value.asInstanceOf[js.Any])
    
    inline def setCreateRequestsUndefined: Self = StObject.set(x, "createRequests", js.undefined)
    
    inline def setCreateRequestsVarargs(value: CreateAssignedTargetingOptionsRequest*): Self = StObject.set(x, "createRequests", js.Array(value*))
    
    inline def setDeleteRequests(value: js.Array[DeleteAssignedTargetingOptionsRequest]): Self = StObject.set(x, "deleteRequests", value.asInstanceOf[js.Any])
    
    inline def setDeleteRequestsUndefined: Self = StObject.set(x, "deleteRequests", js.undefined)
    
    inline def setDeleteRequestsVarargs(value: DeleteAssignedTargetingOptionsRequest*): Self = StObject.set(x, "deleteRequests", js.Array(value*))
  }
}
