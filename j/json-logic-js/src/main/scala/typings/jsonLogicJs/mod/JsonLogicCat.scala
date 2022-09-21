package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'cat'> */
trait JsonLogicCat[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var cat: js.Array[RulesLogic[AddOps]]
}
object JsonLogicCat {
  
  inline def apply[AddOps /* <: AdditionalOperation */](cat: js.Array[RulesLogic[AddOps]]): JsonLogicCat[AddOps] = {
    val __obj = js.Dynamic.literal(cat = cat.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicCat[AddOps]]
  }
  
  extension [Self <: JsonLogicCat[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicCat[AddOps]) {
    
    inline def setCat(value: js.Array[RulesLogic[AddOps]]): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
    
    inline def setCatVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "cat", js.Array(value*))
  }
}
