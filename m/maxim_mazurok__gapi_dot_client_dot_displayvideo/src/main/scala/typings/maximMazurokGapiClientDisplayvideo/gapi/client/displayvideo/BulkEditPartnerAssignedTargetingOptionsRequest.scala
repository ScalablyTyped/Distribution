package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEditPartnerAssignedTargetingOptionsRequest extends js.Object {
  
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
  implicit class BulkEditPartnerAssignedTargetingOptionsRequestOps[Self <: BulkEditPartnerAssignedTargetingOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateRequestsVarargs(value: CreateAssignedTargetingOptionsRequest*): Self = this.set("createRequests", js.Array(value :_*))
    
    @scala.inline
    def setCreateRequests(value: js.Array[CreateAssignedTargetingOptionsRequest]): Self = this.set("createRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateRequests: Self = this.set("createRequests", js.undefined)
    
    @scala.inline
    def setDeleteRequestsVarargs(value: DeleteAssignedTargetingOptionsRequest*): Self = this.set("deleteRequests", js.Array(value :_*))
    
    @scala.inline
    def setDeleteRequests(value: js.Array[DeleteAssignedTargetingOptionsRequest]): Self = this.set("deleteRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteRequests: Self = this.set("deleteRequests", js.undefined)
  }
}
