package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  var method: String
  
  var parameters: js.Array[ArgumentTypeGreaterThanLessThanMinValue | LessThanUndefined]
}
object `36` {
  
  inline def apply(method: String, parameters: js.Array[ArgumentTypeGreaterThanLessThanMinValue | LessThanUndefined]): `36` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `36`] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentTypeGreaterThanLessThanMinValue | LessThanUndefined]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (ArgumentTypeGreaterThanLessThanMinValue | LessThanUndefined)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
