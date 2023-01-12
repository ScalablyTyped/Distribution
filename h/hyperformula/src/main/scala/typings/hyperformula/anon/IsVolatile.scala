package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsVolatile extends StObject {
  
  var isVolatile: Boolean
  
  var method: String
  
  var parameters: js.Array[scala.Nothing]
  
  var returnNumberType: NumberType
}
object IsVolatile {
  
  inline def apply(
    isVolatile: Boolean,
    method: String,
    parameters: js.Array[scala.Nothing],
    returnNumberType: NumberType
  ): IsVolatile = {
    val __obj = js.Dynamic.literal(isVolatile = isVolatile.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], returnNumberType = returnNumberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsVolatile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsVolatile] (val x: Self) extends AnyVal {
    
    inline def setIsVolatile(value: Boolean): Self = StObject.set(x, "isVolatile", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[scala.Nothing]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: scala.Nothing*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setReturnNumberType(value: NumberType): Self = StObject.set(x, "returnNumberType", value.asInstanceOf[js.Any])
  }
}
