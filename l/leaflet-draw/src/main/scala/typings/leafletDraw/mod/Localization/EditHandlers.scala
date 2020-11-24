package typings.leafletDraw.mod.Localization

import typings.leafletDraw.anon.TooltipText
import typings.leafletDraw.anon.TooltipTextString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditHandlers extends js.Object {
  
  var edit: TooltipText = js.native
  
  var remove: TooltipTextString = js.native
}
object EditHandlers {
  
  @scala.inline
  def apply(edit: TooltipText, remove: TooltipTextString): EditHandlers = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditHandlers]
  }
  
  @scala.inline
  implicit class EditHandlersOps[Self <: EditHandlers] (val x: Self) extends AnyVal {
    
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
    def setEdit(value: TooltipText): Self = this.set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: TooltipTextString): Self = this.set("remove", value.asInstanceOf[js.Any])
  }
}
