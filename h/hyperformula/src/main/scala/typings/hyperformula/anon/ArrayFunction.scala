package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayFunction extends StObject {
  
  var arrayFunction: Boolean
  
  var arraySizeMethod: String
  
  var method: String
  
  var parameters: js.Array[ArgumentType]
}
object ArrayFunction {
  
  inline def apply(
    arrayFunction: Boolean,
    arraySizeMethod: String,
    method: String,
    parameters: js.Array[ArgumentType]
  ): ArrayFunction = {
    val __obj = js.Dynamic.literal(arrayFunction = arrayFunction.asInstanceOf[js.Any], arraySizeMethod = arraySizeMethod.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFunction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayFunction] (val x: Self) extends AnyVal {
    
    inline def setArrayFunction(value: Boolean): Self = StObject.set(x, "arrayFunction", value.asInstanceOf[js.Any])
    
    inline def setArraySizeMethod(value: String): Self = StObject.set(x, "arraySizeMethod", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentType]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: ArgumentType*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
