package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamespacedGkeDeploymentTarget extends StObject {
  
  /** Optional. A namespace within the GKE cluster to deploy into. */
  var clusterNamespace: js.UndefOr[String] = js.undefined
  
  /** Optional. The target GKE cluster to deploy to. Format: 'projects/{project}/locations/{location}/clusters/{cluster_id}' */
  var targetGkeCluster: js.UndefOr[String] = js.undefined
}
object NamespacedGkeDeploymentTarget {
  
  inline def apply(): NamespacedGkeDeploymentTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespacedGkeDeploymentTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamespacedGkeDeploymentTarget] (val x: Self) extends AnyVal {
    
    inline def setClusterNamespace(value: String): Self = StObject.set(x, "clusterNamespace", value.asInstanceOf[js.Any])
    
    inline def setClusterNamespaceUndefined: Self = StObject.set(x, "clusterNamespace", js.undefined)
    
    inline def setTargetGkeCluster(value: String): Self = StObject.set(x, "targetGkeCluster", value.asInstanceOf[js.Any])
    
    inline def setTargetGkeClusterUndefined: Self = StObject.set(x, "targetGkeCluster", js.undefined)
  }
}
