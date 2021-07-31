package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.xds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XdsLoadBalancingConfig
  extends StObject
     with LoadBalancingConfig {
  
  var name: xds
  
  var xds: XdsConfig
}
object XdsLoadBalancingConfig {
  
  @scala.inline
  def apply(xds: XdsConfig): XdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = "xds", xds = xds.asInstanceOf[js.Any])
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
