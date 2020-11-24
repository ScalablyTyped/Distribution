package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApprovalRequestsResponse extends js.Object {
  
  /** Approval request details. */
  var approvalRequests: js.UndefOr[js.Array[ApprovalRequest]] = js.native
  
  /** Token to retrieve the next page of results, or empty if there are no more. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListApprovalRequestsResponse {
  
  @scala.inline
  def apply(): ListApprovalRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApprovalRequestsResponse]
  }
  
  @scala.inline
  implicit class ListApprovalRequestsResponseOps[Self <: ListApprovalRequestsResponse] (val x: Self) extends AnyVal {
    
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
    def setApprovalRequestsVarargs(value: ApprovalRequest*): Self = this.set("approvalRequests", js.Array(value :_*))
    
    @scala.inline
    def setApprovalRequests(value: js.Array[ApprovalRequest]): Self = this.set("approvalRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovalRequests: Self = this.set("approvalRequests", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
