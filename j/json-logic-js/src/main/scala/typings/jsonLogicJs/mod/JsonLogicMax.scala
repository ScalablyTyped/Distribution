package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'max'> */
trait JsonLogicMax[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var max: js.Array[RulesLogic[AddOps]]
}
object JsonLogicMax {
  
  inline def apply[AddOps /* <: AdditionalOperation */](max: js.Array[RulesLogic[AddOps]]): JsonLogicMax[AddOps] = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicMax[AddOps]]
  }
  
  extension [Self <: JsonLogicMax[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicMax[AddOps]) {
    
    inline def setMax(value: js.Array[RulesLogic[AddOps]]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "max", js.Array(value*))
  }
}
