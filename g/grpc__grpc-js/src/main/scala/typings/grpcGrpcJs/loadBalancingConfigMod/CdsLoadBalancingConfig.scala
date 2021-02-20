package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.cds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CdsLoadBalancingConfig extends LoadBalancingConfig {
  
  var cds: CdsLbConfig = js.native
  
  var name: cds = js.native
}
object CdsLoadBalancingConfig {
  
  @scala.inline
  def apply(cds: CdsLbConfig, name: cds): CdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(cds = cds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CdsLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class CdsLoadBalancingConfigMutableBuilder[Self <: CdsLoadBalancingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCds(value: CdsLbConfig): Self = StObject.set(x, "cds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: cds): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
