package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse extends StObject {
  
  /** The user links updated. */
  var userLinks: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaUserLink]] = js.undefined
}
object GoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse](x: Self) {
    
    inline def setUserLinks(value: js.Array[GoogleAnalyticsAdminV1alphaUserLink]): Self = StObject.set(x, "userLinks", value.asInstanceOf[js.Any])
    
    inline def setUserLinksUndefined: Self = StObject.set(x, "userLinks", js.undefined)
    
    inline def setUserLinksVarargs(value: GoogleAnalyticsAdminV1alphaUserLink*): Self = StObject.set(x, "userLinks", js.Array(value :_*))
  }
}
