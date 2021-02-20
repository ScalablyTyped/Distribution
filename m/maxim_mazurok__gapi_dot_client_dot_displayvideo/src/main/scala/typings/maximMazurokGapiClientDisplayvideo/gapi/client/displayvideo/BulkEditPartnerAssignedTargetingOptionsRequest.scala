package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEditPartnerAssignedTargetingOptionsRequest extends StObject {
  
  /** The assigned targeting options to create in batch, specified as a list of `CreateAssignedTargetingOptionsRequest`. Supported targeting types: * `TARGETING_TYPE_CHANNEL` */
  var createRequests: js.UndefOr[js.Array[CreateAssignedTargetingOptionsRequest]] = js.native
  
  /** The assigned targeting options to delete in batch, specified as a list of `DeleteAssignedTargetingOptionsRequest`. Supported targeting types: * `TARGETING_TYPE_CHANNEL` */
  var deleteRequests: js.UndefOr[js.Array[DeleteAssignedTargetingOptionsRequest]] = js.native
}
object BulkEditPartnerAssignedTargetingOptionsRequest {
  
  @scala.inline
  def apply(): BulkEditPartnerAssignedTargetingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditPartnerAssignedTargetingOptionsRequest]
  }
  
  @scala.inline
  implicit class BulkEditPartnerAssignedTargetingOptionsRequestMutableBuilder[Self <: BulkEditPartnerAssignedTargetingOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateRequests(value: js.Array[CreateAssignedTargetingOptionsRequest]): Self = StObject.set(x, "createRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateRequestsUndefined: Self = StObject.set(x, "createRequests", js.undefined)
    
    @scala.inline
    def setCreateRequestsVarargs(value: CreateAssignedTargetingOptionsRequest*): Self = StObject.set(x, "createRequests", js.Array(value :_*))
    
    @scala.inline
    def setDeleteRequests(value: js.Array[DeleteAssignedTargetingOptionsRequest]): Self = StObject.set(x, "deleteRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRequestsUndefined: Self = StObject.set(x, "deleteRequests", js.undefined)
    
    @scala.inline
    def setDeleteRequestsVarargs(value: DeleteAssignedTargetingOptionsRequest*): Self = StObject.set(x, "deleteRequests", js.Array(value :_*))
  }
}
