package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom utilization metric policy.
  */
@js.native
trait SchemaAutoscalingPolicyCustomMetricUtilization extends js.Object {
  /**
    * The identifier (type) of the Stackdriver Monitoring metric. The metric
    * cannot have negative values.  The metric must have a value type of INT64
    * or DOUBLE.
    */
  var metric: js.UndefOr[String] = js.native
  /**
    * The target value of the metric that autoscaler should maintain. This must
    * be a positive value. A utilization metric scales number of virtual
    * machines handling requests to increase or decrease proportionally to the
    * metric.  For example, a good metric to use as a utilization_target is
    * compute.googleapis.com/instance/network/received_bytes_count. The
    * autoscaler will work to keep this value constant for each of the
    * instances.
    */
  var utilizationTarget: js.UndefOr[Double] = js.native
  /**
    * Defines how target utilization value is expressed for a Stackdriver
    * Monitoring metric. Either GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE.
    */
  var utilizationTargetType: js.UndefOr[String] = js.native
}

object SchemaAutoscalingPolicyCustomMetricUtilization {
  @scala.inline
  def apply(
    metric: String = null,
    utilizationTarget: js.UndefOr[Double] = js.undefined,
    utilizationTargetType: String = null
  ): SchemaAutoscalingPolicyCustomMetricUtilization = {
    val __obj = js.Dynamic.literal()
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (!js.isUndefined(utilizationTarget)) __obj.updateDynamic("utilizationTarget")(utilizationTarget.get.asInstanceOf[js.Any])
    if (utilizationTargetType != null) __obj.updateDynamic("utilizationTargetType")(utilizationTargetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoscalingPolicyCustomMetricUtilization]
  }
}

