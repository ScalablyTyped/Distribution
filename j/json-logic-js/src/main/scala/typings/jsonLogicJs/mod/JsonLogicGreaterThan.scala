package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, '>'> */
trait JsonLogicGreaterThan[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  @JSName(">")
  var Greaterthansign: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]
}
object JsonLogicGreaterThan {
  
  inline def apply[AddOps /* <: AdditionalOperation */](Greaterthansign: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): JsonLogicGreaterThan[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(">")(Greaterthansign.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicGreaterThan[AddOps]]
  }
  
  extension [Self <: JsonLogicGreaterThan[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicGreaterThan[AddOps]) {
    
    inline def setGreaterthansign(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, ">", value.asInstanceOf[js.Any])
  }
}
