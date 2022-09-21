package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoesNotNeedArgumentsToBeComputed extends StObject {
  
  var doesNotNeedArgumentsToBeComputed: Boolean
  
  var isDependentOnSheetStructureChange: Boolean
  
  var method: String
  
  var parameters: js.Array[ArgumentType]
  
  var vectorizationForbidden: Boolean
}
object DoesNotNeedArgumentsToBeComputed {
  
  inline def apply(
    doesNotNeedArgumentsToBeComputed: Boolean,
    isDependentOnSheetStructureChange: Boolean,
    method: String,
    parameters: js.Array[ArgumentType],
    vectorizationForbidden: Boolean
  ): DoesNotNeedArgumentsToBeComputed = {
    val __obj = js.Dynamic.literal(doesNotNeedArgumentsToBeComputed = doesNotNeedArgumentsToBeComputed.asInstanceOf[js.Any], isDependentOnSheetStructureChange = isDependentOnSheetStructureChange.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], vectorizationForbidden = vectorizationForbidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoesNotNeedArgumentsToBeComputed]
  }
  
  extension [Self <: DoesNotNeedArgumentsToBeComputed](x: Self) {
    
    inline def setDoesNotNeedArgumentsToBeComputed(value: Boolean): Self = StObject.set(x, "doesNotNeedArgumentsToBeComputed", value.asInstanceOf[js.Any])
    
    inline def setIsDependentOnSheetStructureChange(value: Boolean): Self = StObject.set(x, "isDependentOnSheetStructureChange", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentType]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: ArgumentType*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setVectorizationForbidden(value: Boolean): Self = StObject.set(x, "vectorizationForbidden", value.asInstanceOf[js.Any])
  }
}
