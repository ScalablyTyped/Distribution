package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListDataStreamsResponse extends StObject {
  
  /** List of DataStreams. */
  var dataStreams: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaDataStream]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListDataStreamsResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListDataStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListDataStreamsResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaListDataStreamsResponse](x: Self) {
    
    inline def setDataStreams(value: js.Array[GoogleAnalyticsAdminV1alphaDataStream]): Self = StObject.set(x, "dataStreams", value.asInstanceOf[js.Any])
    
    inline def setDataStreamsUndefined: Self = StObject.set(x, "dataStreams", js.undefined)
    
    inline def setDataStreamsVarargs(value: GoogleAnalyticsAdminV1alphaDataStream*): Self = StObject.set(x, "dataStreams", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
