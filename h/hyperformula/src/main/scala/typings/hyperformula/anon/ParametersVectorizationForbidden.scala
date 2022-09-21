package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersVectorizationForbidden extends StObject {
  
  var method: String
  
  var parameters: js.Array[ArgumentType]
  
  var vectorizationForbidden: Boolean
}
object ParametersVectorizationForbidden {
  
  inline def apply(method: String, parameters: js.Array[ArgumentType], vectorizationForbidden: Boolean): ParametersVectorizationForbidden = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], vectorizationForbidden = vectorizationForbidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersVectorizationForbidden]
  }
  
  extension [Self <: ParametersVectorizationForbidden](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentType]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: ArgumentType*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setVectorizationForbidden(value: Boolean): Self = StObject.set(x, "vectorizationForbidden", value.asInstanceOf[js.Any])
  }
}
