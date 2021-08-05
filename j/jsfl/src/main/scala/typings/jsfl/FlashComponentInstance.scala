package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashComponentInstance extends StObject {
  
  var parameters: js.Array[js.Any]
}
object FlashComponentInstance {
  
  inline def apply(parameters: js.Array[js.Any]): FlashComponentInstance = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashComponentInstance]
  }
  
  extension [Self <: FlashComponentInstance](x: Self) {
    
    inline def setParameters(value: js.Array[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: js.Any*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
