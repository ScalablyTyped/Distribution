package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaListCustomMetricsResponse extends StObject {
  
  /**
    * List of CustomMetrics.
    */
  var customMetrics: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaCustomMetric]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaListCustomMetricsResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaListCustomMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaListCustomMetricsResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaListCustomMetricsResponse](x: Self) {
    
    inline def setCustomMetrics(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaCustomMetric]): Self = StObject.set(x, "customMetrics", value.asInstanceOf[js.Any])
    
    inline def setCustomMetricsUndefined: Self = StObject.set(x, "customMetrics", js.undefined)
    
    inline def setCustomMetricsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaCustomMetric*): Self = StObject.set(x, "customMetrics", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
