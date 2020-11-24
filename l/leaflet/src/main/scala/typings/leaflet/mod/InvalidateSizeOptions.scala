package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.PanOptions because var conflicts: animate. Inlined duration, easeLinearity, noMoveStart */ @js.native
trait InvalidateSizeOptions extends ZoomOptions {
  
  var debounceMoveend: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easeLinearity: js.UndefOr[Double] = js.native
  
  var noMoveStart: js.UndefOr[Boolean] = js.native
  
  var pan: js.UndefOr[Boolean] = js.native
}
object InvalidateSizeOptions {
  
  @scala.inline
  def apply(): InvalidateSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidateSizeOptions]
  }
  
  @scala.inline
  implicit class InvalidateSizeOptionsOps[Self <: InvalidateSizeOptions] (val x: Self) extends AnyVal {
    
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
    def setDebounceMoveend(value: Boolean): Self = this.set("debounceMoveend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebounceMoveend: Self = this.set("debounceMoveend", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEaseLinearity(value: Double): Self = this.set("easeLinearity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEaseLinearity: Self = this.set("easeLinearity", js.undefined)
    
    @scala.inline
    def setNoMoveStart(value: Boolean): Self = this.set("noMoveStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoMoveStart: Self = this.set("noMoveStart", js.undefined)
    
    @scala.inline
    def setPan(value: Boolean): Self = this.set("pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
  }
}
