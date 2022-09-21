package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'min'> */
trait JsonLogicMin[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var min: js.Array[RulesLogic[AddOps]]
}
object JsonLogicMin {
  
  inline def apply[AddOps /* <: AdditionalOperation */](min: js.Array[RulesLogic[AddOps]]): JsonLogicMin[AddOps] = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicMin[AddOps]]
  }
  
  extension [Self <: JsonLogicMin[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicMin[AddOps]) {
    
    inline def setMin(value: js.Array[RulesLogic[AddOps]]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "min", js.Array(value*))
  }
}
