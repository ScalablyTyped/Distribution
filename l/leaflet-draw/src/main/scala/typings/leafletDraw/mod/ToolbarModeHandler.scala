package typings.leafletDraw.mod

import typings.leaflet.mod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarModeHandler extends StObject {
  
  var enabled: Boolean
  
  var handler: Handler
  
  var title: String
}
object ToolbarModeHandler {
  
  inline def apply(enabled: Boolean, handler: Handler, title: String): ToolbarModeHandler = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarModeHandler]
  }
  
  extension [Self <: ToolbarModeHandler](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setHandler(value: Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
