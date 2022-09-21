package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<never>, '!=='> */
trait JsonLogicStrictNotEqual
  extends StObject
     with _RulesLogic[Any] {
  
  @JSName("!==")
  var ExclamationmarkEqualssignEqualssign: js.Tuple2[Any, Any]
}
object JsonLogicStrictNotEqual {
  
  inline def apply(ExclamationmarkEqualssignEqualssign: js.Tuple2[Any, Any]): JsonLogicStrictNotEqual = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!==")(ExclamationmarkEqualssignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicStrictNotEqual]
  }
  
  extension [Self <: JsonLogicStrictNotEqual](x: Self) {
    
    inline def setExclamationmarkEqualssignEqualssign(value: js.Tuple2[Any, Any]): Self = StObject.set(x, "!==", value.asInstanceOf[js.Any])
  }
}
