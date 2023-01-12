package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApprovalRequestsResponse extends StObject {
  
  /** Approval request details. */
  var approvalRequests: js.UndefOr[js.Array[ApprovalRequest]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListApprovalRequestsResponse {
  
  inline def apply(): ListApprovalRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApprovalRequestsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListApprovalRequestsResponse] (val x: Self) extends AnyVal {
    
    inline def setApprovalRequests(value: js.Array[ApprovalRequest]): Self = StObject.set(x, "approvalRequests", value.asInstanceOf[js.Any])
    
    inline def setApprovalRequestsUndefined: Self = StObject.set(x, "approvalRequests", js.undefined)
    
    inline def setApprovalRequestsVarargs(value: ApprovalRequest*): Self = StObject.set(x, "approvalRequests", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
