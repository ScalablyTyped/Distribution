package typings.grpcGrpcJs.loadBalancingConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcLbConfig extends StObject {
  
  var childPolicy: js.Array[LoadBalancingConfig]
}
object GrpcLbConfig {
  
  inline def apply(childPolicy: js.Array[LoadBalancingConfig]): GrpcLbConfig = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcLbConfig]
  }
  
  extension [Self <: GrpcLbConfig](x: Self) {
    
    inline def setChildPolicy(value: js.Array[LoadBalancingConfig]): Self = StObject.set(x, "childPolicy", value.asInstanceOf[js.Any])
    
    inline def setChildPolicyVarargs(value: LoadBalancingConfig*): Self = StObject.set(x, "childPolicy", js.Array(value :_*))
  }
}
