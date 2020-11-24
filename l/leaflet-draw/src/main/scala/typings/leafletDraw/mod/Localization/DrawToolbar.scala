package typings.leafletDraw.mod.Localization

import typings.leafletDraw.anon.Circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawToolbar extends js.Object {
  
  var actions: Action = js.native
  
  var buttons: Circle = js.native
  
  var finish: Action = js.native
  
  var undo: Action = js.native
}
object DrawToolbar {
  
  @scala.inline
  def apply(actions: Action, buttons: Circle, finish: Action, undo: Action): DrawToolbar = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawToolbar]
  }
  
  @scala.inline
  implicit class DrawToolbarOps[Self <: DrawToolbar] (val x: Self) extends AnyVal {
    
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
    def setActions(value: Action): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: Circle): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinish(value: Action): Self = this.set("finish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndo(value: Action): Self = this.set("undo", value.asInstanceOf[js.Any])
  }
}
