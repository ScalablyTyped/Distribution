package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse extends StObject {
  
  /** Results that were accessible to the caller. */
  var changeHistoryEvents: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaChangeHistoryEvent]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse](x: Self) {
    
    inline def setChangeHistoryEvents(value: js.Array[GoogleAnalyticsAdminV1alphaChangeHistoryEvent]): Self = StObject.set(x, "changeHistoryEvents", value.asInstanceOf[js.Any])
    
    inline def setChangeHistoryEventsUndefined: Self = StObject.set(x, "changeHistoryEvents", js.undefined)
    
    inline def setChangeHistoryEventsVarargs(value: GoogleAnalyticsAdminV1alphaChangeHistoryEvent*): Self = StObject.set(x, "changeHistoryEvents", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
