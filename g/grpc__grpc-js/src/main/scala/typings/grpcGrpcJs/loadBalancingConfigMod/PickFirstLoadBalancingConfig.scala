package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.pick_first
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickFirstLoadBalancingConfig
  extends StObject
     with LoadBalancingConfig {
  
  var name: pick_first
  
  var pick_first: PickFirstConfig
}
object PickFirstLoadBalancingConfig {
  
  inline def apply(pick_first: PickFirstConfig): PickFirstLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = "pick_first", pick_first = pick_first.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickFirstLoadBalancingConfig]
  }
  
  extension [Self <: PickFirstLoadBalancingConfig](x: Self) {
    
    inline def setName(value: pick_first): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPick_first(value: PickFirstConfig): Self = StObject.set(x, "pick_first", value.asInstanceOf[js.Any])
  }
}
