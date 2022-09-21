package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined json-logic-js.json-logic-js.RenameToIn<std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'inString'>> */
trait JsonLogicInString[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var inString: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]
}
object JsonLogicInString {
  
  inline def apply[AddOps /* <: AdditionalOperation */](inString: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): JsonLogicInString[AddOps] = {
    val __obj = js.Dynamic.literal(inString = inString.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicInString[AddOps]]
  }
  
  extension [Self <: JsonLogicInString[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicInString[AddOps]) {
    
    inline def setInString(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "inString", value.asInstanceOf[js.Any])
  }
}
