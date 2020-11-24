package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodePool extends js.Object {
  
  /** Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present. */
  var autoscaling: js.UndefOr[NodePoolAutoscaling] = js.native
  
  /** Which conditions caused the current node pool state. */
  var conditions: js.UndefOr[js.Array[StatusCondition]] = js.native
  
  /** The node configuration of the pool. */
  var config: js.UndefOr[NodeConfig] = js.native
  
  /**
    * The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances.
    * You must also have available firewall and routes quota.
    */
  var initialNodeCount: js.UndefOr[Double] = js.native
  
  /**
    * [Output only] The resource URLs of the [managed instance groups](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances) associated with this
    * node pool.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes should be located. If this value is unspecified during
    * node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be
    * used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
    */
  var locations: js.UndefOr[js.Array[String]] = js.native
  
  /** NodeManagement configuration for this NodePool. */
  var management: js.UndefOr[NodeManagement] = js.native
  
  /** The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool. */
  var maxPodsConstraint: js.UndefOr[MaxPodsConstraint] = js.native
  
  /** The name of the node pool. */
  var name: js.UndefOr[String] = js.native
  
  /** [Output only] The pod CIDR block size per node in this node pool. */
  var podIpv4CidrSize: js.UndefOr[Double] = js.native
  
  /** [Output only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** [Output only] The status of the nodes in this pool instance. */
  var status: js.UndefOr[String] = js.native
  
  /** [Output only] Additional information about the current status of this node pool instance, if available. */
  var statusMessage: js.UndefOr[String] = js.native
  
  /** Upgrade settings control disruption and speed of the upgrade. */
  var upgradeSettings: js.UndefOr[UpgradeSettings] = js.native
  
  /** The version of the Kubernetes of this node. */
  var version: js.UndefOr[String] = js.native
}
object NodePool {
  
  @scala.inline
  def apply(): NodePool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePool]
  }
  
  @scala.inline
  implicit class NodePoolOps[Self <: NodePool] (val x: Self) extends AnyVal {
    
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
    def setAutoscaling(value: NodePoolAutoscaling): Self = this.set("autoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscaling: Self = this.set("autoscaling", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: StatusCondition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[StatusCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setConfig(value: NodeConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
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
    def setLocationsVarargs(value: String*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[String]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setManagement(value: NodeManagement): Self = this.set("management", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagement: Self = this.set("management", js.undefined)
    
    @scala.inline
    def setMaxPodsConstraint(value: MaxPodsConstraint): Self = this.set("maxPodsConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPodsConstraint: Self = this.set("maxPodsConstraint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPodIpv4CidrSize(value: Double): Self = this.set("podIpv4CidrSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodIpv4CidrSize: Self = this.set("podIpv4CidrSize", js.undefined)
    
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
    def setUpgradeSettings(value: UpgradeSettings): Self = this.set("upgradeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeSettings: Self = this.set("upgradeSettings", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
