package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsVolatileMethodParameters extends StObject {
  
  var isVolatile: Boolean
  
  var method: String
  
  var parameters: js.Array[ArgumentType]
}
object IsVolatileMethodParameters {
  
  inline def apply(isVolatile: Boolean, method: String, parameters: js.Array[ArgumentType]): IsVolatileMethodParameters = {
    val __obj = js.Dynamic.literal(isVolatile = isVolatile.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsVolatileMethodParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsVolatileMethodParameters] (val x: Self) extends AnyVal {
    
    inline def setIsVolatile(value: Boolean): Self = StObject.set(x, "isVolatile", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentType]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: ArgumentType*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
