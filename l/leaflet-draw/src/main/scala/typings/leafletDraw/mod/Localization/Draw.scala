package typings.leafletDraw.mod.Localization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Draw extends js.Object {
  
  var handlers: DrawHandlers = js.native
  
  var toolbar: DrawToolbar = js.native
}
object Draw {
  
  @scala.inline
  def apply(handlers: DrawHandlers, toolbar: DrawToolbar): Draw = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draw]
  }
  
  @scala.inline
  implicit class DrawOps[Self <: Draw] (val x: Self) extends AnyVal {
    
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
    def setHandlers(value: DrawHandlers): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar(value: DrawToolbar): Self = this.set("toolbar", value.asInstanceOf[js.Any])
  }
}
