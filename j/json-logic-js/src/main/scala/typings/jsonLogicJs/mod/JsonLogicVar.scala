package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'var'> */
trait JsonLogicVar[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var `var`: RulesLogic[AddOps] | js.Array[RulesLogic[AddOps]] | (js.Tuple2[RulesLogic[AddOps], Any])
}
object JsonLogicVar {
  
  inline def apply[AddOps /* <: AdditionalOperation */](`var`: RulesLogic[AddOps] | js.Array[RulesLogic[AddOps]] | (js.Tuple2[RulesLogic[AddOps], Any])): JsonLogicVar[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicVar[AddOps]]
  }
  
  extension [Self <: JsonLogicVar[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicVar[AddOps]) {
    
    inline def setVar(value: RulesLogic[AddOps] | js.Array[RulesLogic[AddOps]] | (js.Tuple2[RulesLogic[AddOps], Any])): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
    
    inline def setVarVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "var", js.Array(value*))
  }
}
