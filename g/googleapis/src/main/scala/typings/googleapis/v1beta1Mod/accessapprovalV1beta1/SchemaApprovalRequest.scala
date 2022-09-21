package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApprovalRequest extends StObject {
  
  /**
    * Access was approved.
    */
  var approve: js.UndefOr[SchemaApproveDecision] = js.undefined
  
  /**
    * The request was dismissed.
    */
  var dismiss: js.UndefOr[SchemaDismissDecision] = js.undefined
  
  /**
    * The resource name of the request. Format is &quot;{projects|folders|organizations}/{id}/approvalRequests/{approval_request_id}&quot;.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which approval was requested.
    */
  var requestTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The requested expiration for the approval. If the request is approved, access will be granted from the time of approval until the expiration time.
    */
  var requestedExpiration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The locations for which approval is being requested.
    */
  var requestedLocations: js.UndefOr[SchemaAccessLocations] = js.undefined
  
  /**
    * The justification for which approval is being requested.
    */
  var requestedReason: js.UndefOr[SchemaAccessReason] = js.undefined
  
  /**
    * The resource for which approval is being requested. The format of the resource name is defined at https://cloud.google.com/apis/design/resource_names. The resource name here may either be a &quot;full&quot; resource name (e.g. &quot;//library.googleapis.com/shelves/shelf1/books/book2&quot;) or a &quot;relative&quot; resource name (e.g. &quot;shelves/shelf1/books/book2&quot;) as described in the resource name specification.
    */
  var requestedResourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Properties related to the resource represented by requested_resource_name.
    */
  var requestedResourceProperties: js.UndefOr[SchemaResourceProperties] = js.undefined
}
object SchemaApprovalRequest {
  
  inline def apply(): SchemaApprovalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApprovalRequest]
  }
  
  extension [Self <: SchemaApprovalRequest](x: Self) {
    
    inline def setApprove(value: SchemaApproveDecision): Self = StObject.set(x, "approve", value.asInstanceOf[js.Any])
    
    inline def setApproveUndefined: Self = StObject.set(x, "approve", js.undefined)
    
    inline def setDismiss(value: SchemaDismissDecision): Self = StObject.set(x, "dismiss", value.asInstanceOf[js.Any])
    
    inline def setDismissUndefined: Self = StObject.set(x, "dismiss", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeNull: Self = StObject.set(x, "requestTime", null)
    
    inline def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
    
    inline def setRequestedExpiration(value: String): Self = StObject.set(x, "requestedExpiration", value.asInstanceOf[js.Any])
    
    inline def setRequestedExpirationNull: Self = StObject.set(x, "requestedExpiration", null)
    
    inline def setRequestedExpirationUndefined: Self = StObject.set(x, "requestedExpiration", js.undefined)
    
    inline def setRequestedLocations(value: SchemaAccessLocations): Self = StObject.set(x, "requestedLocations", value.asInstanceOf[js.Any])
    
    inline def setRequestedLocationsUndefined: Self = StObject.set(x, "requestedLocations", js.undefined)
    
    inline def setRequestedReason(value: SchemaAccessReason): Self = StObject.set(x, "requestedReason", value.asInstanceOf[js.Any])
    
    inline def setRequestedReasonUndefined: Self = StObject.set(x, "requestedReason", js.undefined)
    
    inline def setRequestedResourceName(value: String): Self = StObject.set(x, "requestedResourceName", value.asInstanceOf[js.Any])
    
    inline def setRequestedResourceNameNull: Self = StObject.set(x, "requestedResourceName", null)
    
    inline def setRequestedResourceNameUndefined: Self = StObject.set(x, "requestedResourceName", js.undefined)
    
    inline def setRequestedResourceProperties(value: SchemaResourceProperties): Self = StObject.set(x, "requestedResourceProperties", value.asInstanceOf[js.Any])
    
    inline def setRequestedResourcePropertiesUndefined: Self = StObject.set(x, "requestedResourceProperties", js.undefined)
  }
}
