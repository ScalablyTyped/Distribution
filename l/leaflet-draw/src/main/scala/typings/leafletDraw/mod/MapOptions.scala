package typings.leafletDraw.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapOptions extends js.Object {
  
  var drawControl: js.UndefOr[Boolean] = js.native
  
  var drawControlTooltips: js.UndefOr[Boolean] = js.native
  
  var touchExtend: js.UndefOr[Boolean] = js.native
}
object MapOptions {
  
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
    
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
    def setDrawControl(value: Boolean): Self = this.set("drawControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawControl: Self = this.set("drawControl", js.undefined)
    
    @scala.inline
    def setDrawControlTooltips(value: Boolean): Self = this.set("drawControlTooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawControlTooltips: Self = this.set("drawControlTooltips", js.undefined)
    
    @scala.inline
    def setTouchExtend(value: Boolean): Self = this.set("touchExtend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchExtend: Self = this.set("touchExtend", js.undefined)
  }
}
