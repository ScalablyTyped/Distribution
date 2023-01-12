package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'none'> */
trait JsonLogicNone[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var none: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]
}
object JsonLogicNone {
  
  inline def apply[AddOps /* <: AdditionalOperation */](none: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]): JsonLogicNone[AddOps] = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicNone[AddOps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicNone[?], AddOps /* <: AdditionalOperation */] (val x: Self & JsonLogicNone[AddOps]) extends AnyVal {
    
    inline def setNone(value: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
