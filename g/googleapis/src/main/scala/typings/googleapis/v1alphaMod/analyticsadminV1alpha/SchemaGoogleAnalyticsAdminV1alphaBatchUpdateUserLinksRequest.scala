package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaBatchUpdateUserLinksRequest extends StObject {
  
  /**
    * Required. The requests specifying the user links to update. A maximum of 1000 user links can be updated in a batch.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaUpdateUserLinkRequest]] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaBatchUpdateUserLinksRequest {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaBatchUpdateUserLinksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaBatchUpdateUserLinksRequest]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaBatchUpdateUserLinksRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaUpdateUserLinkRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaUpdateUserLinkRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
