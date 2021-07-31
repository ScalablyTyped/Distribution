package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriorityLbConfig extends StObject {
  
  var children: Map[String, PriorityChild]
  
  var priorities: js.Array[String]
}
object PriorityLbConfig {
  
  @scala.inline
  def apply(children: Map[String, PriorityChild], priorities: js.Array[String]): PriorityLbConfig = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], priorities = priorities.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLbConfig]
  }
  
  @scala.inline
  implicit class PriorityLbConfigMutableBuilder[Self <: PriorityLbConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Map[String, PriorityChild]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorities(value: js.Array[String]): Self = StObject.set(x, "priorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrioritiesVarargs(value: String*): Self = StObject.set(x, "priorities", js.Array(value :_*))
  }
}
