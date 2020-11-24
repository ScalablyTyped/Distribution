package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapMarkerDefaultsTooltipAnimation extends js.Object {
  
  var close: js.UndefOr[MapMarkerDefaultsTooltipAnimationClose] = js.native
  
  var open: js.UndefOr[MapMarkerDefaultsTooltipAnimationOpen] = js.native
}
object MapMarkerDefaultsTooltipAnimation {
  
  @scala.inline
  def apply(): MapMarkerDefaultsTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMarkerDefaultsTooltipAnimation]
  }
  
  @scala.inline
  implicit class MapMarkerDefaultsTooltipAnimationOps[Self <: MapMarkerDefaultsTooltipAnimation] (val x: Self) extends AnyVal {
    
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
    def setClose(value: MapMarkerDefaultsTooltipAnimationClose): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setOpen(value: MapMarkerDefaultsTooltipAnimationOpen): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
}
