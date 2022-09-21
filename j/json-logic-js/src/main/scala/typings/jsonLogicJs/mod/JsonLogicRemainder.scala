package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, '%'> */
trait JsonLogicRemainder[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  @JSName("%")
  var Percentsign: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]
}
object JsonLogicRemainder {
  
  inline def apply[AddOps /* <: AdditionalOperation */](Percentsign: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): JsonLogicRemainder[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("%")(Percentsign.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicRemainder[AddOps]]
  }
  
  extension [Self <: JsonLogicRemainder[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicRemainder[AddOps]) {
    
    inline def setPercentsign(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "%", value.asInstanceOf[js.Any])
  }
}
