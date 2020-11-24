package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.PanOptions because var conflicts: animate. Inlined duration, easeLinearity, noMoveStart */ @js.native
trait ZoomPanOptions extends ZoomOptions {
  
  var duration: js.UndefOr[Double] = js.native
  
  var easeLinearity: js.UndefOr[Double] = js.native
  
  var noMoveStart: js.UndefOr[Boolean] = js.native
}
object ZoomPanOptions {
  
  @scala.inline
  def apply(): ZoomPanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomPanOptions]
  }
  
  @scala.inline
  implicit class ZoomPanOptionsOps[Self <: ZoomPanOptions] (val x: Self) extends AnyVal {
    
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
  }
}
