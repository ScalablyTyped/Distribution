package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined json-logic-js.json-logic-js.RenameToIn<std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'inArray'>> */
trait JsonLogicInArray[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var inArray: js.Tuple2[RulesLogic[AddOps], js.Array[RulesLogic[AddOps]]]
}
object JsonLogicInArray {
  
  inline def apply[AddOps /* <: AdditionalOperation */](inArray: js.Tuple2[RulesLogic[AddOps], js.Array[RulesLogic[AddOps]]]): JsonLogicInArray[AddOps] = {
    val __obj = js.Dynamic.literal(inArray = inArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicInArray[AddOps]]
  }
  
  extension [Self <: JsonLogicInArray[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicInArray[AddOps]) {
    
    inline def setInArray(value: js.Tuple2[RulesLogic[AddOps], js.Array[RulesLogic[AddOps]]]): Self = StObject.set(x, "inArray", value.asInstanceOf[js.Any])
  }
}
