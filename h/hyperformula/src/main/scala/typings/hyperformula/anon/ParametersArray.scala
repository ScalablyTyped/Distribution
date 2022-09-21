package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersArray extends StObject {
  
  var method: String
  
  var parameters: js.Array[scala.Nothing]
}
object ParametersArray {
  
  inline def apply(method: String, parameters: js.Array[scala.Nothing]): ParametersArray = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersArray]
  }
  
  extension [Self <: ParametersArray](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[scala.Nothing]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: scala.Nothing*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
