package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1Beta1ListConsumerQuotaMetricsResponse extends StObject {
  
  /**
    * Quota settings for the consumer, organized by quota metric.
    */
  var metrics: js.UndefOr[js.Array[SchemaV1Beta1ConsumerQuotaMetric]] = js.undefined
  
  /**
    * Token identifying which result to start with; returned by a previous list call.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaV1Beta1ListConsumerQuotaMetricsResponse {
  
  inline def apply(): SchemaV1Beta1ListConsumerQuotaMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1Beta1ListConsumerQuotaMetricsResponse]
  }
  
  extension [Self <: SchemaV1Beta1ListConsumerQuotaMetricsResponse](x: Self) {
    
    inline def setMetrics(value: js.Array[SchemaV1Beta1ConsumerQuotaMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaV1Beta1ConsumerQuotaMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
