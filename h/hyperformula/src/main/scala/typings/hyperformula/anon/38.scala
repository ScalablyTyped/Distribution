package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38` extends StObject {
  
  var method: String
  
  var parameters: js.Array[
    GreaterThanLessThan | GreaterThanUndefinedLessThanUndefined | GreaterThanNumberLessThanUndefined
  ]
}
object `38` {
  
  inline def apply(
    method: String,
    parameters: js.Array[
      GreaterThanLessThan | GreaterThanUndefinedLessThanUndefined | GreaterThanNumberLessThanUndefined
    ]
  ): `38` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`38`]
  }
  
  extension [Self <: `38`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(
      value: js.Array[
          GreaterThanLessThan | GreaterThanUndefinedLessThanUndefined | GreaterThanNumberLessThanUndefined
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(
      value: (GreaterThanLessThan | GreaterThanUndefinedLessThanUndefined | GreaterThanNumberLessThanUndefined)*
    ): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
