package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  var method: String
  
  var parameters: js.Array[ArgumentTypeGreaterThanLessThan | GreaterThanLessThanMinValue]
}
object `30` {
  
  inline def apply(
    method: String,
    parameters: js.Array[ArgumentTypeGreaterThanLessThan | GreaterThanLessThanMinValue]
  ): `30` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`30`]
  }
  
  extension [Self <: `30`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentTypeGreaterThanLessThan | GreaterThanLessThanMinValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (ArgumentTypeGreaterThanLessThan | GreaterThanLessThanMinValue)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
