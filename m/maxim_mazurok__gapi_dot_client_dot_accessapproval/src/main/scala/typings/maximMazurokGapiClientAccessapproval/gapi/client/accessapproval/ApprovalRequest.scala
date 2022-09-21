package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalRequest extends StObject {
  
  /** Access was approved. */
  var approve: js.UndefOr[ApproveDecision] = js.undefined
  
  /** The request was dismissed. */
  var dismiss: js.UndefOr[DismissDecision] = js.undefined
  
  /** The resource name of the request. Format is "{projects|folders|organizations}/{id}/approvalRequests/{approval_request}". */
  var name: js.UndefOr[String] = js.undefined
  
  /** The time at which approval was requested. */
  var requestTime: js.UndefOr[String] = js.undefined
  
  /** The requested expiration for the approval. If the request is approved, access will be granted from the time of approval until the expiration time. */
  var requestedExpiration: js.UndefOr[String] = js.undefined
  
  /** The locations for which approval is being requested. */
  var requestedLocations: js.UndefOr[AccessLocations] = js.undefined
  
  /** The justification for which approval is being requested. */
  var requestedReason: js.UndefOr[AccessReason] = js.undefined
  
  /**
    * The resource for which approval is being requested. The format of the resource name is defined at https://cloud.google.com/apis/design/resource_names. The resource name here may
    * either be a "full" resource name (e.g. "//library.googleapis.com/shelves/shelf1/books/book2") or a "relative" resource name (e.g. "shelves/shelf1/books/book2") as described in the
    * resource name specification.
    */
  var requestedResourceName: js.UndefOr[String] = js.undefined
  
  /** Properties related to the resource represented by requested_resource_name. */
  var requestedResourceProperties: js.UndefOr[ResourceProperties] = js.undefined
}
object ApprovalRequest {
  
  inline def apply(): ApprovalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRequest]
  }
  
  extension [Self <: ApprovalRequest](x: Self) {
    
    inline def setApprove(value: ApproveDecision): Self = StObject.set(x, "approve", value.asInstanceOf[js.Any])
    
    inline def setApproveUndefined: Self = StObject.set(x, "approve", js.undefined)
    
    inline def setDismiss(value: DismissDecision): Self = StObject.set(x, "dismiss", value.asInstanceOf[js.Any])
    
    inline def setDismissUndefined: Self = StObject.set(x, "dismiss", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
    
    inline def setRequestedExpiration(value: String): Self = StObject.set(x, "requestedExpiration", value.asInstanceOf[js.Any])
    
    inline def setRequestedExpirationUndefined: Self = StObject.set(x, "requestedExpiration", js.undefined)
    
    inline def setRequestedLocations(value: AccessLocations): Self = StObject.set(x, "requestedLocations", value.asInstanceOf[js.Any])
    
    inline def setRequestedLocationsUndefined: Self = StObject.set(x, "requestedLocations", js.undefined)
    
    inline def setRequestedReason(value: AccessReason): Self = StObject.set(x, "requestedReason", value.asInstanceOf[js.Any])
    
    inline def setRequestedReasonUndefined: Self = StObject.set(x, "requestedReason", js.undefined)
    
    inline def setRequestedResourceName(value: String): Self = StObject.set(x, "requestedResourceName", value.asInstanceOf[js.Any])
    
    inline def setRequestedResourceNameUndefined: Self = StObject.set(x, "requestedResourceName", js.undefined)
    
    inline def setRequestedResourceProperties(value: ResourceProperties): Self = StObject.set(x, "requestedResourceProperties", value.asInstanceOf[js.Any])
    
    inline def setRequestedResourcePropertiesUndefined: Self = StObject.set(x, "requestedResourceProperties", js.undefined)
  }
}
