package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscalingPolicyCustomMetricUtilization extends js.Object {
  
  /**
    * A filter string, compatible with a Stackdriver Monitoring filter string for TimeSeries.list API call. This filter is used to select a specific TimeSeries for the purpose of
    * autoscaling and to determine whether the metric is exporting per-instance or per-group data.
    *
    * For the filter to be valid for autoscaling purposes, the following rules apply:
    * - You can only use the AND operator for joining selectors.
    * - You can only use direct equality comparison operator (=) without any functions for each selector.
    * - You can specify the metric in both the filter string and in the metric field. However, if specified in both places, the metric must be identical.
    * - The monitored resource type determines what kind of values are expected for the metric. If it is a gce_instance, the autoscaler expects the metric to include a separate TimeSeries
    * for each instance in a group. In such a case, you cannot filter on resource labels.
    * If the resource type is any other value, the autoscaler expects this metric to contain values that apply to the entire autoscaled instance group and resource label filtering can be
    * performed to point autoscaler at the correct TimeSeries to scale upon. This is called a per-group metric for the purpose of autoscaling.
    *
    * If not specified, the type defaults to gce_instance.
    *
    * You should provide a filter that is selective enough to pick just one TimeSeries for the autoscaled group or for each of the instances (if you are using gce_instance resource type).
    * If multiple TimeSeries are returned upon the query execution, the autoscaler will sum their respective values to obtain its scaling value.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * The identifier (type) of the Stackdriver Monitoring metric. The metric cannot have negative values.
    *
    * The metric must have a value type of INT64 or DOUBLE.
    */
  var metric: js.UndefOr[String] = js.native
  
  /**
    * If scaling is based on a per-group metric value that represents the total amount of work to be done or resource usage, set this value to an amount assigned for a single instance of
    * the scaled group. Autoscaler will keep the number of instances proportional to the value of this metric, the metric itself should not change value due to group resizing.
    *
    * A good metric to use with the target is for example pubsub.googleapis.com/subscription/num_undelivered_messages or a custom metric exporting the total number of requests coming to
    * your instances.
    *
    * A bad example would be a metric exporting an average or median latency, since this value can't include a chunk assignable to a single instance, it could be better used with
    * utilization_target instead.
    */
  var singleInstanceAssignment: js.UndefOr[Double] = js.native
  
  /**
    * The target value of the metric that autoscaler should maintain. This must be a positive value. A utilization metric scales number of virtual machines handling requests to increase
    * or decrease proportionally to the metric.
    *
    * For example, a good metric to use as a utilization_target is https://www.googleapis.com/compute/v1/instance/network/received_bytes_count. The autoscaler will work to keep this value
    * constant for each of the instances.
    */
  var utilizationTarget: js.UndefOr[Double] = js.native
  
  /** Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE. */
  var utilizationTargetType: js.UndefOr[String] = js.native
}
object AutoscalingPolicyCustomMetricUtilization {
  
  @scala.inline
  def apply(): AutoscalingPolicyCustomMetricUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingPolicyCustomMetricUtilization]
  }
  
  @scala.inline
  implicit class AutoscalingPolicyCustomMetricUtilizationOps[Self <: AutoscalingPolicyCustomMetricUtilization] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setMetric(value: String): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    
    @scala.inline
    def setSingleInstanceAssignment(value: Double): Self = this.set("singleInstanceAssignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleInstanceAssignment: Self = this.set("singleInstanceAssignment", js.undefined)
    
    @scala.inline
    def setUtilizationTarget(value: Double): Self = this.set("utilizationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtilizationTarget: Self = this.set("utilizationTarget", js.undefined)
    
    @scala.inline
    def setUtilizationTargetType(value: String): Self = this.set("utilizationTargetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtilizationTargetType: Self = this.set("utilizationTargetType", js.undefined)
  }
}
