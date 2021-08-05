package typings.grpcGrpcJs.loadBalancingConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriorityChild extends StObject {
  
  var config: js.Array[LoadBalancingConfig]
}
object PriorityChild {
  
  inline def apply(config: js.Array[LoadBalancingConfig]): PriorityChild = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityChild]
  }
  
  extension [Self <: PriorityChild](x: Self) {
    
    inline def setConfig(value: js.Array[LoadBalancingConfig]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigVarargs(value: LoadBalancingConfig*): Self = StObject.set(x, "config", js.Array(value :_*))
  }
}
