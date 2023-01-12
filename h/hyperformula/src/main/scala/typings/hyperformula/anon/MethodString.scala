package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodString extends StObject {
  
  var method: String
  
  var parameters: js.Array[ArgumentTypeMinValue]
}
object MethodString {
  
  inline def apply(method: String, parameters: js.Array[ArgumentTypeMinValue]): MethodString = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodString] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentTypeMinValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: ArgumentTypeMinValue*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
