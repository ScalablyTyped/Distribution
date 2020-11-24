package typings.leafletPm.mod.PM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditOptions extends js.Object {
  
  var draggable: js.UndefOr[Boolean] = js.native
  
  var snapDistance: js.UndefOr[Double] = js.native
  
  var snappable: js.UndefOr[Boolean] = js.native
}
object EditOptions {
  
  @scala.inline
  def apply(): EditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditOptions]
  }
  
  @scala.inline
  implicit class EditOptionsOps[Self <: EditOptions] (val x: Self) extends AnyVal {
    
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
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setSnapDistance(value: Double): Self = this.set("snapDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapDistance: Self = this.set("snapDistance", js.undefined)
    
    @scala.inline
    def setSnappable(value: Boolean): Self = this.set("snappable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnappable: Self = this.set("snappable", js.undefined)
  }
}
