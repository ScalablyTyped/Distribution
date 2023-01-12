package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashComponentInstance extends StObject {
  
  var parameters: js.Array[Any]
}
object FlashComponentInstance {
  
  inline def apply(parameters: js.Array[Any]): FlashComponentInstance = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashComponentInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashComponentInstance] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: js.Array[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Any*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
