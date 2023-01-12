package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'substr'> */
trait JsonLogicSubstr[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var substr: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
}
object JsonLogicSubstr {
  
  inline def apply[AddOps /* <: AdditionalOperation */](
    substr: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
  ): JsonLogicSubstr[AddOps] = {
    val __obj = js.Dynamic.literal(substr = substr.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicSubstr[AddOps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicSubstr[?], AddOps /* <: AdditionalOperation */] (val x: Self & JsonLogicSubstr[AddOps]) extends AnyVal {
    
    inline def setSubstr(
      value: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
    ): Self = StObject.set(x, "substr", value.asInstanceOf[js.Any])
  }
}
