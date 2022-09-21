package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var method: String
  
  var parameters: js.Array[GreaterThanNumber | ArgumentTypeArgumentTypesGreaterThanUndefined]
}
object `19` {
  
  inline def apply(
    method: String,
    parameters: js.Array[GreaterThanNumber | ArgumentTypeArgumentTypesGreaterThanUndefined]
  ): `19` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[GreaterThanNumber | ArgumentTypeArgumentTypesGreaterThanUndefined]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (GreaterThanNumber | ArgumentTypeArgumentTypesGreaterThanUndefined)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
