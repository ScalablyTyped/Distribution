package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArraySizeMethod extends StObject {
  
  var arraySizeMethod: String
  
  var method: String
  
  var parameters: js.Array[MinValue | ArgumentTypeMinValue]
  
  var vectorizationForbidden: Boolean
}
object ArraySizeMethod {
  
  inline def apply(
    arraySizeMethod: String,
    method: String,
    parameters: js.Array[MinValue | ArgumentTypeMinValue],
    vectorizationForbidden: Boolean
  ): ArraySizeMethod = {
    val __obj = js.Dynamic.literal(arraySizeMethod = arraySizeMethod.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], vectorizationForbidden = vectorizationForbidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySizeMethod]
  }
  
  extension [Self <: ArraySizeMethod](x: Self) {
    
    inline def setArraySizeMethod(value: String): Self = StObject.set(x, "arraySizeMethod", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[MinValue | ArgumentTypeMinValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (MinValue | ArgumentTypeMinValue)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setVectorizationForbidden(value: Boolean): Self = StObject.set(x, "vectorizationForbidden", value.asInstanceOf[js.Any])
  }
}
