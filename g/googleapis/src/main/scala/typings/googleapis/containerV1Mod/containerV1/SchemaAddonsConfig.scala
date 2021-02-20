package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the addons that can be automatically spun up in the
  * cluster, enabling additional functionality.
  */
@js.native
trait SchemaAddonsConfig extends StObject {
  
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
  implicit class SchemaAddonsConfigMutableBuilder[Self <: SchemaAddonsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontalPodAutoscaling(value: SchemaHorizontalPodAutoscaling): Self = StObject.set(x, "horizontalPodAutoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalPodAutoscalingUndefined: Self = StObject.set(x, "horizontalPodAutoscaling", js.undefined)
    
    @scala.inline
    def setHttpLoadBalancing(value: SchemaHttpLoadBalancing): Self = StObject.set(x, "httpLoadBalancing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpLoadBalancingUndefined: Self = StObject.set(x, "httpLoadBalancing", js.undefined)
    
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
