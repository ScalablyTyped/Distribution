package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscalerStatusDetails extends js.Object {
  
  /** The status message. */
  var message: js.UndefOr[String] = js.native
  
  /**
    * The type of error, warning, or notice returned. Current set of possible values:
    * - ALL_INSTANCES_UNHEALTHY (WARNING): All instances in the instance group are unhealthy (not in RUNNING state).
    * - BACKEND_SERVICE_DOES_NOT_EXIST (ERROR): There is no backend service attached to the instance group.
    * - CAPPED_AT_MAX_NUM_REPLICAS (WARNING): Autoscaler recommends a size greater than maxNumReplicas.
    * - CUSTOM_METRIC_DATA_POINTS_TOO_SPARSE (WARNING): The custom metric samples are not exported often enough to be a credible base for autoscaling.
    * - CUSTOM_METRIC_INVALID (ERROR): The custom metric that was specified does not exist or does not have the necessary labels.
    * - MIN_EQUALS_MAX (WARNING): The minNumReplicas is equal to maxNumReplicas. This means the autoscaler cannot add or remove instances from the instance group.
    * - MISSING_CUSTOM_METRIC_DATA_POINTS (WARNING): The autoscaler did not receive any data from the custom metric configured for autoscaling.
    * - MISSING_LOAD_BALANCING_DATA_POINTS (WARNING): The autoscaler is configured to scale based on a load balancing signal but the instance group has not received any requests from the
    * load balancer.
    * - MODE_OFF (WARNING): Autoscaling is turned off. The number of instances in the group won't change automatically. The autoscaling configuration is preserved.
    * - MODE_ONLY_UP (WARNING): Autoscaling is in the "Autoscale only up" mode. The autoscaler can add instances but not remove any.
    * - MORE_THAN_ONE_BACKEND_SERVICE (ERROR): The instance group cannot be autoscaled because it has more than one backend service attached to it.
    * - NOT_ENOUGH_QUOTA_AVAILABLE (ERROR): There is insufficient quota for the necessary resources, such as CPU or number of instances.
    * - REGION_RESOURCE_STOCKOUT (ERROR): Shown only for regional autoscalers: there is a resource stockout in the chosen region.
    * - SCALING_TARGET_DOES_NOT_EXIST (ERROR): The target to be scaled does not exist.
    * - UNSUPPORTED_MAX_RATE_LOAD_BALANCING_CONFIGURATION (ERROR): Autoscaling does not work with an HTTP/S load balancer that has been configured for maxRate.
    * - ZONE_RESOURCE_STOCKOUT (ERROR): For zonal autoscalers: there is a resource stockout in the chosen zone. For regional autoscalers: in at least one of the zones you're using there
    * is a resource stockout.  New values might be added in the future. Some of the values might not be available in all API versions.
    */
  var `type`: js.UndefOr[String] = js.native
}
object AutoscalerStatusDetails {
  
  @scala.inline
  def apply(): AutoscalerStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalerStatusDetails]
  }
  
  @scala.inline
  implicit class AutoscalerStatusDetailsOps[Self <: AutoscalerStatusDetails] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
