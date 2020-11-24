package typings.leafletDraw.mod

import typings.leaflet.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarModeHandler extends js.Object {
  
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
  implicit class ToolbarModeHandlerOps[Self <: ToolbarModeHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: Handler): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
