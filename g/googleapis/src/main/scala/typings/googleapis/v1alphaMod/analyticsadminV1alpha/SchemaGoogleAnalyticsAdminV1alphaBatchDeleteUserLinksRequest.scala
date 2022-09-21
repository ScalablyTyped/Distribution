package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest extends StObject {
  
  /**
    * Required. The requests specifying the user links to update. A maximum of 1000 user links can be updated in a batch.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaDeleteUserLinkRequest]] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaDeleteUserLinkRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaDeleteUserLinkRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
