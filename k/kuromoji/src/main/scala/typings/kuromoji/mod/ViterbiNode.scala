package typings.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViterbiNode extends StObject {
  
  var cost: Double
  
  var left_id: Double
  
  var length: Double
  
  var name: String
  
  var prev: ViterbiNode
  
  var right_id: Double
  
  var shortest_cost: Double
  
  var start_pos: Double
  
  var surface_form: String
  
  var `type`: String
}
object ViterbiNode {
  
  inline def apply(
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
  
  extension [Self <: ViterbiNode](x: Self) {
    
    inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setLeft_id(value: Double): Self = StObject.set(x, "left_id", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: ViterbiNode): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setRight_id(value: Double): Self = StObject.set(x, "right_id", value.asInstanceOf[js.Any])
    
    inline def setShortest_cost(value: Double): Self = StObject.set(x, "shortest_cost", value.asInstanceOf[js.Any])
    
    inline def setStart_pos(value: Double): Self = StObject.set(x, "start_pos", value.asInstanceOf[js.Any])
    
    inline def setSurface_form(value: String): Self = StObject.set(x, "surface_form", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
