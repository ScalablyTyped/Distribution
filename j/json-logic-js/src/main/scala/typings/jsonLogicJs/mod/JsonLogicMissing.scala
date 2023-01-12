package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'missing'> */
trait JsonLogicMissing[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var missing: RulesLogic[AddOps] | js.Array[Any]
}
object JsonLogicMissing {
  
  inline def apply[AddOps /* <: AdditionalOperation */](missing: RulesLogic[AddOps] | js.Array[Any]): JsonLogicMissing[AddOps] = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicMissing[AddOps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicMissing[?], AddOps /* <: AdditionalOperation */] (val x: Self & JsonLogicMissing[AddOps]) extends AnyVal {
    
    inline def setMissing(value: RulesLogic[AddOps] | js.Array[Any]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingVarargs(value: Any*): Self = StObject.set(x, "missing", js.Array(value*))
  }
}
