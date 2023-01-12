package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var method: String
  
  var parameters: js.Array[LessThan | ArgumentTypeLessThan]
}
object `23` {
  
  inline def apply(method: String, parameters: js.Array[LessThan | ArgumentTypeLessThan]): `23` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `23`] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[LessThan | ArgumentTypeLessThan]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (LessThan | ArgumentTypeLessThan)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
