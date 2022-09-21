package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, '-'> */
trait JsonLogicDifference[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  @JSName("-")
  var _dash: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]
}
object JsonLogicDifference {
  
  inline def apply[AddOps /* <: AdditionalOperation */](_dash: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): JsonLogicDifference[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-")(_dash.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicDifference[AddOps]]
  }
  
  extension [Self <: JsonLogicDifference[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicDifference[AddOps]) {
    
    inline def set_dash(value: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): Self = StObject.set(x, "-", value.asInstanceOf[js.Any])
    
    inline def set_dashVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "-", js.Array(value*))
  }
}
