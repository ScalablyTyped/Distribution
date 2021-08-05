package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNodePoolRequest extends StObject {
  
  /** Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field. */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /** Required. The desired image type for the node pool. */
  var imageType: js.UndefOr[String] = js.undefined
  
  /**
    * The desired list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the node pool's nodes should be located. Changing the locations for
    * a node pool will result in nodes being either created or removed from the node pool, depending on whether locations are being added or removed.
    */
  var locations: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The name (project, location, cluster, node pool) of the node pool to update. Specified in the format `projects/∗/locations/∗/clusters/∗/nodePools/ *`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced by the name field. */
  var nodePoolId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Kubernetes version to change the nodes to (typically an upgrade). Users may specify either explicit versions offered by Kubernetes Engine or version aliases, which
    * have the following behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the
    * highest valid gke.N patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the Kubernetes master version
    */
  var nodeVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name
    * field.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
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
  
  extension [Self <: UpdateNodePoolRequest](x: Self) {
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    inline def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodePoolId(value: String): Self = StObject.set(x, "nodePoolId", value.asInstanceOf[js.Any])
    
    inline def setNodePoolIdUndefined: Self = StObject.set(x, "nodePoolId", js.undefined)
    
    inline def setNodeVersion(value: String): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
    
    inline def setNodeVersionUndefined: Self = StObject.set(x, "nodeVersion", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setUpgradeSettings(value: UpgradeSettings): Self = StObject.set(x, "upgradeSettings", value.asInstanceOf[js.Any])
    
    inline def setUpgradeSettingsUndefined: Self = StObject.set(x, "upgradeSettings", js.undefined)
    
    inline def setWorkloadMetadataConfig(value: WorkloadMetadataConfig): Self = StObject.set(x, "workloadMetadataConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkloadMetadataConfigUndefined: Self = StObject.set(x, "workloadMetadataConfig", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
