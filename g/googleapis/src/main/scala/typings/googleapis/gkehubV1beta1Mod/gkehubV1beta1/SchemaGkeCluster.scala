package typings.googleapis.gkehubV1beta1Mod.gkehubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGkeCluster extends StObject {
  
  /**
    * Output only. If cluster_missing is set then it denotes that the GKE cluster no longer exists in the GKE Control Plane.
    */
  var clusterMissing: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Immutable. Self-link of the GCP resource for the GKE cluster. For example: //container.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster Zonal clusters are also supported.
    */
  var resourceLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaGkeCluster {
  
  inline def apply(): SchemaGkeCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGkeCluster]
  }
  
  extension [Self <: SchemaGkeCluster](x: Self) {
    
    inline def setClusterMissing(value: Boolean): Self = StObject.set(x, "clusterMissing", value.asInstanceOf[js.Any])
    
    inline def setClusterMissingNull: Self = StObject.set(x, "clusterMissing", null)
    
    inline def setClusterMissingUndefined: Self = StObject.set(x, "clusterMissing", js.undefined)
    
    inline def setResourceLink(value: String): Self = StObject.set(x, "resourceLink", value.asInstanceOf[js.Any])
    
    inline def setResourceLinkNull: Self = StObject.set(x, "resourceLink", null)
    
    inline def setResourceLinkUndefined: Self = StObject.set(x, "resourceLink", js.undefined)
  }
}
