package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.grpclb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcLbLoadBalancingConfig
  extends StObject
     with LoadBalancingConfig {
  
  var grpclb: GrpcLbConfig
  
  var name: grpclb
}
object GrpcLbLoadBalancingConfig {
  
  @scala.inline
  def apply(grpclb: GrpcLbConfig): GrpcLbLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(grpclb = grpclb.asInstanceOf[js.Any], name = "grpclb")
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
