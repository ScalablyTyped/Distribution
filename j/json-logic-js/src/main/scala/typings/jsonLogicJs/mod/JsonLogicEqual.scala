package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<never>, '=='> */
trait JsonLogicEqual
  extends StObject
     with _RulesLogic[Any] {
  
  @JSName("==")
  var EqualssignEqualssign: js.Tuple2[Any, Any]
}
object JsonLogicEqual {
  
  inline def apply(EqualssignEqualssign: js.Tuple2[Any, Any]): JsonLogicEqual = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("==")(EqualssignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicEqual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicEqual] (val x: Self) extends AnyVal {
    
    inline def setEqualssignEqualssign(value: js.Tuple2[Any, Any]): Self = StObject.set(x, "==", value.asInstanceOf[js.Any])
  }
}
