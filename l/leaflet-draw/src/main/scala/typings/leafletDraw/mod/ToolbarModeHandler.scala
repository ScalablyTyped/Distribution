package typings.leafletDraw.mod

import typings.leaflet.mod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarModeHandler extends StObject {
  
  var enabled: Boolean = js.native
  
  var handler: Handler = js.native
  
  var title: String = js.native
}
object ToolbarModeHandler {
  
  @scala.inline
  def apply(enabled: Boolean, handler: Handler, title: String): ToolbarModeHandler = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarModeHandler]
  }
  
  @scala.inline
  implicit class ToolbarModeHandlerMutableBuilder[Self <: ToolbarModeHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
