package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArraySizeMethodMethodParameters extends StObject {
  
  var arraySizeMethod: String
  
  var method: String
  
  var parameters: js.Array[OptionalArg | ArgumentTypeOptionalArg]
  
  var vectorizationForbidden: Boolean
}
object ArraySizeMethodMethodParameters {
  
  inline def apply(
    arraySizeMethod: String,
    method: String,
    parameters: js.Array[OptionalArg | ArgumentTypeOptionalArg],
    vectorizationForbidden: Boolean
  ): ArraySizeMethodMethodParameters = {
    val __obj = js.Dynamic.literal(arraySizeMethod = arraySizeMethod.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], vectorizationForbidden = vectorizationForbidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySizeMethodMethodParameters]
  }
  
  extension [Self <: ArraySizeMethodMethodParameters](x: Self) {
    
    inline def setArraySizeMethod(value: String): Self = StObject.set(x, "arraySizeMethod", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[OptionalArg | ArgumentTypeOptionalArg]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (OptionalArg | ArgumentTypeOptionalArg)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setVectorizationForbidden(value: Boolean): Self = StObject.set(x, "vectorizationForbidden", value.asInstanceOf[js.Any])
  }
}
