package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'or'> */
trait JsonLogicOr[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var or: js.Array[RulesLogic[AddOps]]
}
object JsonLogicOr {
  
  inline def apply[AddOps /* <: AdditionalOperation */](or: js.Array[RulesLogic[AddOps]]): JsonLogicOr[AddOps] = {
    val __obj = js.Dynamic.literal(or = or.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicOr[AddOps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicOr[?], AddOps /* <: AdditionalOperation */] (val x: Self & JsonLogicOr[AddOps]) extends AnyVal {
    
    inline def setOr(value: js.Array[RulesLogic[AddOps]]): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    inline def setOrVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "or", js.Array(value*))
  }
}
