package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNodePoolRequest extends StObject {
  
  /** Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field. */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /** Confidential nodes config. All the nodes in the node pool will be Confidential VM once enabled. */
  var confidentialNodes: js.UndefOr[ConfidentialNodes] = js.undefined
  
  /** GCFS config. */
  var gcfsConfig: js.UndefOr[GcfsConfig] = js.undefined
  
  /** Enable or disable gvnic on the node pool. */
  var gvnic: js.UndefOr[VirtualNIC] = js.undefined
  
  /** Required. The desired image type for the node pool. */
  var imageType: js.UndefOr[String] = js.undefined
  
  /** Node kubelet configs. */
  var kubeletConfig: js.UndefOr[NodeKubeletConfig] = js.undefined
  
  /**
    * The desired node labels to be applied to all nodes in the node pool. If this field is not present, the labels will not be changed. Otherwise, the existing node labels will be
    * *replaced* with the provided labels.
    */
  var labels: js.UndefOr[NodeLabels] = js.undefined
  
  /** Parameters that can be configured on Linux nodes. */
  var linuxNodeConfig: js.UndefOr[LinuxNodeConfig] = js.undefined
  
  /**
    * The desired list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the node pool's nodes should be located. Changing the locations for
    * a node pool will result in nodes being either created or removed from the node pool, depending on whether locations are being added or removed.
    */
  var locations: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The name (project, location, cluster, node pool) of the node pool to update. Specified in the format `projects/ *‍/locations/ *‍/clusters/ *‍/nodePools/ *`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Node network config. */
  var nodeNetworkConfig: js.UndefOr[NodeNetworkConfig] = js.undefined
  
  /** Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced by the name field. */
  var nodePoolId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Kubernetes version to change the nodes to (typically an upgrade). Users may specify either explicit versions offered by Kubernetes Engine or version aliases, which
    * have the following behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the
    * highest valid gke.N patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the Kubernetes master version
    */
  var nodeVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated
    * and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * The desired network tags to be applied to all nodes in the node pool. If this field is not present, the tags will not be changed. Otherwise, the existing network tags will be
    * *replaced* with the provided tags.
    */
  var tags: js.UndefOr[NetworkTags] = js.undefined
  
  /**
    * The desired node taints to be applied to all nodes in the node pool. If this field is not present, the taints will not be changed. Otherwise, the existing node taints will be
    * *replaced* with the provided taints.
    */
  var taints: js.UndefOr[NodeTaints] = js.undefined
  
  /** Upgrade settings control disruption and speed of the upgrade. */
  var upgradeSettings: js.UndefOr[UpgradeSettings] = js.undefined
  
  /** The desired workload metadata config for the node pool. */
  var workloadMetadataConfig: js.UndefOr[WorkloadMetadataConfig] = js.undefined
  
  /**
    * Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and
    * replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object UpdateNodePoolRequest {
  
  inline def apply(): UpdateNodePoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNodePoolRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateNodePoolRequest] (val x: Self) extends AnyVal {
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setConfidentialNodes(value: ConfidentialNodes): Self = StObject.set(x, "confidentialNodes", value.asInstanceOf[js.Any])
    
    inline def setConfidentialNodesUndefined: Self = StObject.set(x, "confidentialNodes", js.undefined)
    
    inline def setGcfsConfig(value: GcfsConfig): Self = StObject.set(x, "gcfsConfig", value.asInstanceOf[js.Any])
    
    inline def setGcfsConfigUndefined: Self = StObject.set(x, "gcfsConfig", js.undefined)
    
    inline def setGvnic(value: VirtualNIC): Self = StObject.set(x, "gvnic", value.asInstanceOf[js.Any])
    
    inline def setGvnicUndefined: Self = StObject.set(x, "gvnic", js.undefined)
    
    inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    inline def setKubeletConfig(value: NodeKubeletConfig): Self = StObject.set(x, "kubeletConfig", value.asInstanceOf[js.Any])
    
    inline def setKubeletConfigUndefined: Self = StObject.set(x, "kubeletConfig", js.undefined)
    
    inline def setLabels(value: NodeLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLinuxNodeConfig(value: LinuxNodeConfig): Self = StObject.set(x, "linuxNodeConfig", value.asInstanceOf[js.Any])
    
    inline def setLinuxNodeConfigUndefined: Self = StObject.set(x, "linuxNodeConfig", js.undefined)
    
    inline def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeNetworkConfig(value: NodeNetworkConfig): Self = StObject.set(x, "nodeNetworkConfig", value.asInstanceOf[js.Any])
    
    inline def setNodeNetworkConfigUndefined: Self = StObject.set(x, "nodeNetworkConfig", js.undefined)
    
    inline def setNodePoolId(value: String): Self = StObject.set(x, "nodePoolId", value.asInstanceOf[js.Any])
    
    inline def setNodePoolIdUndefined: Self = StObject.set(x, "nodePoolId", js.undefined)
    
    inline def setNodeVersion(value: String): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
    
    inline def setNodeVersionUndefined: Self = StObject.set(x, "nodeVersion", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTags(value: NetworkTags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTaints(value: NodeTaints): Self = StObject.set(x, "taints", value.asInstanceOf[js.Any])
    
    inline def setTaintsUndefined: Self = StObject.set(x, "taints", js.undefined)
    
    inline def setUpgradeSettings(value: UpgradeSettings): Self = StObject.set(x, "upgradeSettings", value.asInstanceOf[js.Any])
    
    inline def setUpgradeSettingsUndefined: Self = StObject.set(x, "upgradeSettings", js.undefined)
    
    inline def setWorkloadMetadataConfig(value: WorkloadMetadataConfig): Self = StObject.set(x, "workloadMetadataConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkloadMetadataConfigUndefined: Self = StObject.set(x, "workloadMetadataConfig", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
