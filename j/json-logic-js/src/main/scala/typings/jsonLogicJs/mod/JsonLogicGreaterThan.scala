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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicGreaterThan[?], AddOps /* <: AdditionalOperation */] (val x: Self & JsonLogicGreaterThan[AddOps]) extends AnyVal {
    
    inline def setGreaterthansign(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, ">", value.asInstanceOf[js.Any])
  }
}
