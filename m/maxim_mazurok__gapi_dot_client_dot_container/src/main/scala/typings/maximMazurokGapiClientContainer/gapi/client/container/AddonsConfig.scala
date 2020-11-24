package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddonsConfig extends js.Object {
  
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
  implicit class AddonsConfigOps[Self <: AddonsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloudRunConfig(value: CloudRunConfig): Self = this.set("cloudRunConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudRunConfig: Self = this.set("cloudRunConfig", js.undefined)
    
    @scala.inline
    def setConfigConnectorConfig(value: ConfigConnectorConfig): Self = this.set("configConnectorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigConnectorConfig: Self = this.set("configConnectorConfig", js.undefined)
    
    @scala.inline
    def setDnsCacheConfig(value: DnsCacheConfig): Self = this.set("dnsCacheConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsCacheConfig: Self = this.set("dnsCacheConfig", js.undefined)
    
    @scala.inline
    def setHorizontalPodAutoscaling(value: HorizontalPodAutoscaling): Self = this.set("horizontalPodAutoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalPodAutoscaling: Self = this.set("horizontalPodAutoscaling", js.undefined)
    
    @scala.inline
    def setHttpLoadBalancing(value: HttpLoadBalancing): Self = this.set("httpLoadBalancing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpLoadBalancing: Self = this.set("httpLoadBalancing", js.undefined)
    
    @scala.inline
    def setKubernetesDashboard(value: KubernetesDashboard): Self = this.set("kubernetesDashboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKubernetesDashboard: Self = this.set("kubernetesDashboard", js.undefined)
    
    @scala.inline
    def setNetworkPolicyConfig(value: NetworkPolicyConfig): Self = this.set("networkPolicyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkPolicyConfig: Self = this.set("networkPolicyConfig", js.undefined)
  }
}
