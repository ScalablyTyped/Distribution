package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaListAccountsResponse extends StObject {
  
  /** Results that were accessible to the caller. */
  var accounts: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAccount]] = js.native
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaListAccountsResponse {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListAccountsResponse]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaListAccountsResponseMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaListAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: js.Array[GoogleAnalyticsAdminV1alphaAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    @scala.inline
    def setAccountsVarargs(value: GoogleAnalyticsAdminV1alphaAccount*): Self = StObject.set(x, "accounts", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
