package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesClusterConfig extends StObject {
  
  /** Required. The configuration for running the Dataproc cluster on GKE. */
  var gkeClusterConfig: js.UndefOr[GkeClusterConfig] = js.undefined
  
  /**
    * Optional. A namespace within the Kubernetes cluster to deploy into. If this namespace does not exist, it is created. If it exists, Dataproc verifies that another Dataproc
    * VirtualCluster is not installed into it. If not specified, the name of the Dataproc Cluster is used.
    */
  var kubernetesNamespace: js.UndefOr[String] = js.undefined
  
  /** Optional. The software configuration for this Dataproc cluster running on Kubernetes. */
  var kubernetesSoftwareConfig: js.UndefOr[KubernetesSoftwareConfig] = js.undefined
}
object KubernetesClusterConfig {
  
  inline def apply(): KubernetesClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesClusterConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KubernetesClusterConfig] (val x: Self) extends AnyVal {
    
    inline def setGkeClusterConfig(value: GkeClusterConfig): Self = StObject.set(x, "gkeClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setGkeClusterConfigUndefined: Self = StObject.set(x, "gkeClusterConfig", js.undefined)
    
    inline def setKubernetesNamespace(value: String): Self = StObject.set(x, "kubernetesNamespace", value.asInstanceOf[js.Any])
    
    inline def setKubernetesNamespaceUndefined: Self = StObject.set(x, "kubernetesNamespace", js.undefined)
    
    inline def setKubernetesSoftwareConfig(value: KubernetesSoftwareConfig): Self = StObject.set(x, "kubernetesSoftwareConfig", value.asInstanceOf[js.Any])
    
    inline def setKubernetesSoftwareConfigUndefined: Self = StObject.set(x, "kubernetesSoftwareConfig", js.undefined)
  }
}
