package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  var method: String
  
  var parameters: js.Array[MaxValueUndefined | ArgumentTypeMaxValue]
}
object `25` {
  
  inline def apply(method: String, parameters: js.Array[MaxValueUndefined | ArgumentTypeMaxValue]): `25` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[MaxValueUndefined | ArgumentTypeMaxValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (MaxValueUndefined | ArgumentTypeMaxValue)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
