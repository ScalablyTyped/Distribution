package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.grpclb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrpcLbLoadBalancingConfig extends LoadBalancingConfig {
  
  var grpclb: GrpcLbConfig = js.native
  
  var name: grpclb = js.native
}
object GrpcLbLoadBalancingConfig {
  
  @scala.inline
  def apply(grpclb: GrpcLbConfig, name: grpclb): GrpcLbLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(grpclb = grpclb.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcLbLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class GrpcLbLoadBalancingConfigMutableBuilder[Self <: GrpcLbLoadBalancingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrpclb(value: GrpcLbConfig): Self = StObject.set(x, "grpclb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: grpclb): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
