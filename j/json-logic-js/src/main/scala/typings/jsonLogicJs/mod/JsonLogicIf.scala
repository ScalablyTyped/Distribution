package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<never>, 'if'> */
trait JsonLogicIf
  extends StObject
     with _RulesLogic[Any] {
  
  var `if`: AnyArrayOfOddLengthMin3
}
object JsonLogicIf {
  
  inline def apply(`if`: AnyArrayOfOddLengthMin3): JsonLogicIf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicIf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonLogicIf] (val x: Self) extends AnyVal {
    
    inline def setIf(value: AnyArrayOfOddLengthMin3): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    inline def setIfVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: []['length'] extends json-logic-js.json-logic-js.MAXIMUM_ALLOWED_BOUNDARY ? [] : [any, any] extends [] ? [] : [] extends [] ? json-logic-js.json-logic-js.Mapped<[any, any], [any, any], [...[], 1]> : json-logic-js.json-logic-js.Mapped<[any, any], [] | [...[], ...[any, any]], [...[], 1]> */ js.Any)*
    ): Self = StObject.set(x, "if", js.Array(value*))
  }
}
