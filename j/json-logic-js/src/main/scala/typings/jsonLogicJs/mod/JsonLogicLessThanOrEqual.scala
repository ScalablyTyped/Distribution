package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, '<='> */
trait JsonLogicLessThanOrEqual[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  @JSName("<=")
  var LessthansignEqualssign: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
}
object JsonLogicLessThanOrEqual {
  
  inline def apply[AddOps /* <: AdditionalOperation */](
    LessthansignEqualssign: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
  ): JsonLogicLessThanOrEqual[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("<=")(LessthansignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicLessThanOrEqual[AddOps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicLessThanOrEqual[?], AddOps /* <: AdditionalOperation */] (val x: Self & JsonLogicLessThanOrEqual[AddOps]) extends AnyVal {
    
    inline def setLessthansignEqualssign(
      value: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
    ): Self = StObject.set(x, "<=", value.asInstanceOf[js.Any])
  }
}
