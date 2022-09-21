package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'some'> */
trait JsonLogicSome[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var some: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]
}
object JsonLogicSome {
  
  inline def apply[AddOps /* <: AdditionalOperation */](some: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]): JsonLogicSome[AddOps] = {
    val __obj = js.Dynamic.literal(some = some.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicSome[AddOps]]
  }
  
  extension [Self <: JsonLogicSome[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicSome[AddOps]) {
    
    inline def setSome(value: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
  }
}
