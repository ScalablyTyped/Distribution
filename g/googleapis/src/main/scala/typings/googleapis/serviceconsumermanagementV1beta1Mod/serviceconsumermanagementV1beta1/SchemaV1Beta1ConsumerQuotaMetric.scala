package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1Beta1ConsumerQuotaMetric extends StObject {
  
  /**
    * The consumer quota for each quota limit defined on the metric.
    */
  var consumerQuotaLimits: js.UndefOr[js.Array[SchemaV1Beta1ConsumerQuotaLimit]] = js.undefined
  
  /**
    * The quota limits targeting the descendant containers of the consumer in request. If the consumer in request is of type `organizations` or `folders`, the field will list per-project limits in the metric; if the consumer in request is of type `project`, the field will be empty. The `quota_buckets` field of each descendant consumer quota limit will not be populated.
    */
  var descendantConsumerQuotaLimits: js.UndefOr[js.Array[SchemaV1Beta1ConsumerQuotaLimit]] = js.undefined
  
  /**
    * The display name of the metric. An example name would be: "CPUs"
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the metric. An example name would be: `compute.googleapis.com/cpus`
    */
  var metric: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the quota settings on this metric for this consumer. An example name would be: `services/serviceconsumermanagement.googleapis.com/projects/123/quota/metrics/compute.googleapis.com%2Fcpus The resource name is intended to be opaque and should not be parsed for its component strings, since its representation could change in the future.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The units in which the metric value is reported.
    */
  var unit: js.UndefOr[String | Null] = js.undefined
}
object SchemaV1Beta1ConsumerQuotaMetric {
  
  inline def apply(): SchemaV1Beta1ConsumerQuotaMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1Beta1ConsumerQuotaMetric]
  }
  
  extension [Self <: SchemaV1Beta1ConsumerQuotaMetric](x: Self) {
    
    inline def setConsumerQuotaLimits(value: js.Array[SchemaV1Beta1ConsumerQuotaLimit]): Self = StObject.set(x, "consumerQuotaLimits", value.asInstanceOf[js.Any])
    
    inline def setConsumerQuotaLimitsUndefined: Self = StObject.set(x, "consumerQuotaLimits", js.undefined)
    
    inline def setConsumerQuotaLimitsVarargs(value: SchemaV1Beta1ConsumerQuotaLimit*): Self = StObject.set(x, "consumerQuotaLimits", js.Array(value*))
    
    inline def setDescendantConsumerQuotaLimits(value: js.Array[SchemaV1Beta1ConsumerQuotaLimit]): Self = StObject.set(x, "descendantConsumerQuotaLimits", value.asInstanceOf[js.Any])
    
    inline def setDescendantConsumerQuotaLimitsUndefined: Self = StObject.set(x, "descendantConsumerQuotaLimits", js.undefined)
    
    inline def setDescendantConsumerQuotaLimitsVarargs(value: SchemaV1Beta1ConsumerQuotaLimit*): Self = StObject.set(x, "descendantConsumerQuotaLimits", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricNull: Self = StObject.set(x, "metric", null)
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
