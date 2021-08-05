package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListAndroidAppDataStreamsResponse extends StObject {
  
  /** Results that matched the filter criteria and were accessible to the caller. */
  var androidAppDataStreams: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAndroidAppDataStream]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListAndroidAppDataStreamsResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListAndroidAppDataStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListAndroidAppDataStreamsResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaListAndroidAppDataStreamsResponse](x: Self) {
    
    inline def setAndroidAppDataStreams(value: js.Array[GoogleAnalyticsAdminV1alphaAndroidAppDataStream]): Self = StObject.set(x, "androidAppDataStreams", value.asInstanceOf[js.Any])
    
    inline def setAndroidAppDataStreamsUndefined: Self = StObject.set(x, "androidAppDataStreams", js.undefined)
    
    inline def setAndroidAppDataStreamsVarargs(value: GoogleAnalyticsAdminV1alphaAndroidAppDataStream*): Self = StObject.set(x, "androidAppDataStreams", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
