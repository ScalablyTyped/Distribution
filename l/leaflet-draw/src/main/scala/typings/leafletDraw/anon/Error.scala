package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends StObject {
  
  var error: String = js.native
  
  var tooltip: Cont = js.native
}
object Error {
  
  @scala.inline
  def apply(error: String, tooltip: Cont): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: Cont): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
