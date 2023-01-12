package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodParametersRepeatLastArgs extends StObject {
  
  var method: String
  
  var parameters: js.Array[ArgumentType]
  
  var repeatLastArgs: Double
}
object MethodParametersRepeatLastArgs {
  
  inline def apply(method: String, parameters: js.Array[ArgumentType], repeatLastArgs: Double): MethodParametersRepeatLastArgs = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], repeatLastArgs = repeatLastArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodParametersRepeatLastArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodParametersRepeatLastArgs] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentType]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: ArgumentType*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRepeatLastArgs(value: Double): Self = StObject.set(x, "repeatLastArgs", value.asInstanceOf[js.Any])
  }
}
