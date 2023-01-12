package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  var method: String
  
  var parameters: js.Array[
    GreaterThanUndefined | ArgumentTypeDefaultValueGreaterThan | ArgumentTypeArgumentTypesDefaultValueNumber
  ]
}
object `31` {
  
  inline def apply(
    method: String,
    parameters: js.Array[
      GreaterThanUndefined | ArgumentTypeDefaultValueGreaterThan | ArgumentTypeArgumentTypesDefaultValueNumber
    ]
  ): `31` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`31`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `31`] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(
      value: js.Array[
          GreaterThanUndefined | ArgumentTypeDefaultValueGreaterThan | ArgumentTypeArgumentTypesDefaultValueNumber
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(
      value: (GreaterThanUndefined | ArgumentTypeDefaultValueGreaterThan | ArgumentTypeArgumentTypesDefaultValueNumber)*
    ): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
