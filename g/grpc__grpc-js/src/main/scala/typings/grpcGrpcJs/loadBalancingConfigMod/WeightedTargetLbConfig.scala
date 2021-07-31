package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightedTargetLbConfig extends StObject {
  
  var targets: Map[String, WeightedTarget]
}
object WeightedTargetLbConfig {
  
  @scala.inline
  def apply(targets: Map[String, WeightedTarget]): WeightedTargetLbConfig = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedTargetLbConfig]
  }
  
  @scala.inline
  implicit class WeightedTargetLbConfigMutableBuilder[Self <: WeightedTargetLbConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargets(value: Map[String, WeightedTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
  }
}
