package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, 'map'> */
trait JsonLogicMap[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  var map: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]
}
object JsonLogicMap {
  
  inline def apply[AddOps /* <: AdditionalOperation */](map: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): JsonLogicMap[AddOps] = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicMap[AddOps]]
  }
  
  extension [Self <: JsonLogicMap[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicMap[AddOps]) {
    
    inline def setMap(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
