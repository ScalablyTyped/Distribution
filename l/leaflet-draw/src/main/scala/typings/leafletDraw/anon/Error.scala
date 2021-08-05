package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: String
  
  var tooltip: Cont
}
object Error {
  
  inline def apply(error: String, tooltip: Cont): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: Cont): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
