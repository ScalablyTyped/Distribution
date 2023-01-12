package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var method: String
  
  var parameters: js.Array[DefaultValueUndefined | ArgumentTypeArgumentTypesDefaultValueBoolean]
}
object `21` {
  
  inline def apply(
    method: String,
    parameters: js.Array[DefaultValueUndefined | ArgumentTypeArgumentTypesDefaultValueBoolean]
  ): `21` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `21`] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[DefaultValueUndefined | ArgumentTypeArgumentTypesDefaultValueBoolean]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (DefaultValueUndefined | ArgumentTypeArgumentTypesDefaultValueBoolean)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
