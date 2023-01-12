package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var method: String
  
  var parameters: js.Array[ArgumentTypeMaxValueMinValue | MaxValueMinValueOptionalArg]
}
object `24` {
  
  inline def apply(method: String, parameters: js.Array[ArgumentTypeMaxValueMinValue | MaxValueMinValueOptionalArg]): `24` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`24`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `24`] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentTypeMaxValueMinValue | MaxValueMinValueOptionalArg]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (ArgumentTypeMaxValueMinValue | MaxValueMinValueOptionalArg)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
