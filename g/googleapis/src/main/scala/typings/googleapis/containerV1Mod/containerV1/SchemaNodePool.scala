package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodePool extends StObject {
  
  /**
    * Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
    */
  var autoscaling: js.UndefOr[SchemaNodePoolAutoscaling] = js.undefined
  
  /**
    * Which conditions caused the current node pool state.
    */
  var conditions: js.UndefOr[js.Array[SchemaStatusCondition]] = js.undefined
  
  /**
    * The node configuration of the pool.
    */
  var config: js.UndefOr[SchemaNodeConfig] = js.undefined
  
  /**
    * The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
    */
  var initialNodeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output only] The resource URLs of the [managed instance groups](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances) associated with this node pool. During the node pool blue-green upgrade operation, the URLs contain both blue and green resources.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
    */
  var locations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * NodeManagement configuration for this NodePool.
    */
  var management: js.UndefOr[SchemaNodeManagement] = js.undefined
  
  /**
    * The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
    */
  var maxPodsConstraint: js.UndefOr[SchemaMaxPodsConstraint] = js.undefined
  
  /**
    * The name of the node pool.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
    */
  var networkConfig: js.UndefOr[SchemaNodeNetworkConfig] = js.undefined
  
  /**
    * [Output only] The pod CIDR block size per node in this node pool.
    */
  var podIpv4CidrSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only] The status of the nodes in this pool instance.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only] Deprecated. Use conditions instead. Additional information about the current status of this node pool instance, if available.
    */
  var statusMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. [Output only] Update info contains relevant information during a node pool update.
    */
  var updateInfo: js.UndefOr[SchemaUpdateInfo] = js.undefined
  
  /**
    * Upgrade settings control disruption and speed of the upgrade.
    */
  var upgradeSettings: js.UndefOr[SchemaUpgradeSettings] = js.undefined
  
  /**
    * The version of the Kubernetes of this node.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaNodePool {
  
  inline def apply(): SchemaNodePool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodePool]
  }
  
  extension [Self <: SchemaNodePool](x: Self) {
    
    inline def setAutoscaling(value: SchemaNodePoolAutoscaling): Self = StObject.set(x, "autoscaling", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingUndefined: Self = StObject.set(x, "autoscaling", js.undefined)
    
    inline def setConditions(value: js.Array[SchemaStatusCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaStatusCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setConfig(value: SchemaNodeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setInitialNodeCount(value: Double): Self = StObject.set(x, "initialNodeCount", value.asInstanceOf[js.Any])
    
    inline def setInitialNodeCountNull: Self = StObject.set(x, "initialNodeCount", null)
    
    inline def setInitialNodeCountUndefined: Self = StObject.set(x, "initialNodeCount", js.undefined)
    
    inline def setInstanceGroupUrls(value: js.Array[String]): Self = StObject.set(x, "instanceGroupUrls", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupUrlsNull: Self = StObject.set(x, "instanceGroupUrls", null)
    
    inline def setInstanceGroupUrlsUndefined: Self = StObject.set(x, "instanceGroupUrls", js.undefined)
    
    inline def setInstanceGroupUrlsVarargs(value: String*): Self = StObject.set(x, "instanceGroupUrls", js.Array(value*))
    
    inline def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setManagement(value: SchemaNodeManagement): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
    
    inline def setManagementUndefined: Self = StObject.set(x, "management", js.undefined)
    
    inline def setMaxPodsConstraint(value: SchemaMaxPodsConstraint): Self = StObject.set(x, "maxPodsConstraint", value.asInstanceOf[js.Any])
    
    inline def setMaxPodsConstraintUndefined: Self = StObject.set(x, "maxPodsConstraint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkConfig(value: SchemaNodeNetworkConfig): Self = StObject.set(x, "networkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "networkConfig", js.undefined)
    
    inline def setPodIpv4CidrSize(value: Double): Self = StObject.set(x, "podIpv4CidrSize", value.asInstanceOf[js.Any])
    
    inline def setPodIpv4CidrSizeNull: Self = StObject.set(x, "podIpv4CidrSize", null)
    
    inline def setPodIpv4CidrSizeUndefined: Self = StObject.set(x, "podIpv4CidrSize", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdateInfo(value: SchemaUpdateInfo): Self = StObject.set(x, "updateInfo", value.asInstanceOf[js.Any])
    
    inline def setUpdateInfoUndefined: Self = StObject.set(x, "updateInfo", js.undefined)
    
    inline def setUpgradeSettings(value: SchemaUpgradeSettings): Self = StObject.set(x, "upgradeSettings", value.asInstanceOf[js.Any])
    
    inline def setUpgradeSettingsUndefined: Self = StObject.set(x, "upgradeSettings", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
