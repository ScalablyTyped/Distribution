package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `28` extends StObject {
  
  var method: String
  
  var parameters: js.Array[
    ArgumentTypeGreaterThanMinValue | ArgumentTypeArgumentTypesGreaterThanNumber | GreaterThanUndefinedMinValueUndefined
  ]
}
object `28` {
  
  inline def apply(
    method: String,
    parameters: js.Array[
      ArgumentTypeGreaterThanMinValue | ArgumentTypeArgumentTypesGreaterThanNumber | GreaterThanUndefinedMinValueUndefined
    ]
  ): `28` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`28`]
  }
  
  extension [Self <: `28`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(
      value: js.Array[
          ArgumentTypeGreaterThanMinValue | ArgumentTypeArgumentTypesGreaterThanNumber | GreaterThanUndefinedMinValueUndefined
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(
      value: (ArgumentTypeGreaterThanMinValue | ArgumentTypeArgumentTypesGreaterThanNumber | GreaterThanUndefinedMinValueUndefined)*
    ): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
