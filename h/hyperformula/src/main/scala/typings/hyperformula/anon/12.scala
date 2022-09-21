package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var method: String
  
  var parameters: js.Array[MinValue | ArgumentTypeMinValue]
}
object `12` {
  
  inline def apply(method: String, parameters: js.Array[MinValue | ArgumentTypeMinValue]): `12` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[MinValue | ArgumentTypeMinValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (MinValue | ArgumentTypeMinValue)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
