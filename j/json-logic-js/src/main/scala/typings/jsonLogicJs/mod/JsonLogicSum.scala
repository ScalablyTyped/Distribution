package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, '+'> */
trait JsonLogicSum[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  @JSName("+")
  var Plussign: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]
}
object JsonLogicSum {
  
  inline def apply[AddOps /* <: AdditionalOperation */](Plussign: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): JsonLogicSum[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("+")(Plussign.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicSum[AddOps]]
  }
  
  extension [Self <: JsonLogicSum[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicSum[AddOps]) {
    
    inline def setPlussign(value: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): Self = StObject.set(x, "+", value.asInstanceOf[js.Any])
    
    inline def setPlussignVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "+", js.Array(value*))
  }
}
