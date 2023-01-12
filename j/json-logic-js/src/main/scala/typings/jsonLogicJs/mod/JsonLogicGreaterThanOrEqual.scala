package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, '>='> */
trait JsonLogicGreaterThanOrEqual[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  @JSName(">=")
  var GreaterthansignEqualssign: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]
}
object JsonLogicGreaterThanOrEqual {
  
  inline def apply[AddOps /* <: AdditionalOperation */](GreaterthansignEqualssign: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): JsonLogicGreaterThanOrEqual[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(">=")(GreaterthansignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicGreaterThanOrEqual[AddOps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicGreaterThanOrEqual[?], AddOps /* <: AdditionalOperation */] (val x: Self & JsonLogicGreaterThanOrEqual[AddOps]) extends AnyVal {
    
    inline def setGreaterthansignEqualssign(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, ">=", value.asInstanceOf[js.Any])
  }
}
