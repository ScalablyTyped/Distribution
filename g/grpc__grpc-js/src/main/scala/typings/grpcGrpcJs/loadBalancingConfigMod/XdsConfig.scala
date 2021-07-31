package typings.grpcGrpcJs.loadBalancingConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XdsConfig extends StObject {
  
  var balancerName: String
  
  var childPolicy: js.Array[LoadBalancingConfig]
  
  var fallbackPolicy: js.Array[LoadBalancingConfig]
}
object XdsConfig {
  
  @scala.inline
  def apply(
    balancerName: String,
    childPolicy: js.Array[LoadBalancingConfig],
    fallbackPolicy: js.Array[LoadBalancingConfig]
  ): XdsConfig = {
    val __obj = js.Dynamic.literal(balancerName = balancerName.asInstanceOf[js.Any], childPolicy = childPolicy.asInstanceOf[js.Any], fallbackPolicy = fallbackPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[XdsConfig]
  }
  
  @scala.inline
  implicit class XdsConfigMutableBuilder[Self <: XdsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBalancerName(value: String): Self = StObject.set(x, "balancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildPolicy(value: js.Array[LoadBalancingConfig]): Self = StObject.set(x, "childPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildPolicyVarargs(value: LoadBalancingConfig*): Self = StObject.set(x, "childPolicy", js.Array(value :_*))
    
    @scala.inline
    def setFallbackPolicy(value: js.Array[LoadBalancingConfig]): Self = StObject.set(x, "fallbackPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackPolicyVarargs(value: LoadBalancingConfig*): Self = StObject.set(x, "fallbackPolicy", js.Array(value :_*))
  }
}
