package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListApprovalRequestsResponse extends StObject {
  
  /**
    * Approval request details.
    */
  var approvalRequests: js.UndefOr[js.Array[SchemaApprovalRequest]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListApprovalRequestsResponse {
  
  inline def apply(): SchemaListApprovalRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListApprovalRequestsResponse]
  }
  
  extension [Self <: SchemaListApprovalRequestsResponse](x: Self) {
    
    inline def setApprovalRequests(value: js.Array[SchemaApprovalRequest]): Self = StObject.set(x, "approvalRequests", value.asInstanceOf[js.Any])
    
    inline def setApprovalRequestsUndefined: Self = StObject.set(x, "approvalRequests", js.undefined)
    
    inline def setApprovalRequestsVarargs(value: SchemaApprovalRequest*): Self = StObject.set(x, "approvalRequests", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
