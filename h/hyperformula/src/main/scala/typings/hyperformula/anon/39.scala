package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  var method: String
  
  var parameters: js.Array[ArgumentTypeArgumentTypesGreaterThanUndefined | GreaterThanNumber]
}
object `39` {
  
  inline def apply(
    method: String,
    parameters: js.Array[ArgumentTypeArgumentTypesGreaterThanUndefined | GreaterThanNumber]
  ): `39` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`39`]
  }
  
  extension [Self <: `39`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentTypeArgumentTypesGreaterThanUndefined | GreaterThanNumber]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (ArgumentTypeArgumentTypesGreaterThanUndefined | GreaterThanNumber)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
