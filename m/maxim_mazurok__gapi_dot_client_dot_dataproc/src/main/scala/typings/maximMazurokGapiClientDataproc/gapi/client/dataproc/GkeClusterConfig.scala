package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GkeClusterConfig extends StObject {
  
  /**
    * Optional. A target GKE cluster to deploy to. It must be in the same project and region as the Dataproc cluster (the GKE cluster can be zonal or regional). Format:
    * 'projects/{project}/locations/{location}/clusters/{cluster_id}'
    */
  var gkeClusterTarget: js.UndefOr[String] = js.undefined
  
  /** Optional. Deprecated. Use gkeClusterTarget. Used only for the deprecated beta. A target for the deployment. */
  var namespacedGkeDeploymentTarget: js.UndefOr[NamespacedGkeDeploymentTarget] = js.undefined
  
  /**
    * Optional. GKE node pools where workloads will be scheduled. At least one node pool must be assigned the DEFAULT GkeNodePoolTarget.Role. If a GkeNodePoolTarget is not specified,
    * Dataproc constructs a DEFAULT GkeNodePoolTarget. Each role can be given to only one GkeNodePoolTarget. All node pools must have the same location settings.
    */
  var nodePoolTarget: js.UndefOr[js.Array[GkeNodePoolTarget]] = js.undefined
}
object GkeClusterConfig {
  
  inline def apply(): GkeClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GkeClusterConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GkeClusterConfig] (val x: Self) extends AnyVal {
    
    inline def setGkeClusterTarget(value: String): Self = StObject.set(x, "gkeClusterTarget", value.asInstanceOf[js.Any])
    
    inline def setGkeClusterTargetUndefined: Self = StObject.set(x, "gkeClusterTarget", js.undefined)
    
    inline def setNamespacedGkeDeploymentTarget(value: NamespacedGkeDeploymentTarget): Self = StObject.set(x, "namespacedGkeDeploymentTarget", value.asInstanceOf[js.Any])
    
    inline def setNamespacedGkeDeploymentTargetUndefined: Self = StObject.set(x, "namespacedGkeDeploymentTarget", js.undefined)
    
    inline def setNodePoolTarget(value: js.Array[GkeNodePoolTarget]): Self = StObject.set(x, "nodePoolTarget", value.asInstanceOf[js.Any])
    
    inline def setNodePoolTargetUndefined: Self = StObject.set(x, "nodePoolTarget", js.undefined)
    
    inline def setNodePoolTargetVarargs(value: GkeNodePoolTarget*): Self = StObject.set(x, "nodePoolTarget", js.Array(value*))
  }
}
