package typings.hyperformula.anon

import typings.hyperformula.interpreterValueMod.NumberType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnNumberTypeNumberType extends StObject {
  
  var method: String
  
  var parameters: js.Array[GreaterThan | ArgumentTypeGreaterThan | GreaterThanMaxValue]
  
  var returnNumberType: NumberType
}
object ReturnNumberTypeNumberType {
  
  inline def apply(
    method: String,
    parameters: js.Array[GreaterThan | ArgumentTypeGreaterThan | GreaterThanMaxValue],
    returnNumberType: NumberType
  ): ReturnNumberTypeNumberType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], returnNumberType = returnNumberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnNumberTypeNumberType]
  }
  
  extension [Self <: ReturnNumberTypeNumberType](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[GreaterThan | ArgumentTypeGreaterThan | GreaterThanMaxValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (GreaterThan | ArgumentTypeGreaterThan | GreaterThanMaxValue)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setReturnNumberType(value: NumberType): Self = StObject.set(x, "returnNumberType", value.asInstanceOf[js.Any])
  }
}
