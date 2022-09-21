package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListPropertiesResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Results that matched the filter criteria and were accessible to the caller. */
  var properties: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaProperty]] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListPropertiesResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListPropertiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListPropertiesResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaListPropertiesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProperties(value: js.Array[GoogleAnalyticsAdminV1alphaProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: GoogleAnalyticsAdminV1alphaProperty*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
