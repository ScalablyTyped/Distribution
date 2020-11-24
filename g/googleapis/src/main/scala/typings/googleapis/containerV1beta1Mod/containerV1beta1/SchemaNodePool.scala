package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodePool contains the name and configuration for a cluster&#39;s node pool.
  * Node pools are a set of nodes (i.e. VM&#39;s), with a common configuration
  * and specification, under the control of the cluster master. They may have a
  * set of Kubernetes labels applied to them, which may be used to reference
  * them during pod scheduling. They may also be resized up or down, to
  * accommodate the workload.
  */
@js.native
trait SchemaNodePool extends js.Object {
  
  /**
    * Autoscaler configuration for this NodePool. Autoscaler is enabled only if
    * a valid configuration is present.
    */
  var autoscaling: js.UndefOr[SchemaNodePoolAutoscaling] = js.native
  
  /**
    * Which conditions caused the current node pool state.
    */
  var conditions: js.UndefOr[js.Array[SchemaStatusCondition]] = js.native
  
  /**
    * The node configuration of the pool.
    */
  var config: js.UndefOr[SchemaNodeConfig] = js.native
  
  /**
    * The initial node count for the pool. You must ensure that your Compute
    * Engine &lt;a href=&quot;/compute/docs/resource-quotas&quot;&gt;resource
    * quota&lt;/a&gt; is sufficient for this number of instances. You must also
    * have available firewall and routes quota.
    */
  var initialNodeCount: js.UndefOr[Double] = js.native
  
  /**
    * [Output only] The resource URLs of the [managed instance
    * groups](/compute/docs/instance-groups/creating-groups-of-managed-instances)
    * associated with this node pool.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * NodeManagement configuration for this NodePool.
    */
  var management: js.UndefOr[SchemaNodeManagement] = js.native
  
  /**
    * The constraint on the maximum number of pods that can be run
    * simultaneously on a node in the node pool.
    */
  var maxPodsConstraint: js.UndefOr[SchemaMaxPodsConstraint] = js.native
  
  /**
    * The name of the node pool.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output only] The status of the nodes in this pool instance.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * [Output only] Additional information about the current status of this
    * node pool instance, if available.
    */
  var statusMessage: js.UndefOr[String] = js.native
  
  /**
    * The version of the Kubernetes of this node.
    */
  var version: js.UndefOr[String] = js.native
}
object SchemaNodePool {
  
  @scala.inline
  def apply(): SchemaNodePool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodePool]
  }
  
  @scala.inline
  implicit class SchemaNodePoolOps[Self <: SchemaNodePool] (val x: Self) extends AnyVal {
    
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
    def setAutoscaling(value: SchemaNodePoolAutoscaling): Self = this.set("autoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscaling: Self = this.set("autoscaling", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: SchemaStatusCondition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[SchemaStatusCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setConfig(value: SchemaNodeConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setInitialNodeCount(value: Double): Self = this.set("initialNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialNodeCount: Self = this.set("initialNodeCount", js.undefined)
    
    @scala.inline
    def setInstanceGroupUrlsVarargs(value: String*): Self = this.set("instanceGroupUrls", js.Array(value :_*))
    
    @scala.inline
    def setInstanceGroupUrls(value: js.Array[String]): Self = this.set("instanceGroupUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceGroupUrls: Self = this.set("instanceGroupUrls", js.undefined)
    
    @scala.inline
    def setManagement(value: SchemaNodeManagement): Self = this.set("management", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagement: Self = this.set("management", js.undefined)
    
    @scala.inline
    def setMaxPodsConstraint(value: SchemaMaxPodsConstraint): Self = this.set("maxPodsConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPodsConstraint: Self = this.set("maxPodsConstraint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
