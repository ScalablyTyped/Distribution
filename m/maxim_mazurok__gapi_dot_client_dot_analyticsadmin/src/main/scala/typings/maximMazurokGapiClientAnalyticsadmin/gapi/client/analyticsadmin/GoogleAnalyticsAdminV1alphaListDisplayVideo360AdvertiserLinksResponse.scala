package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse extends StObject {
  
  /** List of DisplayVideo360AdvertiserLinks. */
  var displayVideo360AdvertiserLinks: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse](x: Self) {
    
    inline def setDisplayVideo360AdvertiserLinks(value: js.Array[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink]): Self = StObject.set(x, "displayVideo360AdvertiserLinks", value.asInstanceOf[js.Any])
    
    inline def setDisplayVideo360AdvertiserLinksUndefined: Self = StObject.set(x, "displayVideo360AdvertiserLinks", js.undefined)
    
    inline def setDisplayVideo360AdvertiserLinksVarargs(value: GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink*): Self = StObject.set(x, "displayVideo360AdvertiserLinks", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
