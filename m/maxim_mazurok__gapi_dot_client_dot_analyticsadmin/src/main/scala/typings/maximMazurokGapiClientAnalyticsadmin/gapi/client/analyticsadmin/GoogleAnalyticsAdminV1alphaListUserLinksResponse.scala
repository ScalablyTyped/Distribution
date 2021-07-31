package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListUserLinksResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of UserLinks. These will be ordered stably, but in an arbitrary order. */
  var userLinks: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaUserLink]] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListUserLinksResponse {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaListUserLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListUserLinksResponse]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaListUserLinksResponseMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaListUserLinksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUserLinks(value: js.Array[GoogleAnalyticsAdminV1alphaUserLink]): Self = StObject.set(x, "userLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLinksUndefined: Self = StObject.set(x, "userLinks", js.undefined)
    
    @scala.inline
    def setUserLinksVarargs(value: GoogleAnalyticsAdminV1alphaUserLink*): Self = StObject.set(x, "userLinks", js.Array(value :_*))
  }
}
