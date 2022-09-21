package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaListDataStreamsResponse extends StObject {
  
  /**
    * List of DataStreams.
    */
  var dataStreams: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaDataStream]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaListDataStreamsResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaListDataStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaListDataStreamsResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaListDataStreamsResponse](x: Self) {
    
    inline def setDataStreams(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaDataStream]): Self = StObject.set(x, "dataStreams", value.asInstanceOf[js.Any])
    
    inline def setDataStreamsUndefined: Self = StObject.set(x, "dataStreams", js.undefined)
    
    inline def setDataStreamsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaDataStream*): Self = StObject.set(x, "dataStreams", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
