package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddonsConfig extends StObject {
  
  /**
    * Configuration for the Cloud Run addon. The `IstioConfig` addon must be enabled in order to enable Cloud Run addon. This option can only be enabled at cluster creation time.
    */
  var cloudRunConfig: js.UndefOr[SchemaCloudRunConfig] = js.undefined
  
  /**
    * Configuration for the ConfigConnector add-on, a Kubernetes extension to manage hosted GCP services through the Kubernetes API
    */
  var configConnectorConfig: js.UndefOr[SchemaConfigConnectorConfig] = js.undefined
  
  /**
    * Configuration for NodeLocalDNS, a dns cache running on cluster nodes
    */
  var dnsCacheConfig: js.UndefOr[SchemaDnsCacheConfig] = js.undefined
  
  /**
    * Configuration for the Compute Engine Persistent Disk CSI driver.
    */
  var gcePersistentDiskCsiDriverConfig: js.UndefOr[SchemaGcePersistentDiskCsiDriverConfig] = js.undefined
  
  /**
    * Configuration for the GCP Filestore CSI driver.
    */
  var gcpFilestoreCsiDriverConfig: js.UndefOr[SchemaGcpFilestoreCsiDriverConfig] = js.undefined
  
  /**
    * Configuration for the Backup for GKE agent addon.
    */
  var gkeBackupAgentConfig: js.UndefOr[SchemaGkeBackupAgentConfig] = js.undefined
  
  /**
    * Configuration for the horizontal pod autoscaling feature, which increases or decreases the number of replica pods a replication controller has based on the resource usage of the existing pods.
    */
  var horizontalPodAutoscaling: js.UndefOr[SchemaHorizontalPodAutoscaling] = js.undefined
  
  /**
    * Configuration for the HTTP (L7) load balancing controller addon, which makes it easy to set up HTTP load balancers for services in a cluster.
    */
  var httpLoadBalancing: js.UndefOr[SchemaHttpLoadBalancing] = js.undefined
  
  /**
    * Configuration for Istio, an open platform to connect, manage, and secure microservices.
    */
  var istioConfig: js.UndefOr[SchemaIstioConfig] = js.undefined
  
  /**
    * Configuration for the KALM addon, which manages the lifecycle of k8s applications.
    */
  var kalmConfig: js.UndefOr[SchemaKalmConfig] = js.undefined
  
  /**
    * Configuration for the Kubernetes Dashboard. This addon is deprecated, and will be disabled in 1.15. It is recommended to use the Cloud Console to manage and monitor your Kubernetes clusters, workloads and applications. For more information, see: https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
    */
  var kubernetesDashboard: js.UndefOr[SchemaKubernetesDashboard] = js.undefined
  
  /**
    * Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the Master, it does not track whether network policy is enabled for the nodes.
    */
  var networkPolicyConfig: js.UndefOr[SchemaNetworkPolicyConfig] = js.undefined
}
object SchemaAddonsConfig {
  
  inline def apply(): SchemaAddonsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddonsConfig]
  }
  
  extension [Self <: SchemaAddonsConfig](x: Self) {
    
    inline def setCloudRunConfig(value: SchemaCloudRunConfig): Self = StObject.set(x, "cloudRunConfig", value.asInstanceOf[js.Any])
    
    inline def setCloudRunConfigUndefined: Self = StObject.set(x, "cloudRunConfig", js.undefined)
    
    inline def setConfigConnectorConfig(value: SchemaConfigConnectorConfig): Self = StObject.set(x, "configConnectorConfig", value.asInstanceOf[js.Any])
    
    inline def setConfigConnectorConfigUndefined: Self = StObject.set(x, "configConnectorConfig", js.undefined)
    
    inline def setDnsCacheConfig(value: SchemaDnsCacheConfig): Self = StObject.set(x, "dnsCacheConfig", value.asInstanceOf[js.Any])
    
    inline def setDnsCacheConfigUndefined: Self = StObject.set(x, "dnsCacheConfig", js.undefined)
    
    inline def setGcePersistentDiskCsiDriverConfig(value: SchemaGcePersistentDiskCsiDriverConfig): Self = StObject.set(x, "gcePersistentDiskCsiDriverConfig", value.asInstanceOf[js.Any])
    
    inline def setGcePersistentDiskCsiDriverConfigUndefined: Self = StObject.set(x, "gcePersistentDiskCsiDriverConfig", js.undefined)
    
    inline def setGcpFilestoreCsiDriverConfig(value: SchemaGcpFilestoreCsiDriverConfig): Self = StObject.set(x, "gcpFilestoreCsiDriverConfig", value.asInstanceOf[js.Any])
    
    inline def setGcpFilestoreCsiDriverConfigUndefined: Self = StObject.set(x, "gcpFilestoreCsiDriverConfig", js.undefined)
    
    inline def setGkeBackupAgentConfig(value: SchemaGkeBackupAgentConfig): Self = StObject.set(x, "gkeBackupAgentConfig", value.asInstanceOf[js.Any])
    
    inline def setGkeBackupAgentConfigUndefined: Self = StObject.set(x, "gkeBackupAgentConfig", js.undefined)
    
    inline def setHorizontalPodAutoscaling(value: SchemaHorizontalPodAutoscaling): Self = StObject.set(x, "horizontalPodAutoscaling", value.asInstanceOf[js.Any])
    
    inline def setHorizontalPodAutoscalingUndefined: Self = StObject.set(x, "horizontalPodAutoscaling", js.undefined)
    
    inline def setHttpLoadBalancing(value: SchemaHttpLoadBalancing): Self = StObject.set(x, "httpLoadBalancing", value.asInstanceOf[js.Any])
    
    inline def setHttpLoadBalancingUndefined: Self = StObject.set(x, "httpLoadBalancing", js.undefined)
    
    inline def setIstioConfig(value: SchemaIstioConfig): Self = StObject.set(x, "istioConfig", value.asInstanceOf[js.Any])
    
    inline def setIstioConfigUndefined: Self = StObject.set(x, "istioConfig", js.undefined)
    
    inline def setKalmConfig(value: SchemaKalmConfig): Self = StObject.set(x, "kalmConfig", value.asInstanceOf[js.Any])
    
    inline def setKalmConfigUndefined: Self = StObject.set(x, "kalmConfig", js.undefined)
    
    inline def setKubernetesDashboard(value: SchemaKubernetesDashboard): Self = StObject.set(x, "kubernetesDashboard", value.asInstanceOf[js.Any])
    
    inline def setKubernetesDashboardUndefined: Self = StObject.set(x, "kubernetesDashboard", js.undefined)
    
    inline def setNetworkPolicyConfig(value: SchemaNetworkPolicyConfig): Self = StObject.set(x, "networkPolicyConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkPolicyConfigUndefined: Self = StObject.set(x, "networkPolicyConfig", js.undefined)
  }
}
