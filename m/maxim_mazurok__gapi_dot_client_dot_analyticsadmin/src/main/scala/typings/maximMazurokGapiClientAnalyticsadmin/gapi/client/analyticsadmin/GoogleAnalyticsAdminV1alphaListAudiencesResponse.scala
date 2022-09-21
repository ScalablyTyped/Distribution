package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListAudiencesResponse extends StObject {
  
  /** List of Audiences. */
  var audiences: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAudience]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListAudiencesResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListAudiencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListAudiencesResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaListAudiencesResponse](x: Self) {
    
    inline def setAudiences(value: js.Array[GoogleAnalyticsAdminV1alphaAudience]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
    
    inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
    
    inline def setAudiencesVarargs(value: GoogleAnalyticsAdminV1alphaAudience*): Self = StObject.set(x, "audiences", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
