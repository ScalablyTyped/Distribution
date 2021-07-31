package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.round_robin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoundRobinLoadBalancingConfig
  extends StObject
     with LoadBalancingConfig {
  
  var name: round_robin
  
  var round_robin: RoundRobinConfig
}
object RoundRobinLoadBalancingConfig {
  
  @scala.inline
  def apply(round_robin: RoundRobinConfig): RoundRobinLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = "round_robin", round_robin = round_robin.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundRobinLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class RoundRobinLoadBalancingConfigMutableBuilder[Self <: RoundRobinLoadBalancingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: round_robin): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRound_robin(value: RoundRobinConfig): Self = StObject.set(x, "round_robin", value.asInstanceOf[js.Any])
  }
}
