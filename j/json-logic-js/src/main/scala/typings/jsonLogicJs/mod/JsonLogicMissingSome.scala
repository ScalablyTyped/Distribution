package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'missing_some'> */
trait JsonLogicMissingSome[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var missing_some: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps] | js.Array[Any]]
}
object JsonLogicMissingSome {
  
  inline def apply[AddOps /* <: AdditionalOperation */](missing_some: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps] | js.Array[Any]]): JsonLogicMissingSome[AddOps] = {
    val __obj = js.Dynamic.literal(missing_some = missing_some.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicMissingSome[AddOps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicMissingSome[?], AddOps /* <: AdditionalOperation */] (val x: Self & JsonLogicMissingSome[AddOps]) extends AnyVal {
    
    inline def setMissing_some(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps] | js.Array[Any]]): Self = StObject.set(x, "missing_some", value.asInstanceOf[js.Any])
  }
}
