package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'and'> */
trait JsonLogicAnd[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var and: js.Array[RulesLogic[AddOps]]
}
object JsonLogicAnd {
  
  inline def apply[AddOps /* <: AdditionalOperation */](and: js.Array[RulesLogic[AddOps]]): JsonLogicAnd[AddOps] = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicAnd[AddOps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicAnd[?], AddOps /* <: AdditionalOperation */] (val x: Self & JsonLogicAnd[AddOps]) extends AnyVal {
    
    inline def setAnd(value: js.Array[RulesLogic[AddOps]]): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAndVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "and", js.Array(value*))
  }
}
