package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapMarkerDefaultsTooltipAnimation extends StObject {
  
  var close: js.UndefOr[MapMarkerDefaultsTooltipAnimationClose] = js.undefined
  
  var open: js.UndefOr[MapMarkerDefaultsTooltipAnimationOpen] = js.undefined
}
object MapMarkerDefaultsTooltipAnimation {
  
  @scala.inline
  def apply(): MapMarkerDefaultsTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMarkerDefaultsTooltipAnimation]
  }
  
  @scala.inline
  implicit class MapMarkerDefaultsTooltipAnimationMutableBuilder[Self <: MapMarkerDefaultsTooltipAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: MapMarkerDefaultsTooltipAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: MapMarkerDefaultsTooltipAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
