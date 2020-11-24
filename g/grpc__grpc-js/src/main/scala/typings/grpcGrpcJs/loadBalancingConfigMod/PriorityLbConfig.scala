package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriorityLbConfig extends js.Object {
  
  var children: Map[String, PriorityChild] = js.native
  
  var priorities: js.Array[String] = js.native
}
object PriorityLbConfig {
  
  @scala.inline
  def apply(children: Map[String, PriorityChild], priorities: js.Array[String]): PriorityLbConfig = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], priorities = priorities.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLbConfig]
  }
  
  @scala.inline
  implicit class PriorityLbConfigOps[Self <: PriorityLbConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildren(value: Map[String, PriorityChild]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrioritiesVarargs(value: String*): Self = this.set("priorities", js.Array(value :_*))
    
    @scala.inline
    def setPriorities(value: js.Array[String]): Self = this.set("priorities", value.asInstanceOf[js.Any])
  }
}
