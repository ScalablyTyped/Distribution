package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var method: String
  
  var parameters: js.Array[
    ArgumentTypeDefaultValueGreaterThan | GreaterThanUndefined | ArgumentTypeArgumentTypesDefaultValueNumber
  ]
  
  var returnNumberType: NumberType
}
object `14` {
  
  inline def apply(
    method: String,
    parameters: js.Array[
      ArgumentTypeDefaultValueGreaterThan | GreaterThanUndefined | ArgumentTypeArgumentTypesDefaultValueNumber
    ],
    returnNumberType: NumberType
  ): `14` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], returnNumberType = returnNumberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `14`] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(
      value: js.Array[
          ArgumentTypeDefaultValueGreaterThan | GreaterThanUndefined | ArgumentTypeArgumentTypesDefaultValueNumber
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(
      value: (ArgumentTypeDefaultValueGreaterThan | GreaterThanUndefined | ArgumentTypeArgumentTypesDefaultValueNumber)*
    ): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setReturnNumberType(value: NumberType): Self = StObject.set(x, "returnNumberType", value.asInstanceOf[js.Any])
  }
}
