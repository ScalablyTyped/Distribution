package typings.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViterbiNode extends StObject {
  
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
  implicit class ViterbiNodeMutableBuilder[Self <: ViterbiNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft_id(value: Double): Self = StObject.set(x, "left_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: ViterbiNode): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight_id(value: Double): Self = StObject.set(x, "right_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortest_cost(value: Double): Self = StObject.set(x, "shortest_cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_pos(value: Double): Self = StObject.set(x, "start_pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurface_form(value: String): Self = StObject.set(x, "surface_form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
