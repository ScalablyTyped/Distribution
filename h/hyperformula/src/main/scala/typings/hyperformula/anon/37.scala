package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  var method: String
  
  var parameters: js.Array[ArgumentTypeGreaterThanMaxValue | ArgumentTypeGreaterThan]
}
object `37` {
  
  inline def apply(method: String, parameters: js.Array[ArgumentTypeGreaterThanMaxValue | ArgumentTypeGreaterThan]): `37` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`37`]
  }
  
  extension [Self <: `37`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentTypeGreaterThanMaxValue | ArgumentTypeGreaterThan]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (ArgumentTypeGreaterThanMaxValue | ArgumentTypeGreaterThan)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
