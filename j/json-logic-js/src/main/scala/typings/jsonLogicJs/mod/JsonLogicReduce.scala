package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'reduce'> */
trait JsonLogicReduce[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var reduce: js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]]
}
object JsonLogicReduce {
  
  inline def apply[AddOps /* <: AdditionalOperation */](reduce: js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]]): JsonLogicReduce[AddOps] = {
    val __obj = js.Dynamic.literal(reduce = reduce.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicReduce[AddOps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicReduce[?], AddOps /* <: AdditionalOperation */] (val x: Self & JsonLogicReduce[AddOps]) extends AnyVal {
    
    inline def setReduce(value: js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
  }
}
