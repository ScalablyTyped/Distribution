package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the addons that can be automatically spun up in the
  * cluster, enabling additional functionality.
  */
trait SchemaAddonsConfig extends StObject {
  
  /**
    * Configuration for the Cloud Run addon. The `IstioConfig` addon must be
    * enabled in order to enable Cloud Run addon. This option can only be
    * enabled at cluster creation time.
    */
  var cloudRunConfig: js.UndefOr[SchemaCloudRunConfig] = js.undefined
  
  /**
    * Configuration for the horizontal pod autoscaling feature, which increases
    * or decreases the number of replica pods a replication controller has
    * based on the resource usage of the existing pods.
    */
  var horizontalPodAutoscaling: js.UndefOr[SchemaHorizontalPodAutoscaling] = js.undefined
  
  /**
    * Configuration for the HTTP (L7) load balancing controller addon, which
    * makes it easy to set up HTTP load balancers for services in a cluster.
    */
  var httpLoadBalancing: js.UndefOr[SchemaHttpLoadBalancing] = js.undefined
  
  /**
    * Configuration for Istio, an open platform to connect, manage, and secure
    * microservices.
    */
  var istioConfig: js.UndefOr[SchemaIstioConfig] = js.undefined
  
  /**
    * Configuration for the Kubernetes Dashboard.
    */
  var kubernetesDashboard: js.UndefOr[SchemaKubernetesDashboard] = js.undefined
  
  /**
    * Configuration for NetworkPolicy. This only tracks whether the addon is
    * enabled or not on the Master, it does not track whether network policy is
    * enabled for the nodes.
    */
  var networkPolicyConfig: js.UndefOr[SchemaNetworkPolicyConfig] = js.undefined
}
object SchemaAddonsConfig {
  
  @scala.inline
  def apply(): SchemaAddonsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddonsConfig]
  }
  
  @scala.inline
  implicit class SchemaAddonsConfigMutableBuilder[Self <: SchemaAddonsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudRunConfig(value: SchemaCloudRunConfig): Self = StObject.set(x, "cloudRunConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudRunConfigUndefined: Self = StObject.set(x, "cloudRunConfig", js.undefined)
    
    @scala.inline
    def setHorizontalPodAutoscaling(value: SchemaHorizontalPodAutoscaling): Self = StObject.set(x, "horizontalPodAutoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalPodAutoscalingUndefined: Self = StObject.set(x, "horizontalPodAutoscaling", js.undefined)
    
    @scala.inline
    def setHttpLoadBalancing(value: SchemaHttpLoadBalancing): Self = StObject.set(x, "httpLoadBalancing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpLoadBalancingUndefined: Self = StObject.set(x, "httpLoadBalancing", js.undefined)
    
    @scala.inline
    def setIstioConfig(value: SchemaIstioConfig): Self = StObject.set(x, "istioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIstioConfigUndefined: Self = StObject.set(x, "istioConfig", js.undefined)
    
    @scala.inline
    def setKubernetesDashboard(value: SchemaKubernetesDashboard): Self = StObject.set(x, "kubernetesDashboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKubernetesDashboardUndefined: Self = StObject.set(x, "kubernetesDashboard", js.undefined)
    
    @scala.inline
    def setNetworkPolicyConfig(value: SchemaNetworkPolicyConfig): Self = StObject.set(x, "networkPolicyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkPolicyConfigUndefined: Self = StObject.set(x, "networkPolicyConfig", js.undefined)
  }
}
