package typings.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViterbiNode extends js.Object {
  
  var cost: Double = js.native
  
  var left_id: Double = js.native
  
  var length: Double = js.native
  
  var name: String = js.native
  
  var prev: ViterbiNode = js.native
  
  var right_id: Double = js.native
  
  var shortest_cost: Double = js.native
  
  var start_pos: Double = js.native
  
  var surface_form: String = js.native
  
  var `type`: String = js.native
}
object ViterbiNode {
  
  @scala.inline
  def apply(
    cost: Double,
    left_id: Double,
    length: Double,
    name: String,
    prev: ViterbiNode,
    right_id: Double,
    shortest_cost: Double,
    start_pos: Double,
    surface_form: String,
    `type`: String
  ): ViterbiNode = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], left_id = left_id.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], right_id = right_id.asInstanceOf[js.Any], shortest_cost = shortest_cost.asInstanceOf[js.Any], start_pos = start_pos.asInstanceOf[js.Any], surface_form = surface_form.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViterbiNode]
  }
  
  @scala.inline
  implicit class ViterbiNodeOps[Self <: ViterbiNode] (val x: Self) extends AnyVal {
    
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
    def setCost(value: Double): Self = this.set("cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft_id(value: Double): Self = this.set("left_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: ViterbiNode): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight_id(value: Double): Self = this.set("right_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortest_cost(value: Double): Self = this.set("shortest_cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_pos(value: Double): Self = this.set("start_pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurface_form(value: String): Self = this.set("surface_form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
