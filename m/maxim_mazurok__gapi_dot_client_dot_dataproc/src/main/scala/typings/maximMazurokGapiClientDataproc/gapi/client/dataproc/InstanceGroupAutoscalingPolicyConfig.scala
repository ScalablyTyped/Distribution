package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupAutoscalingPolicyConfig extends js.Object {
  
  /**
    * Required. Maximum number of instances for this group. Required for primary workers. Note that by default, clusters will not use secondary workers. Required for secondary workers if
    * the minimum secondary instances is set.Primary workers - Bounds: [min_instances, ). Secondary workers - Bounds: [min_instances, ). Default: 0.
    */
  var maxInstances: js.UndefOr[Double] = js.native
  
  /** Optional. Minimum number of instances for this group.Primary workers - Bounds: 2, max_instances. Default: 2. Secondary workers - Bounds: 0, max_instances. Default: 0. */
  var minInstances: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Weight for the instance group, which is used to determine the fraction of total workers in the cluster from this instance group. For example, if primary workers have
    * weight 2, and secondary workers have weight 1, the cluster will have approximately 2 primary workers for each secondary worker.The cluster may not reach the specified balance if
    * constrained by min/max bounds or other autoscaling settings. For example, if max_instances for secondary workers is 0, then only primary workers will be added. The cluster can also
    * be out of balance when created.If weight is not set on any instance group, the cluster will default to equal weight for all groups: the cluster will attempt to maintain an equal
    * number of workers in each group within the configured size bounds for each group. If weight is set for one group only, the cluster will default to zero weight on the unset group.
    * For example if weight is set only on primary workers, the cluster will use primary workers only and no secondary workers.
    */
  var weight: js.UndefOr[Double] = js.native
}
object InstanceGroupAutoscalingPolicyConfig {
  
  @scala.inline
  def apply(): InstanceGroupAutoscalingPolicyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupAutoscalingPolicyConfig]
  }
  
  @scala.inline
  implicit class InstanceGroupAutoscalingPolicyConfigOps[Self <: InstanceGroupAutoscalingPolicyConfig] (val x: Self) extends AnyVal {
    
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
    def setMaxInstances(value: Double): Self = this.set("maxInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInstances: Self = this.set("maxInstances", js.undefined)
    
    @scala.inline
    def setMinInstances(value: Double): Self = this.set("minInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinInstances: Self = this.set("minInstances", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
