package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest extends StObject {
  
  /** Required. The requests specifying the user links to update. A maximum of 1000 user links can be updated in a batch. */
  var requests: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest]] = js.undefined
}
object GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest](x: Self) {
    
    inline def setRequests(value: js.Array[GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
