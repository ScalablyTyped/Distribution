package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListConversionEventsResponse extends StObject {
  
  /** The requested conversion events */
  var conversionEvents: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaConversionEvent]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListConversionEventsResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListConversionEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListConversionEventsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaListConversionEventsResponse] (val x: Self) extends AnyVal {
    
    inline def setConversionEvents(value: js.Array[GoogleAnalyticsAdminV1alphaConversionEvent]): Self = StObject.set(x, "conversionEvents", value.asInstanceOf[js.Any])
    
    inline def setConversionEventsUndefined: Self = StObject.set(x, "conversionEvents", js.undefined)
    
    inline def setConversionEventsVarargs(value: GoogleAnalyticsAdminV1alphaConversionEvent*): Self = StObject.set(x, "conversionEvents", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
