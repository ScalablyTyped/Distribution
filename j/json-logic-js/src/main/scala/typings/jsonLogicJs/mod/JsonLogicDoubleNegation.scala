package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<never>, '!!'> */
trait JsonLogicDoubleNegation
  extends StObject
     with _RulesLogic[Any] {
  
  @JSName("!!")
  var ExclamationmarkExclamationmark: Any
}
object JsonLogicDoubleNegation {
  
  inline def apply(ExclamationmarkExclamationmark: Any): JsonLogicDoubleNegation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!!")(ExclamationmarkExclamationmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicDoubleNegation]
  }
  
  extension [Self <: JsonLogicDoubleNegation](x: Self) {
    
    inline def setExclamationmarkExclamationmark(value: Any): Self = StObject.set(x, "!!", value.asInstanceOf[js.Any])
  }
}
