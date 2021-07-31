package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodePool extends StObject {
  
  /** Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present. */
  var autoscaling: js.UndefOr[NodePoolAutoscaling] = js.undefined
  
  /** Which conditions caused the current node pool state. */
  var conditions: js.UndefOr[js.Array[StatusCondition]] = js.undefined
  
  /** The node configuration of the pool. */
  var config: js.UndefOr[NodeConfig] = js.undefined
  
  /**
    * The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances.
    * You must also have available firewall and routes quota.
    */
  var initialNodeCount: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output only] The resource URLs of the [managed instance groups](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances) associated with this
    * node pool.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes should be located. If this value is unspecified during
    * node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be
    * used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
    */
  var locations: js.UndefOr[js.Array[String]] = js.undefined
  
  /** NodeManagement configuration for this NodePool. */
  var management: js.UndefOr[NodeManagement] = js.undefined
  
  /** The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool. */
  var maxPodsConstraint: js.UndefOr[MaxPodsConstraint] = js.undefined
  
  /** The name of the node pool. */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Output only] The pod CIDR block size per node in this node pool. */
  var podIpv4CidrSize: js.UndefOr[Double] = js.undefined
  
  /** [Output only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** [Output only] The status of the nodes in this pool instance. */
  var status: js.UndefOr[String] = js.undefined
  
  /** [Output only] Additional information about the current status of this node pool instance, if available. */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /** Upgrade settings control disruption and speed of the upgrade. */
  var upgradeSettings: js.UndefOr[UpgradeSettings] = js.undefined
  
  /** The version of the Kubernetes of this node. */
  var version: js.UndefOr[String] = js.undefined
}
object NodePool {
  
  @scala.inline
  def apply(): NodePool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePool]
  }
  
  @scala.inline
  implicit class NodePoolMutableBuilder[Self <: NodePool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscaling(value: NodePoolAutoscaling): Self = StObject.set(x, "autoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingUndefined: Self = StObject.set(x, "autoscaling", js.undefined)
    
    @scala.inline
    def setConditions(value: js.Array[StatusCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: StatusCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setConfig(value: NodeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setInitialNodeCount(value: Double): Self = StObject.set(x, "initialNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialNodeCountUndefined: Self = StObject.set(x, "initialNodeCount", js.undefined)
    
    @scala.inline
    def setInstanceGroupUrls(value: js.Array[String]): Self = StObject.set(x, "instanceGroupUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupUrlsUndefined: Self = StObject.set(x, "instanceGroupUrls", js.undefined)
    
    @scala.inline
    def setInstanceGroupUrlsVarargs(value: String*): Self = StObject.set(x, "instanceGroupUrls", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setManagement(value: NodeManagement): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementUndefined: Self = StObject.set(x, "management", js.undefined)
    
    @scala.inline
    def setMaxPodsConstraint(value: MaxPodsConstraint): Self = StObject.set(x, "maxPodsConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPodsConstraintUndefined: Self = StObject.set(x, "maxPodsConstraint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPodIpv4CidrSize(value: Double): Self = StObject.set(x, "podIpv4CidrSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodIpv4CidrSizeUndefined: Self = StObject.set(x, "podIpv4CidrSize", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUpgradeSettings(value: UpgradeSettings): Self = StObject.set(x, "upgradeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeSettingsUndefined: Self = StObject.set(x, "upgradeSettings", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
