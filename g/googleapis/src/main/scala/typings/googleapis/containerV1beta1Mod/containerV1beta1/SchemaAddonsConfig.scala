package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the addons that can be automatically spun up in the
  * cluster, enabling additional functionality.
  */
@js.native
trait SchemaAddonsConfig extends js.Object {
  
  /**
    * Configuration for the Cloud Run addon. The `IstioConfig` addon must be
    * enabled in order to enable Cloud Run addon. This option can only be
    * enabled at cluster creation time.
    */
  var cloudRunConfig: js.UndefOr[SchemaCloudRunConfig] = js.native
  
  /**
    * Configuration for the horizontal pod autoscaling feature, which increases
    * or decreases the number of replica pods a replication controller has
    * based on the resource usage of the existing pods.
    */
  var horizontalPodAutoscaling: js.UndefOr[SchemaHorizontalPodAutoscaling] = js.native
  
  /**
    * Configuration for the HTTP (L7) load balancing controller addon, which
    * makes it easy to set up HTTP load balancers for services in a cluster.
    */
  var httpLoadBalancing: js.UndefOr[SchemaHttpLoadBalancing] = js.native
  
  /**
    * Configuration for Istio, an open platform to connect, manage, and secure
    * microservices.
    */
  var istioConfig: js.UndefOr[SchemaIstioConfig] = js.native
  
  /**
    * Configuration for the Kubernetes Dashboard.
    */
  var kubernetesDashboard: js.UndefOr[SchemaKubernetesDashboard] = js.native
  
  /**
    * Configuration for NetworkPolicy. This only tracks whether the addon is
    * enabled or not on the Master, it does not track whether network policy is
    * enabled for the nodes.
    */
  var networkPolicyConfig: js.UndefOr[SchemaNetworkPolicyConfig] = js.native
}
object SchemaAddonsConfig {
  
  @scala.inline
  def apply(): SchemaAddonsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddonsConfig]
  }
  
  @scala.inline
  implicit class SchemaAddonsConfigOps[Self <: SchemaAddonsConfig] (val x: Self) extends AnyVal {
    
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
    def setCloudRunConfig(value: SchemaCloudRunConfig): Self = this.set("cloudRunConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudRunConfig: Self = this.set("cloudRunConfig", js.undefined)
    
    @scala.inline
    def setHorizontalPodAutoscaling(value: SchemaHorizontalPodAutoscaling): Self = this.set("horizontalPodAutoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalPodAutoscaling: Self = this.set("horizontalPodAutoscaling", js.undefined)
    
    @scala.inline
    def setHttpLoadBalancing(value: SchemaHttpLoadBalancing): Self = this.set("httpLoadBalancing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpLoadBalancing: Self = this.set("httpLoadBalancing", js.undefined)
    
    @scala.inline
    def setIstioConfig(value: SchemaIstioConfig): Self = this.set("istioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIstioConfig: Self = this.set("istioConfig", js.undefined)
    
    @scala.inline
    def setKubernetesDashboard(value: SchemaKubernetesDashboard): Self = this.set("kubernetesDashboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKubernetesDashboard: Self = this.set("kubernetesDashboard", js.undefined)
    
    @scala.inline
    def setNetworkPolicyConfig(value: SchemaNetworkPolicyConfig): Self = this.set("networkPolicyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkPolicyConfig: Self = this.set("networkPolicyConfig", js.undefined)
  }
}
