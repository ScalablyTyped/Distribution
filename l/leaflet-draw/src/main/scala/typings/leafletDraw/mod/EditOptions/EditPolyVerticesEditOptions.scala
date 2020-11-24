package typings.leafletDraw.mod.EditOptions

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leafletDraw.mod.DrawOptions.DrawErrorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditPolyVerticesEditOptions extends js.Object {
  
  var drawError: js.UndefOr[DrawErrorOptions] = js.native
  
  var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  
  var touchIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
}
object EditPolyVerticesEditOptions {
  
  @scala.inline
  def apply(): EditPolyVerticesEditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditPolyVerticesEditOptions]
  }
  
  @scala.inline
  implicit class EditPolyVerticesEditOptionsOps[Self <: EditPolyVerticesEditOptions] (val x: Self) extends AnyVal {
    
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
    def setDrawError(value: DrawErrorOptions): Self = this.set("drawError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawError: Self = this.set("drawError", js.undefined)
    
    @scala.inline
    def setIcon(value: Icon_[IconOptions] | DivIcon_): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setTouchIcon(value: Icon_[IconOptions] | DivIcon_): Self = this.set("touchIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchIcon: Self = this.set("touchIcon", js.undefined)
  }
}
