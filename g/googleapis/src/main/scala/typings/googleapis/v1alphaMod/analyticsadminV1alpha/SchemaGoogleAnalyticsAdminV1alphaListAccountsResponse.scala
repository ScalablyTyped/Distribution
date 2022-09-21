package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaListAccountsResponse extends StObject {
  
  /**
    * Results that were accessible to the caller.
    */
  var accounts: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaAccount]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaListAccountsResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaListAccountsResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaListAccountsResponse](x: Self) {
    
    inline def setAccounts(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaAccount*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
