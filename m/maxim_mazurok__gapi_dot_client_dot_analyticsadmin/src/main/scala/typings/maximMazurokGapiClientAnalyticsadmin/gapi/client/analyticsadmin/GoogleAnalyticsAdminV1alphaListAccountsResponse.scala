package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListAccountsResponse extends StObject {
  
  /** Results that were accessible to the caller. */
  var accounts: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAccount]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListAccountsResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListAccountsResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaListAccountsResponse](x: Self) {
    
    inline def setAccounts(value: js.Array[GoogleAnalyticsAdminV1alphaAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: GoogleAnalyticsAdminV1alphaAccount*): Self = StObject.set(x, "accounts", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
