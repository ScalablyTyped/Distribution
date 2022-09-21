package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse extends StObject {
  
  /** The requested user links. */
  var userLinks: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaUserLink]] = js.undefined
}
object GoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse](x: Self) {
    
    inline def setUserLinks(value: js.Array[GoogleAnalyticsAdminV1alphaUserLink]): Self = StObject.set(x, "userLinks", value.asInstanceOf[js.Any])
    
    inline def setUserLinksUndefined: Self = StObject.set(x, "userLinks", js.undefined)
    
    inline def setUserLinksVarargs(value: GoogleAnalyticsAdminV1alphaUserLink*): Self = StObject.set(x, "userLinks", js.Array(value*))
  }
}
