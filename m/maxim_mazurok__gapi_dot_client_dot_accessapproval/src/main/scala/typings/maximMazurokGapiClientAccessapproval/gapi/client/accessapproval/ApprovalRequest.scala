package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApprovalRequest extends js.Object {
  
  /** Access was approved. */
  var approve: js.UndefOr[ApproveDecision] = js.native
  
  /** The request was dismissed. */
  var dismiss: js.UndefOr[DismissDecision] = js.native
  
  /** The resource name of the request. Format is "{projects|folders|organizations}/{id}/approvalRequests/{approval_request}". */
  var name: js.UndefOr[String] = js.native
  
  /** The time at which approval was requested. */
  var requestTime: js.UndefOr[String] = js.native
  
  /** The requested expiration for the approval. If the request is approved, access will be granted from the time of approval until the expiration time. */
  var requestedExpiration: js.UndefOr[String] = js.native
  
  /** The locations for which approval is being requested. */
  var requestedLocations: js.UndefOr[AccessLocations] = js.native
  
  /** The justification for which approval is being requested. */
  var requestedReason: js.UndefOr[AccessReason] = js.native
  
  /**
    * The resource for which approval is being requested. The format of the resource name is defined at https://cloud.google.com/apis/design/resource_names. The resource name here may
    * either be a "full" resource name (e.g. "//library.googleapis.com/shelves/shelf1/books/book2") or a "relative" resource name (e.g. "shelves/shelf1/books/book2") as described in the
    * resource name specification.
    */
  var requestedResourceName: js.UndefOr[String] = js.native
  
  /** Properties related to the resource represented by requested_resource_name. */
  var requestedResourceProperties: js.UndefOr[ResourceProperties] = js.native
}
object ApprovalRequest {
  
  @scala.inline
  def apply(): ApprovalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRequest]
  }
  
  @scala.inline
  implicit class ApprovalRequestOps[Self <: ApprovalRequest] (val x: Self) extends AnyVal {
    
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
    def setApprove(value: ApproveDecision): Self = this.set("approve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprove: Self = this.set("approve", js.undefined)
    
    @scala.inline
    def setDismiss(value: DismissDecision): Self = this.set("dismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismiss: Self = this.set("dismiss", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRequestTime(value: String): Self = this.set("requestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTime: Self = this.set("requestTime", js.undefined)
    
    @scala.inline
    def setRequestedExpiration(value: String): Self = this.set("requestedExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedExpiration: Self = this.set("requestedExpiration", js.undefined)
    
    @scala.inline
    def setRequestedLocations(value: AccessLocations): Self = this.set("requestedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedLocations: Self = this.set("requestedLocations", js.undefined)
    
    @scala.inline
    def setRequestedReason(value: AccessReason): Self = this.set("requestedReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedReason: Self = this.set("requestedReason", js.undefined)
    
    @scala.inline
    def setRequestedResourceName(value: String): Self = this.set("requestedResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedResourceName: Self = this.set("requestedResourceName", js.undefined)
    
    @scala.inline
    def setRequestedResourceProperties(value: ResourceProperties): Self = this.set("requestedResourceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedResourceProperties: Self = this.set("requestedResourceProperties", js.undefined)
  }
}
