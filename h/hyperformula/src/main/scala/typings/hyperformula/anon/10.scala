package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var method: String
  
  var parameters: js.Array[
    DefaultValueMinValueOptionalArg | ArgumentTypeArgumentTypesDefaultValueUndefined | ArgumentTypeDefaultValueMinValueOptionalArg | MinValueUndefined
  ]
}
object `10` {
  
  inline def apply(
    method: String,
    parameters: js.Array[
      DefaultValueMinValueOptionalArg | ArgumentTypeArgumentTypesDefaultValueUndefined | ArgumentTypeDefaultValueMinValueOptionalArg | MinValueUndefined
    ]
  ): `10` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(
      value: js.Array[
          DefaultValueMinValueOptionalArg | ArgumentTypeArgumentTypesDefaultValueUndefined | ArgumentTypeDefaultValueMinValueOptionalArg | MinValueUndefined
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(
      value: (DefaultValueMinValueOptionalArg | ArgumentTypeArgumentTypesDefaultValueUndefined | ArgumentTypeDefaultValueMinValueOptionalArg | MinValueUndefined)*
    ): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
