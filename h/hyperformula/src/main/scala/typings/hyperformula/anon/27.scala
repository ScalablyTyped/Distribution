package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  var method: String
  
  var parameters: js.Array[DefaultValueLessThan | LessThanMinValue]
}
object `27` {
  
  inline def apply(method: String, parameters: js.Array[DefaultValueLessThan | LessThanMinValue]): `27` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`27`]
  }
  
  extension [Self <: `27`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[DefaultValueLessThan | LessThanMinValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (DefaultValueLessThan | LessThanMinValue)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
