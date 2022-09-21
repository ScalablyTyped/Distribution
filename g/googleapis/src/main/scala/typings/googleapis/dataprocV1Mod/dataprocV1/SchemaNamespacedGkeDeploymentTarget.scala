package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNamespacedGkeDeploymentTarget extends StObject {
  
  /**
    * Optional. A namespace within the GKE cluster to deploy into.
    */
  var clusterNamespace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The target GKE cluster to deploy to. Format: 'projects/{project\}/locations/{location\}/clusters/{cluster_id\}'
    */
  var targetGkeCluster: js.UndefOr[String | Null] = js.undefined
}
object SchemaNamespacedGkeDeploymentTarget {
  
  inline def apply(): SchemaNamespacedGkeDeploymentTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamespacedGkeDeploymentTarget]
  }
  
  extension [Self <: SchemaNamespacedGkeDeploymentTarget](x: Self) {
    
    inline def setClusterNamespace(value: String): Self = StObject.set(x, "clusterNamespace", value.asInstanceOf[js.Any])
    
    inline def setClusterNamespaceNull: Self = StObject.set(x, "clusterNamespace", null)
    
    inline def setClusterNamespaceUndefined: Self = StObject.set(x, "clusterNamespace", js.undefined)
    
    inline def setTargetGkeCluster(value: String): Self = StObject.set(x, "targetGkeCluster", value.asInstanceOf[js.Any])
    
    inline def setTargetGkeClusterNull: Self = StObject.set(x, "targetGkeCluster", null)
    
    inline def setTargetGkeClusterUndefined: Self = StObject.set(x, "targetGkeCluster", js.undefined)
  }
}
