package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'merge'> */
trait JsonLogicMerge[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var merge: js.Array[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]]
}
object JsonLogicMerge {
  
  inline def apply[AddOps /* <: AdditionalOperation */](merge: js.Array[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]]): JsonLogicMerge[AddOps] = {
    val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicMerge[AddOps]]
  }
  
  extension [Self <: JsonLogicMerge[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicMerge[AddOps]) {
    
    inline def setMerge(value: js.Array[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]]): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeVarargs(value: (js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps])*): Self = StObject.set(x, "merge", js.Array(value*))
  }
}
