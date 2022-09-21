package typings.googleapis.gkehubV1beta1Mod.gkehubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKubernetesMetadata extends StObject {
  
  /**
    * Output only. Kubernetes API server version string as reported by '/version'.
    */
  var kubernetesApiServerVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The total memory capacity as reported by the sum of all Kubernetes nodes resources, defined in MB.
    */
  var memoryMb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Node count as reported by Kubernetes nodes resources.
    */
  var nodeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Node providerID as reported by the first node in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the node_count will be zero and the node_provider_id will be empty.
    */
  var nodeProviderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which these details were last updated. This update_time is different from the Membership-level update_time since EndpointDetails are updated internally for API consumers.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. vCPU count as reported by Kubernetes nodes resources.
    */
  var vcpuCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaKubernetesMetadata {
  
  inline def apply(): SchemaKubernetesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKubernetesMetadata]
  }
  
  extension [Self <: SchemaKubernetesMetadata](x: Self) {
    
    inline def setKubernetesApiServerVersion(value: String): Self = StObject.set(x, "kubernetesApiServerVersion", value.asInstanceOf[js.Any])
    
    inline def setKubernetesApiServerVersionNull: Self = StObject.set(x, "kubernetesApiServerVersion", null)
    
    inline def setKubernetesApiServerVersionUndefined: Self = StObject.set(x, "kubernetesApiServerVersion", js.undefined)
    
    inline def setMemoryMb(value: Double): Self = StObject.set(x, "memoryMb", value.asInstanceOf[js.Any])
    
    inline def setMemoryMbNull: Self = StObject.set(x, "memoryMb", null)
    
    inline def setMemoryMbUndefined: Self = StObject.set(x, "memoryMb", js.undefined)
    
    inline def setNodeCount(value: Double): Self = StObject.set(x, "nodeCount", value.asInstanceOf[js.Any])
    
    inline def setNodeCountNull: Self = StObject.set(x, "nodeCount", null)
    
    inline def setNodeCountUndefined: Self = StObject.set(x, "nodeCount", js.undefined)
    
    inline def setNodeProviderId(value: String): Self = StObject.set(x, "nodeProviderId", value.asInstanceOf[js.Any])
    
    inline def setNodeProviderIdNull: Self = StObject.set(x, "nodeProviderId", null)
    
    inline def setNodeProviderIdUndefined: Self = StObject.set(x, "nodeProviderId", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVcpuCount(value: Double): Self = StObject.set(x, "vcpuCount", value.asInstanceOf[js.Any])
    
    inline def setVcpuCountNull: Self = StObject.set(x, "vcpuCount", null)
    
    inline def setVcpuCountUndefined: Self = StObject.set(x, "vcpuCount", js.undefined)
  }
}
