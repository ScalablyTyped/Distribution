package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListCustomMetricsResponse extends StObject {
  
  /** List of CustomMetrics. */
  var customMetrics: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaCustomMetric]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListCustomMetricsResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListCustomMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListCustomMetricsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaListCustomMetricsResponse] (val x: Self) extends AnyVal {
    
    inline def setCustomMetrics(value: js.Array[GoogleAnalyticsAdminV1alphaCustomMetric]): Self = StObject.set(x, "customMetrics", value.asInstanceOf[js.Any])
    
    inline def setCustomMetricsUndefined: Self = StObject.set(x, "customMetrics", js.undefined)
    
    inline def setCustomMetricsVarargs(value: GoogleAnalyticsAdminV1alphaCustomMetric*): Self = StObject.set(x, "customMetrics", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
