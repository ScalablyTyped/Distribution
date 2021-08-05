package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListIosAppDataStreamsResponse extends StObject {
  
  /** Results that matched the filter criteria and were accessible to the caller. */
  var iosAppDataStreams: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaIosAppDataStream]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListIosAppDataStreamsResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListIosAppDataStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListIosAppDataStreamsResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaListIosAppDataStreamsResponse](x: Self) {
    
    inline def setIosAppDataStreams(value: js.Array[GoogleAnalyticsAdminV1alphaIosAppDataStream]): Self = StObject.set(x, "iosAppDataStreams", value.asInstanceOf[js.Any])
    
    inline def setIosAppDataStreamsUndefined: Self = StObject.set(x, "iosAppDataStreams", js.undefined)
    
    inline def setIosAppDataStreamsVarargs(value: GoogleAnalyticsAdminV1alphaIosAppDataStream*): Self = StObject.set(x, "iosAppDataStreams", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
