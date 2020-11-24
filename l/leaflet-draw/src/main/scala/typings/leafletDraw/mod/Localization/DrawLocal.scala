package typings.leafletDraw.mod.Localization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawLocal extends js.Object {
  
  var draw: Draw = js.native
  
  var edit: Edit = js.native
}
object DrawLocal {
  
  @scala.inline
  def apply(draw: Draw, edit: Edit): DrawLocal = {
    val __obj = js.Dynamic.literal(draw = draw.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawLocal]
  }
  
  @scala.inline
  implicit class DrawLocalOps[Self <: DrawLocal] (val x: Self) extends AnyVal {
    
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
    def setDraw(value: Draw): Self = this.set("draw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit(value: Edit): Self = this.set("edit", value.asInstanceOf[js.Any])
  }
}
