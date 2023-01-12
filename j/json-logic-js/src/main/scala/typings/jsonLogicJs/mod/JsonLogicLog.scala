package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'log'> */
trait JsonLogicLog[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var log: RulesLogic[AddOps]
}
object JsonLogicLog {
  
  inline def apply[AddOps /* <: AdditionalOperation */](log: RulesLogic[AddOps]): JsonLogicLog[AddOps] = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicLog[AddOps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicLog[?], AddOps /* <: AdditionalOperation */] (val x: Self & JsonLogicLog[AddOps]) extends AnyVal {
    
    inline def setLog(value: RulesLogic[AddOps]): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
  }
}
