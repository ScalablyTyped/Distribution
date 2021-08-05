package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.eds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdsLoadBalancingConfig
  extends StObject
     with LoadBalancingConfig {
  
  var eds: EdsLbConfig
  
  var name: eds
}
object EdsLoadBalancingConfig {
  
  inline def apply(eds: EdsLbConfig): EdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(eds = eds.asInstanceOf[js.Any], name = "eds")
    __obj.asInstanceOf[EdsLoadBalancingConfig]
  }
  
  extension [Self <: EdsLoadBalancingConfig](x: Self) {
    
    inline def setEds(value: EdsLbConfig): Self = StObject.set(x, "eds", value.asInstanceOf[js.Any])
    
    inline def setName(value: eds): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
