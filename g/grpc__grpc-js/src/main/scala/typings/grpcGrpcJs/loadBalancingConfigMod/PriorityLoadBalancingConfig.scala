package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.priority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriorityLoadBalancingConfig
  extends StObject
     with LoadBalancingConfig {
  
  var name: priority
  
  var priority: PriorityLbConfig
}
object PriorityLoadBalancingConfig {
  
  @scala.inline
  def apply(priority: PriorityLbConfig): PriorityLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = "priority", priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class PriorityLoadBalancingConfigMutableBuilder[Self <: PriorityLoadBalancingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: priority): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: PriorityLbConfig): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
