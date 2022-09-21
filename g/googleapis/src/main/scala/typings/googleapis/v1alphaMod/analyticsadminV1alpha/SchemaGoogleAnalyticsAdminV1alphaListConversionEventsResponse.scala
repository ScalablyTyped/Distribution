package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaListConversionEventsResponse extends StObject {
  
  /**
    * The requested conversion events
    */
  var conversionEvents: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaConversionEvent]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaListConversionEventsResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaListConversionEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaListConversionEventsResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaListConversionEventsResponse](x: Self) {
    
    inline def setConversionEvents(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaConversionEvent]): Self = StObject.set(x, "conversionEvents", value.asInstanceOf[js.Any])
    
    inline def setConversionEventsUndefined: Self = StObject.set(x, "conversionEvents", js.undefined)
    
    inline def setConversionEventsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaConversionEvent*): Self = StObject.set(x, "conversionEvents", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
