package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters extends StObject {
  
  var arrayFunction: Boolean
  
  var arraySizeMethod: String
  
  var method: String
  
  var parameters: js.Array[ArgumentType]
  
  var repeatLastArgs: Double
}
object Parameters {
  
  inline def apply(
    arrayFunction: Boolean,
    arraySizeMethod: String,
    method: String,
    parameters: js.Array[ArgumentType],
    repeatLastArgs: Double
  ): Parameters = {
    val __obj = js.Dynamic.literal(arrayFunction = arrayFunction.asInstanceOf[js.Any], arraySizeMethod = arraySizeMethod.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], repeatLastArgs = repeatLastArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  
  extension [Self <: Parameters](x: Self) {
    
    inline def setArrayFunction(value: Boolean): Self = StObject.set(x, "arrayFunction", value.asInstanceOf[js.Any])
    
    inline def setArraySizeMethod(value: String): Self = StObject.set(x, "arraySizeMethod", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentType]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: ArgumentType*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRepeatLastArgs(value: Double): Self = StObject.set(x, "repeatLastArgs", value.asInstanceOf[js.Any])
  }
}
