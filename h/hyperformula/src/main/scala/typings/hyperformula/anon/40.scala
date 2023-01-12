package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  var method: String
  
  var parameters: js.Array[
    ArgumentTypeGreaterThanLessThanMinValue | LessThanUndefinedMinValueUndefined | LessThanUndefined
  ]
}
object `40` {
  
  inline def apply(
    method: String,
    parameters: js.Array[
      ArgumentTypeGreaterThanLessThanMinValue | LessThanUndefinedMinValueUndefined | LessThanUndefined
    ]
  ): `40` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`40`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `40`] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(
      value: js.Array[
          ArgumentTypeGreaterThanLessThanMinValue | LessThanUndefinedMinValueUndefined | LessThanUndefined
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(
      value: (ArgumentTypeGreaterThanLessThanMinValue | LessThanUndefinedMinValueUndefined | LessThanUndefined)*
    ): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
