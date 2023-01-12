package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, '/'> */
trait JsonLogicQuotient[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  @JSName("/")
  var Slash: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]
}
object JsonLogicQuotient {
  
  inline def apply[AddOps /* <: AdditionalOperation */](Slash: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): JsonLogicQuotient[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("/")(Slash.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicQuotient[AddOps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicQuotient[?], AddOps /* <: AdditionalOperation */] (val x: Self & JsonLogicQuotient[AddOps]) extends AnyVal {
    
    inline def setSlash(value: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): Self = StObject.set(x, "/", value.asInstanceOf[js.Any])
    
    inline def setSlashVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "/", js.Array(value*))
  }
}
