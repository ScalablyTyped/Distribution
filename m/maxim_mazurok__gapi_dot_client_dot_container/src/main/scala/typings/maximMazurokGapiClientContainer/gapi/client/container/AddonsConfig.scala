package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddonsConfig extends StObject {
  
  /** Configuration for the Cloud Run addon, which allows the user to use a managed Knative service. */
  var cloudRunConfig: js.UndefOr[CloudRunConfig] = js.undefined
  
  /** Configuration for the ConfigConnector add-on, a Kubernetes extension to manage hosted GCP services through the Kubernetes API */
  var configConnectorConfig: js.UndefOr[ConfigConnectorConfig] = js.undefined
  
  /** Configuration for NodeLocalDNS, a dns cache running on cluster nodes */
  var dnsCacheConfig: js.UndefOr[DnsCacheConfig] = js.undefined
  
  /** Configuration for the Compute Engine Persistent Disk CSI driver. */
  var gcePersistentDiskCsiDriverConfig: js.UndefOr[GcePersistentDiskCsiDriverConfig] = js.undefined
  
  /** Configuration for the GCP Filestore CSI driver. */
  var gcpFilestoreCsiDriverConfig: js.UndefOr[GcpFilestoreCsiDriverConfig] = js.undefined
  
  /**
    * Configuration for the horizontal pod autoscaling feature, which increases or decreases the number of replica pods a replication controller has based on the resource usage of the
    * existing pods.
    */
  var horizontalPodAutoscaling: js.UndefOr[HorizontalPodAutoscaling] = js.undefined
  
  /** Configuration for the HTTP (L7) load balancing controller addon, which makes it easy to set up HTTP load balancers for services in a cluster. */
  var httpLoadBalancing: js.UndefOr[HttpLoadBalancing] = js.undefined
  
  /**
    * Configuration for the Kubernetes Dashboard. This addon is deprecated, and will be disabled in 1.15. It is recommended to use the Cloud Console to manage and monitor your Kubernetes
    * clusters, workloads and applications. For more information, see: https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
    */
  var kubernetesDashboard: js.UndefOr[KubernetesDashboard] = js.undefined
  
  /** Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the Master, it does not track whether network policy is enabled for the nodes. */
  var networkPolicyConfig: js.UndefOr[NetworkPolicyConfig] = js.undefined
}
object AddonsConfig {
  
  inline def apply(): AddonsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddonsConfig]
  }
  
  extension [Self <: AddonsConfig](x: Self) {
    
    inline def setCloudRunConfig(value: CloudRunConfig): Self = StObject.set(x, "cloudRunConfig", value.asInstanceOf[js.Any])
    
    inline def setCloudRunConfigUndefined: Self = StObject.set(x, "cloudRunConfig", js.undefined)
    
    inline def setConfigConnectorConfig(value: ConfigConnectorConfig): Self = StObject.set(x, "configConnectorConfig", value.asInstanceOf[js.Any])
    
    inline def setConfigConnectorConfigUndefined: Self = StObject.set(x, "configConnectorConfig", js.undefined)
    
    inline def setDnsCacheConfig(value: DnsCacheConfig): Self = StObject.set(x, "dnsCacheConfig", value.asInstanceOf[js.Any])
    
    inline def setDnsCacheConfigUndefined: Self = StObject.set(x, "dnsCacheConfig", js.undefined)
    
    inline def setGcePersistentDiskCsiDriverConfig(value: GcePersistentDiskCsiDriverConfig): Self = StObject.set(x, "gcePersistentDiskCsiDriverConfig", value.asInstanceOf[js.Any])
    
    inline def setGcePersistentDiskCsiDriverConfigUndefined: Self = StObject.set(x, "gcePersistentDiskCsiDriverConfig", js.undefined)
    
    inline def setGcpFilestoreCsiDriverConfig(value: GcpFilestoreCsiDriverConfig): Self = StObject.set(x, "gcpFilestoreCsiDriverConfig", value.asInstanceOf[js.Any])
    
    inline def setGcpFilestoreCsiDriverConfigUndefined: Self = StObject.set(x, "gcpFilestoreCsiDriverConfig", js.undefined)
    
    inline def setHorizontalPodAutoscaling(value: HorizontalPodAutoscaling): Self = StObject.set(x, "horizontalPodAutoscaling", value.asInstanceOf[js.Any])
    
    inline def setHorizontalPodAutoscalingUndefined: Self = StObject.set(x, "horizontalPodAutoscaling", js.undefined)
    
    inline def setHttpLoadBalancing(value: HttpLoadBalancing): Self = StObject.set(x, "httpLoadBalancing", value.asInstanceOf[js.Any])
    
    inline def setHttpLoadBalancingUndefined: Self = StObject.set(x, "httpLoadBalancing", js.undefined)
    
    inline def setKubernetesDashboard(value: KubernetesDashboard): Self = StObject.set(x, "kubernetesDashboard", value.asInstanceOf[js.Any])
    
    inline def setKubernetesDashboardUndefined: Self = StObject.set(x, "kubernetesDashboard", js.undefined)
    
    inline def setNetworkPolicyConfig(value: NetworkPolicyConfig): Self = StObject.set(x, "networkPolicyConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkPolicyConfigUndefined: Self = StObject.set(x, "networkPolicyConfig", js.undefined)
  }
}
