package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListWebDataStreamsResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Results that matched the filter criteria and were accessible to the caller. */
  var webDataStreams: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaWebDataStream]] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListWebDataStreamsResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListWebDataStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListWebDataStreamsResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaListWebDataStreamsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWebDataStreams(value: js.Array[GoogleAnalyticsAdminV1alphaWebDataStream]): Self = StObject.set(x, "webDataStreams", value.asInstanceOf[js.Any])
    
    inline def setWebDataStreamsUndefined: Self = StObject.set(x, "webDataStreams", js.undefined)
    
    inline def setWebDataStreamsVarargs(value: GoogleAnalyticsAdminV1alphaWebDataStream*): Self = StObject.set(x, "webDataStreams", js.Array(value :_*))
  }
}
