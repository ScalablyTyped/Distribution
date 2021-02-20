package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapMarkerTooltipAnimation extends StObject {
  
  var close: js.UndefOr[MapMarkerTooltipAnimationClose] = js.native
  
  var open: js.UndefOr[MapMarkerTooltipAnimationOpen] = js.native
}
object MapMarkerTooltipAnimation {
  
  @scala.inline
  def apply(): MapMarkerTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMarkerTooltipAnimation]
  }
  
  @scala.inline
  implicit class MapMarkerTooltipAnimationMutableBuilder[Self <: MapMarkerTooltipAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: MapMarkerTooltipAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: MapMarkerTooltipAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
