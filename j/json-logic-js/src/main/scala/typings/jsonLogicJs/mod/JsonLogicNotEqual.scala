package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<never>, '!='> */
trait JsonLogicNotEqual
  extends StObject
     with _RulesLogic[Any] {
  
  @JSName("!=")
  var ExclamationmarkEqualssign: js.Tuple2[Any, Any]
}
object JsonLogicNotEqual {
  
  inline def apply(ExclamationmarkEqualssign: js.Tuple2[Any, Any]): JsonLogicNotEqual = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!=")(ExclamationmarkEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicNotEqual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicNotEqual] (val x: Self) extends AnyVal {
    
    inline def setExclamationmarkEqualssign(value: js.Tuple2[Any, Any]): Self = StObject.set(x, "!=", value.asInstanceOf[js.Any])
  }
}
