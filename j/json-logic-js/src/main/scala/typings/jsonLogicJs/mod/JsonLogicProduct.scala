package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, '*'> */
trait JsonLogicProduct[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  @JSName("*")
  var Asterisk: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]
}
object JsonLogicProduct {
  
  inline def apply[AddOps /* <: AdditionalOperation */](Asterisk: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): JsonLogicProduct[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("*")(Asterisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicProduct[AddOps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicProduct[?], AddOps /* <: AdditionalOperation */] (val x: Self & JsonLogicProduct[AddOps]) extends AnyVal {
    
    inline def setAsterisk(value: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): Self = StObject.set(x, "*", value.asInstanceOf[js.Any])
    
    inline def setAsteriskVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "*", js.Array(value*))
  }
}
