package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'all'> */
trait JsonLogicAll[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var all: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]
}
object JsonLogicAll {
  
  inline def apply[AddOps /* <: AdditionalOperation */](all: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]): JsonLogicAll[AddOps] = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicAll[AddOps]]
  }
  
  extension [Self <: JsonLogicAll[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicAll[AddOps]) {
    
    inline def setAll(value: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
  }
}
