package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  var method: String
  
  var parameters: js.Array[LessThanMaxValue | GreaterThanLessThanMaxValue | LessThanMaxValueMinValue]
}
object `34` {
  
  inline def apply(
    method: String,
    parameters: js.Array[LessThanMaxValue | GreaterThanLessThanMaxValue | LessThanMaxValueMinValue]
  ): `34` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`34`]
  }
  
  extension [Self <: `34`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[LessThanMaxValue | GreaterThanLessThanMaxValue | LessThanMaxValueMinValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (LessThanMaxValue | GreaterThanLessThanMaxValue | LessThanMaxValueMinValue)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
