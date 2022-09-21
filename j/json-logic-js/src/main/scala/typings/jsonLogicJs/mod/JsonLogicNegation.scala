package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<never>, '!'> */
trait JsonLogicNegation
  extends StObject
     with _RulesLogic[Any] {
  
  @JSName("!")
  var Exclamationmark: Any
}
object JsonLogicNegation {
  
  inline def apply(Exclamationmark: Any): JsonLogicNegation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!")(Exclamationmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicNegation]
  }
  
  extension [Self <: JsonLogicNegation](x: Self) {
    
    inline def setExclamationmark(value: Any): Self = StObject.set(x, "!", value.asInstanceOf[js.Any])
  }
}
