package typings.googleapis.gkehubV1alpha2Mod.gkehubV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMultiCloudCluster extends StObject {
  
  /**
    * Output only. If cluster_missing is set then it denotes that API(gkemulticloud.googleapis.com) resource for this GKE Multi-Cloud cluster no longer exists.
    */
  var clusterMissing: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster. For example: //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/attachedClusters/my-cluster
    */
  var resourceLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaMultiCloudCluster {
  
  inline def apply(): SchemaMultiCloudCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultiCloudCluster]
  }
  
  extension [Self <: SchemaMultiCloudCluster](x: Self) {
    
    inline def setClusterMissing(value: Boolean): Self = StObject.set(x, "clusterMissing", value.asInstanceOf[js.Any])
    
    inline def setClusterMissingNull: Self = StObject.set(x, "clusterMissing", null)
    
    inline def setClusterMissingUndefined: Self = StObject.set(x, "clusterMissing", js.undefined)
    
    inline def setResourceLink(value: String): Self = StObject.set(x, "resourceLink", value.asInstanceOf[js.Any])
    
    inline def setResourceLinkNull: Self = StObject.set(x, "resourceLink", null)
    
    inline def setResourceLinkUndefined: Self = StObject.set(x, "resourceLink", js.undefined)
  }
}
