package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<never>, '==='> */
trait JsonLogicStrictEqual
  extends StObject
     with _RulesLogic[Any] {
  
  @JSName("===")
  var EqualssignEqualssignEqualssign: js.Tuple2[Any, Any]
}
object JsonLogicStrictEqual {
  
  inline def apply(EqualssignEqualssignEqualssign: js.Tuple2[Any, Any]): JsonLogicStrictEqual = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("===")(EqualssignEqualssignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicStrictEqual]
  }
  
  extension [Self <: JsonLogicStrictEqual](x: Self) {
    
    inline def setEqualssignEqualssignEqualssign(value: js.Tuple2[Any, Any]): Self = StObject.set(x, "===", value.asInstanceOf[js.Any])
  }
}
