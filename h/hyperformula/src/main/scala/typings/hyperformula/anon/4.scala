package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var method: String
  
  var parameters: js.Array[DefaultValueMinValue | DefaultValueBoolean]
}
object `4` {
  
  inline def apply(method: String, parameters: js.Array[DefaultValueMinValue | DefaultValueBoolean]): `4` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[DefaultValueMinValue | DefaultValueBoolean]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (DefaultValueMinValue | DefaultValueBoolean)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
