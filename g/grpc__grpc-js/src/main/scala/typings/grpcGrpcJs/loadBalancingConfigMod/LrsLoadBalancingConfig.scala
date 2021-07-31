package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.lrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LrsLoadBalancingConfig
  extends StObject
     with LoadBalancingConfig {
  
  var lrs: LrsLbConfig
  
  var name: lrs
}
object LrsLoadBalancingConfig {
  
  @scala.inline
  def apply(lrs: LrsLbConfig): LrsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(lrs = lrs.asInstanceOf[js.Any], name = "lrs")
    __obj.asInstanceOf[LrsLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class LrsLoadBalancingConfigMutableBuilder[Self <: LrsLoadBalancingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLrs(value: LrsLbConfig): Self = StObject.set(x, "lrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: lrs): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
