package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashComponentInstance extends StObject {
  
  var parameters: js.Array[_] = js.native
}
object FlashComponentInstance {
  
  @scala.inline
  def apply(parameters: js.Array[_]): FlashComponentInstance = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashComponentInstance]
  }
  
  @scala.inline
  implicit class FlashComponentInstanceMutableBuilder[Self <: FlashComponentInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: js.Array[_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: js.Any*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
