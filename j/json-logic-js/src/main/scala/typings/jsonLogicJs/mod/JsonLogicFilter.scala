package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'filter'> */
trait JsonLogicFilter[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var filter: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]
}
object JsonLogicFilter {
  
  inline def apply[AddOps /* <: AdditionalOperation */](filter: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): JsonLogicFilter[AddOps] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicFilter[AddOps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicFilter[?], AddOps /* <: AdditionalOperation */] (val x: Self & JsonLogicFilter[AddOps]) extends AnyVal {
    
    inline def setFilter(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
