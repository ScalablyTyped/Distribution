package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListConsumerQuotaMetricsResponse extends StObject {
  
  /**
    * Quota settings for the consumer, organized by quota metric.
    */
  var metrics: js.UndefOr[js.Array[SchemaConsumerQuotaMetric]] = js.undefined
  
  /**
    * Token identifying which result to start with; returned by a previous list call.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListConsumerQuotaMetricsResponse {
  
  inline def apply(): SchemaListConsumerQuotaMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConsumerQuotaMetricsResponse]
  }
  
  extension [Self <: SchemaListConsumerQuotaMetricsResponse](x: Self) {
    
    inline def setMetrics(value: js.Array[SchemaConsumerQuotaMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaConsumerQuotaMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
