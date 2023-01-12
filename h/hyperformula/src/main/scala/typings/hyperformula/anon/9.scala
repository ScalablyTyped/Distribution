package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var method: String
  
  var parameters: js.Array[MinValueOptionalArg | OptionalArgUndefined | ArgumentTypeMinValueOptionalArg]
}
object `9` {
  
  inline def apply(
    method: String,
    parameters: js.Array[MinValueOptionalArg | OptionalArgUndefined | ArgumentTypeMinValueOptionalArg]
  ): `9` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `9`] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[MinValueOptionalArg | OptionalArgUndefined | ArgumentTypeMinValueOptionalArg]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (MinValueOptionalArg | OptionalArgUndefined | ArgumentTypeMinValueOptionalArg)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
