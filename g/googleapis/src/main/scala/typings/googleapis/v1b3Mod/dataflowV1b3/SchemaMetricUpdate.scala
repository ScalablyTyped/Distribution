package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the state of a metric.
  */
@js.native
trait SchemaMetricUpdate extends js.Object {
  
  /**
    * True if this metric is reported as the total cumulative aggregate value
    * accumulated since the worker started working on this WorkItem. By default
    * this is false, indicating that this metric is reported as a delta that is
    * not associated with any WorkItem.
    */
  var cumulative: js.UndefOr[Boolean] = js.native
  
  /**
    * A struct value describing properties of a distribution of numeric values.
    */
  var distribution: js.UndefOr[js.Any] = js.native
  
  /**
    * A struct value describing properties of a Gauge. Metrics of gauge type
    * show the value of a metric across time, and is aggregated based on the
    * newest value.
    */
  var gauge: js.UndefOr[js.Any] = js.native
  
  /**
    * Worker-computed aggregate value for internal use by the Dataflow service.
    */
  var internal: js.UndefOr[js.Any] = js.native
  
  /**
    * Metric aggregation kind.  The possible metric aggregation kinds are
    * &quot;Sum&quot;, &quot;Max&quot;, &quot;Min&quot;, &quot;Mean&quot;,
    * &quot;Set&quot;, &quot;And&quot;, &quot;Or&quot;, and
    * &quot;Distribution&quot;. The specified aggregation kind is
    * case-insensitive.  If omitted, this is not an aggregated value but
    * instead a single metric sample value.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Worker-computed aggregate value for the &quot;Mean&quot; aggregation
    * kind. This holds the count of the aggregated values and is used in
    * combination with mean_sum above to obtain the actual mean aggregate
    * value. The only possible value type is Long.
    */
  var meanCount: js.UndefOr[js.Any] = js.native
  
  /**
    * Worker-computed aggregate value for the &quot;Mean&quot; aggregation
    * kind. This holds the sum of the aggregated values and is used in
    * combination with mean_count below to obtain the actual mean aggregate
    * value. The only possible value types are Long and Double.
    */
  var meanSum: js.UndefOr[js.Any] = js.native
  
  /**
    * Name of the metric.
    */
  var name: js.UndefOr[SchemaMetricStructuredName] = js.native
  
  /**
    * Worker-computed aggregate value for aggregation kinds &quot;Sum&quot;,
    * &quot;Max&quot;, &quot;Min&quot;, &quot;And&quot;, and &quot;Or&quot;.
    * The possible value types are Long, Double, and Boolean.
    */
  var scalar: js.UndefOr[js.Any] = js.native
  
  /**
    * Worker-computed aggregate value for the &quot;Set&quot; aggregation kind.
    * The only possible value type is a list of Values whose type can be Long,
    * Double, or String, according to the metric&#39;s type.  All Values in the
    * list must be of the same type.
    */
  var set: js.UndefOr[js.Any] = js.native
  
  /**
    * Timestamp associated with the metric value. Optional when workers are
    * reporting work progress; it will be filled in responses from the metrics
    * API.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaMetricUpdate {
  
  @scala.inline
  def apply(): SchemaMetricUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricUpdate]
  }
  
  @scala.inline
  implicit class SchemaMetricUpdateOps[Self <: SchemaMetricUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCumulative(value: Boolean): Self = this.set("cumulative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCumulative: Self = this.set("cumulative", js.undefined)
    
    @scala.inline
    def setDistribution(value: js.Any): Self = this.set("distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistribution: Self = this.set("distribution", js.undefined)
    
    @scala.inline
    def setGauge(value: js.Any): Self = this.set("gauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGauge: Self = this.set("gauge", js.undefined)
    
    @scala.inline
    def setInternal(value: js.Any): Self = this.set("internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMeanCount(value: js.Any): Self = this.set("meanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeanCount: Self = this.set("meanCount", js.undefined)
    
    @scala.inline
    def setMeanSum(value: js.Any): Self = this.set("meanSum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeanSum: Self = this.set("meanSum", js.undefined)
    
    @scala.inline
    def setName(value: SchemaMetricStructuredName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setScalar(value: js.Any): Self = this.set("scalar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalar: Self = this.set("scalar", js.undefined)
    
    @scala.inline
    def setSet(value: js.Any): Self = this.set("set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
