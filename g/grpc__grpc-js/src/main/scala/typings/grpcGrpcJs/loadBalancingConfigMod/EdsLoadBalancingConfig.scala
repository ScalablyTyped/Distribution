package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.eds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdsLoadBalancingConfig extends LoadBalancingConfig {
  
  var eds: EdsLbConfig = js.native
  
  var name: eds = js.native
}
object EdsLoadBalancingConfig {
  
  @scala.inline
  def apply(eds: EdsLbConfig, name: eds): EdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(eds = eds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdsLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class EdsLoadBalancingConfigMutableBuilder[Self <: EdsLoadBalancingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEds(value: EdsLbConfig): Self = StObject.set(x, "eds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: eds): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
