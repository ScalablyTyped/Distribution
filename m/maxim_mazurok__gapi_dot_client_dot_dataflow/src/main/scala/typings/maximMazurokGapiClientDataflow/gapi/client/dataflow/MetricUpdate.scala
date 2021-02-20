package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricUpdate extends StObject {
  
  /**
    * True if this metric is reported as the total cumulative aggregate value accumulated since the worker started working on this WorkItem. By default this is false, indicating that this
    * metric is reported as a delta that is not associated with any WorkItem.
    */
  var cumulative: js.UndefOr[Boolean] = js.native
  
  /** A struct value describing properties of a distribution of numeric values. */
  var distribution: js.UndefOr[js.Any] = js.native
  
  /** A struct value describing properties of a Gauge. Metrics of gauge type show the value of a metric across time, and is aggregated based on the newest value. */
  var gauge: js.UndefOr[js.Any] = js.native
  
  /** Worker-computed aggregate value for internal use by the Dataflow service. */
  var internal: js.UndefOr[js.Any] = js.native
  
  /**
    * Metric aggregation kind. The possible metric aggregation kinds are "Sum", "Max", "Min", "Mean", "Set", "And", "Or", and "Distribution". The specified aggregation kind is
    * case-insensitive. If omitted, this is not an aggregated value but instead a single metric sample value.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Worker-computed aggregate value for the "Mean" aggregation kind. This holds the count of the aggregated values and is used in combination with mean_sum above to obtain the actual
    * mean aggregate value. The only possible value type is Long.
    */
  var meanCount: js.UndefOr[js.Any] = js.native
  
  /**
    * Worker-computed aggregate value for the "Mean" aggregation kind. This holds the sum of the aggregated values and is used in combination with mean_count below to obtain the actual
    * mean aggregate value. The only possible value types are Long and Double.
    */
  var meanSum: js.UndefOr[js.Any] = js.native
  
  /** Name of the metric. */
  var name: js.UndefOr[MetricStructuredName] = js.native
  
  /** Worker-computed aggregate value for aggregation kinds "Sum", "Max", "Min", "And", and "Or". The possible value types are Long, Double, and Boolean. */
  var scalar: js.UndefOr[js.Any] = js.native
  
  /**
    * Worker-computed aggregate value for the "Set" aggregation kind. The only possible value type is a list of Values whose type can be Long, Double, or String, according to the metric's
    * type. All Values in the list must be of the same type.
    */
  var set: js.UndefOr[js.Any] = js.native
  
  /** Timestamp associated with the metric value. Optional when workers are reporting work progress; it will be filled in responses from the metrics API. */
  var updateTime: js.UndefOr[String] = js.native
}
object MetricUpdate {
  
  @scala.inline
  def apply(): MetricUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricUpdate]
  }
  
  @scala.inline
  implicit class MetricUpdateMutableBuilder[Self <: MetricUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCumulative(value: Boolean): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCumulativeUndefined: Self = StObject.set(x, "cumulative", js.undefined)
    
    @scala.inline
    def setDistribution(value: js.Any): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    @scala.inline
    def setGauge(value: js.Any): Self = StObject.set(x, "gauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaugeUndefined: Self = StObject.set(x, "gauge", js.undefined)
    
    @scala.inline
    def setInternal(value: js.Any): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMeanCount(value: js.Any): Self = StObject.set(x, "meanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanCountUndefined: Self = StObject.set(x, "meanCount", js.undefined)
    
    @scala.inline
    def setMeanSum(value: js.Any): Self = StObject.set(x, "meanSum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanSumUndefined: Self = StObject.set(x, "meanSum", js.undefined)
    
    @scala.inline
    def setName(value: MetricStructuredName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setScalar(value: js.Any): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalarUndefined: Self = StObject.set(x, "scalar", js.undefined)
    
    @scala.inline
    def setSet(value: js.Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
