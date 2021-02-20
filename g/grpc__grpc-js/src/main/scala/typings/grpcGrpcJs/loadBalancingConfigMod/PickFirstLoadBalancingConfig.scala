package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.pick_first
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickFirstLoadBalancingConfig extends LoadBalancingConfig {
  
  var name: pick_first = js.native
  
  var pick_first: PickFirstConfig = js.native
}
object PickFirstLoadBalancingConfig {
  
  @scala.inline
  def apply(name: pick_first, pick_first: PickFirstConfig): PickFirstLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pick_first = pick_first.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickFirstLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class PickFirstLoadBalancingConfigMutableBuilder[Self <: PickFirstLoadBalancingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: pick_first): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPick_first(value: PickFirstConfig): Self = StObject.set(x, "pick_first", value.asInstanceOf[js.Any])
  }
}
