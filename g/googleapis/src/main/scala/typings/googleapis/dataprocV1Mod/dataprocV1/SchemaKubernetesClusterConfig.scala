package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKubernetesClusterConfig extends StObject {
  
  /**
    * Required. The configuration for running the Dataproc cluster on GKE.
    */
  var gkeClusterConfig: js.UndefOr[SchemaGkeClusterConfig] = js.undefined
  
  /**
    * Optional. A namespace within the Kubernetes cluster to deploy into. If this namespace does not exist, it is created. If it exists, Dataproc verifies that another Dataproc VirtualCluster is not installed into it. If not specified, the name of the Dataproc Cluster is used.
    */
  var kubernetesNamespace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The software configuration for this Dataproc cluster running on Kubernetes.
    */
  var kubernetesSoftwareConfig: js.UndefOr[SchemaKubernetesSoftwareConfig] = js.undefined
}
object SchemaKubernetesClusterConfig {
  
  inline def apply(): SchemaKubernetesClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKubernetesClusterConfig]
  }
  
  extension [Self <: SchemaKubernetesClusterConfig](x: Self) {
    
    inline def setGkeClusterConfig(value: SchemaGkeClusterConfig): Self = StObject.set(x, "gkeClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setGkeClusterConfigUndefined: Self = StObject.set(x, "gkeClusterConfig", js.undefined)
    
    inline def setKubernetesNamespace(value: String): Self = StObject.set(x, "kubernetesNamespace", value.asInstanceOf[js.Any])
    
    inline def setKubernetesNamespaceNull: Self = StObject.set(x, "kubernetesNamespace", null)
    
    inline def setKubernetesNamespaceUndefined: Self = StObject.set(x, "kubernetesNamespace", js.undefined)
    
    inline def setKubernetesSoftwareConfig(value: SchemaKubernetesSoftwareConfig): Self = StObject.set(x, "kubernetesSoftwareConfig", value.asInstanceOf[js.Any])
    
    inline def setKubernetesSoftwareConfigUndefined: Self = StObject.set(x, "kubernetesSoftwareConfig", js.undefined)
  }
}
