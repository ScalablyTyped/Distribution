package typings.googleapis.gkehubV1alpha2Mod.gkehubV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOnPremCluster extends StObject {
  
  /**
    * Immutable. Whether the cluster is an admin cluster.
    */
  var adminCluster: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. If cluster_missing is set then it denotes that API(gkeonprem.googleapis.com) resource for this GKE On-Prem cluster no longer exists.
    */
  var clusterMissing: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Immutable. The on prem cluster's type.
    */
  var clusterType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For example: //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
    */
  var resourceLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaOnPremCluster {
  
  inline def apply(): SchemaOnPremCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOnPremCluster]
  }
  
  extension [Self <: SchemaOnPremCluster](x: Self) {
    
    inline def setAdminCluster(value: Boolean): Self = StObject.set(x, "adminCluster", value.asInstanceOf[js.Any])
    
    inline def setAdminClusterNull: Self = StObject.set(x, "adminCluster", null)
    
    inline def setAdminClusterUndefined: Self = StObject.set(x, "adminCluster", js.undefined)
    
    inline def setClusterMissing(value: Boolean): Self = StObject.set(x, "clusterMissing", value.asInstanceOf[js.Any])
    
    inline def setClusterMissingNull: Self = StObject.set(x, "clusterMissing", null)
    
    inline def setClusterMissingUndefined: Self = StObject.set(x, "clusterMissing", js.undefined)
    
    inline def setClusterType(value: String): Self = StObject.set(x, "clusterType", value.asInstanceOf[js.Any])
    
    inline def setClusterTypeNull: Self = StObject.set(x, "clusterType", null)
    
    inline def setClusterTypeUndefined: Self = StObject.set(x, "clusterType", js.undefined)
    
    inline def setResourceLink(value: String): Self = StObject.set(x, "resourceLink", value.asInstanceOf[js.Any])
    
    inline def setResourceLinkNull: Self = StObject.set(x, "resourceLink", null)
    
    inline def setResourceLinkUndefined: Self = StObject.set(x, "resourceLink", js.undefined)
  }
}
