package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.xds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XdsLoadBalancingConfig extends LoadBalancingConfig {
  
  var name: xds = js.native
  
  var xds: XdsConfig = js.native
}
object XdsLoadBalancingConfig {
  
  @scala.inline
  def apply(name: xds, xds: XdsConfig): XdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], xds = xds.asInstanceOf[js.Any])
    __obj.asInstanceOf[XdsLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class XdsLoadBalancingConfigMutableBuilder[Self <: XdsLoadBalancingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: xds): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXds(value: XdsConfig): Self = StObject.set(x, "xds", value.asInstanceOf[js.Any])
  }
}
