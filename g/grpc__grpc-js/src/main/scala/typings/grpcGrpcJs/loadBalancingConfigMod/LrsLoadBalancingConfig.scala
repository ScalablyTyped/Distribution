package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.lrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LrsLoadBalancingConfig extends LoadBalancingConfig {
  
  var lrs: LrsLbConfig = js.native
  
  var name: lrs = js.native
}
object LrsLoadBalancingConfig {
  
  @scala.inline
  def apply(lrs: LrsLbConfig, name: lrs): LrsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(lrs = lrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
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
