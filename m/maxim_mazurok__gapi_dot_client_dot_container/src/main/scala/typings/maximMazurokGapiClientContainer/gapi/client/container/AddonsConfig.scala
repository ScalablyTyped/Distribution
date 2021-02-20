package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddonsConfig extends StObject {
  
  /** Configuration for the Cloud Run addon, which allows the user to use a managed Knative service. */
  var cloudRunConfig: js.UndefOr[CloudRunConfig] = js.native
  
  /** Configuration for the ConfigConnector add-on, a Kubernetes extension to manage hosted GCP services through the Kubernetes API */
  var configConnectorConfig: js.UndefOr[ConfigConnectorConfig] = js.native
  
  /** Configuration for NodeLocalDNS, a dns cache running on cluster nodes */
  var dnsCacheConfig: js.UndefOr[DnsCacheConfig] = js.native
  
  /**
    * Configuration for the horizontal pod autoscaling feature, which increases or decreases the number of replica pods a replication controller has based on the resource usage of the
    * existing pods.
    */
  var horizontalPodAutoscaling: js.UndefOr[HorizontalPodAutoscaling] = js.native
  
  /** Configuration for the HTTP (L7) load balancing controller addon, which makes it easy to set up HTTP load balancers for services in a cluster. */
  var httpLoadBalancing: js.UndefOr[HttpLoadBalancing] = js.native
  
  /**
    * Configuration for the Kubernetes Dashboard. This addon is deprecated, and will be disabled in 1.15. It is recommended to use the Cloud Console to manage and monitor your Kubernetes
    * clusters, workloads and applications. For more information, see: https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
    */
  var kubernetesDashboard: js.UndefOr[KubernetesDashboard] = js.native
  
  /** Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the Master, it does not track whether network policy is enabled for the nodes. */
  var networkPolicyConfig: js.UndefOr[NetworkPolicyConfig] = js.native
}
object AddonsConfig {
  
  @scala.inline
  def apply(): AddonsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddonsConfig]
  }
  
  @scala.inline
  implicit class AddonsConfigMutableBuilder[Self <: AddonsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudRunConfig(value: CloudRunConfig): Self = StObject.set(x, "cloudRunConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudRunConfigUndefined: Self = StObject.set(x, "cloudRunConfig", js.undefined)
    
    @scala.inline
    def setConfigConnectorConfig(value: ConfigConnectorConfig): Self = StObject.set(x, "configConnectorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigConnectorConfigUndefined: Self = StObject.set(x, "configConnectorConfig", js.undefined)
    
    @scala.inline
    def setDnsCacheConfig(value: DnsCacheConfig): Self = StObject.set(x, "dnsCacheConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsCacheConfigUndefined: Self = StObject.set(x, "dnsCacheConfig", js.undefined)
    
    @scala.inline
    def setHorizontalPodAutoscaling(value: HorizontalPodAutoscaling): Self = StObject.set(x, "horizontalPodAutoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalPodAutoscalingUndefined: Self = StObject.set(x, "horizontalPodAutoscaling", js.undefined)
    
    @scala.inline
    def setHttpLoadBalancing(value: HttpLoadBalancing): Self = StObject.set(x, "httpLoadBalancing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpLoadBalancingUndefined: Self = StObject.set(x, "httpLoadBalancing", js.undefined)
    
    @scala.inline
    def setKubernetesDashboard(value: KubernetesDashboard): Self = StObject.set(x, "kubernetesDashboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKubernetesDashboardUndefined: Self = StObject.set(x, "kubernetesDashboard", js.undefined)
    
    @scala.inline
    def setNetworkPolicyConfig(value: NetworkPolicyConfig): Self = StObject.set(x, "networkPolicyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkPolicyConfigUndefined: Self = StObject.set(x, "networkPolicyConfig", js.undefined)
  }
}
