package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricUpdate extends StObject {
  
  /**
    * True if this metric is reported as the total cumulative aggregate value accumulated since the worker started working on this WorkItem. By default this is false, indicating that this metric is reported as a delta that is not associated with any WorkItem.
    */
  var cumulative: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A struct value describing properties of a distribution of numeric values.
    */
  var distribution: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * A struct value describing properties of a Gauge. Metrics of gauge type show the value of a metric across time, and is aggregated based on the newest value.
    */
  var gauge: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Worker-computed aggregate value for internal use by the Dataflow service.
    */
  var internal: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Metric aggregation kind. The possible metric aggregation kinds are "Sum", "Max", "Min", "Mean", "Set", "And", "Or", and "Distribution". The specified aggregation kind is case-insensitive. If omitted, this is not an aggregated value but instead a single metric sample value.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Worker-computed aggregate value for the "Mean" aggregation kind. This holds the count of the aggregated values and is used in combination with mean_sum above to obtain the actual mean aggregate value. The only possible value type is Long.
    */
  var meanCount: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Worker-computed aggregate value for the "Mean" aggregation kind. This holds the sum of the aggregated values and is used in combination with mean_count below to obtain the actual mean aggregate value. The only possible value types are Long and Double.
    */
  var meanSum: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Name of the metric.
    */
  var name: js.UndefOr[SchemaMetricStructuredName] = js.undefined
  
  /**
    * Worker-computed aggregate value for aggregation kinds "Sum", "Max", "Min", "And", and "Or". The possible value types are Long, Double, and Boolean.
    */
  var scalar: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Worker-computed aggregate value for the "Set" aggregation kind. The only possible value type is a list of Values whose type can be Long, Double, or String, according to the metric's type. All Values in the list must be of the same type.
    */
  var set: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Timestamp associated with the metric value. Optional when workers are reporting work progress; it will be filled in responses from the metrics API.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetricUpdate {
  
  inline def apply(): SchemaMetricUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricUpdate]
  }
  
  extension [Self <: SchemaMetricUpdate](x: Self) {
    
    inline def setCumulative(value: Boolean): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
    
    inline def setCumulativeNull: Self = StObject.set(x, "cumulative", null)
    
    inline def setCumulativeUndefined: Self = StObject.set(x, "cumulative", js.undefined)
    
    inline def setDistribution(value: Any): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionNull: Self = StObject.set(x, "distribution", null)
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    inline def setGauge(value: Any): Self = StObject.set(x, "gauge", value.asInstanceOf[js.Any])
    
    inline def setGaugeNull: Self = StObject.set(x, "gauge", null)
    
    inline def setGaugeUndefined: Self = StObject.set(x, "gauge", js.undefined)
    
    inline def setInternal(value: Any): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setInternalNull: Self = StObject.set(x, "internal", null)
    
    inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMeanCount(value: Any): Self = StObject.set(x, "meanCount", value.asInstanceOf[js.Any])
    
    inline def setMeanCountNull: Self = StObject.set(x, "meanCount", null)
    
    inline def setMeanCountUndefined: Self = StObject.set(x, "meanCount", js.undefined)
    
    inline def setMeanSum(value: Any): Self = StObject.set(x, "meanSum", value.asInstanceOf[js.Any])
    
    inline def setMeanSumNull: Self = StObject.set(x, "meanSum", null)
    
    inline def setMeanSumUndefined: Self = StObject.set(x, "meanSum", js.undefined)
    
    inline def setName(value: SchemaMetricStructuredName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScalar(value: Any): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
    
    inline def setScalarNull: Self = StObject.set(x, "scalar", null)
    
    inline def setScalarUndefined: Self = StObject.set(x, "scalar", js.undefined)
    
    inline def setSet(value: Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetNull: Self = StObject.set(x, "set", null)
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
