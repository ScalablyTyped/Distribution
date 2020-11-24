package typings.jqueryTools.JQueryTools

import typings.jqueryTools.JQueryTools.overlay.OverlayStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolsStatic extends js.Object {
  
  var overlay: OverlayStatic = js.native
}
object ToolsStatic {
  
  @scala.inline
  def apply(overlay: OverlayStatic): ToolsStatic = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolsStatic]
  }
  
  @scala.inline
  implicit class ToolsStaticOps[Self <: ToolsStatic] (val x: Self) extends AnyVal {
    
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
    def setOverlay(value: OverlayStatic): Self = this.set("overlay", value.asInstanceOf[js.Any])
  }
}
