package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersArrayReturnNumberTypeNumberType extends StObject {
  
  var method: String
  
  var parameters: js.Array[ArgumentTypeDefaultValueMaxValue | DefaultValueMaxValueMinValue]
  
  var returnNumberType: NumberType
}
object ParametersArrayReturnNumberTypeNumberType {
  
  inline def apply(
    method: String,
    parameters: js.Array[ArgumentTypeDefaultValueMaxValue | DefaultValueMaxValueMinValue],
    returnNumberType: NumberType
  ): ParametersArrayReturnNumberTypeNumberType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], returnNumberType = returnNumberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersArrayReturnNumberTypeNumberType]
  }
  
  extension [Self <: ParametersArrayReturnNumberTypeNumberType](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentTypeDefaultValueMaxValue | DefaultValueMaxValueMinValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (ArgumentTypeDefaultValueMaxValue | DefaultValueMaxValueMinValue)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setReturnNumberType(value: NumberType): Self = StObject.set(x, "returnNumberType", value.asInstanceOf[js.Any])
  }
}
