package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse extends StObject {
  
  /**
    * Results that were accessible to the caller.
    */
  var changeHistoryEvents: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaChangeHistoryEvent]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsResponse](x: Self) {
    
    inline def setChangeHistoryEvents(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaChangeHistoryEvent]): Self = StObject.set(x, "changeHistoryEvents", value.asInstanceOf[js.Any])
    
    inline def setChangeHistoryEventsUndefined: Self = StObject.set(x, "changeHistoryEvents", js.undefined)
    
    inline def setChangeHistoryEventsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaChangeHistoryEvent*): Self = StObject.set(x, "changeHistoryEvents", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
