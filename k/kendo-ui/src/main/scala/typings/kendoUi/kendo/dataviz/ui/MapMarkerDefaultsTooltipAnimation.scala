package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapMarkerDefaultsTooltipAnimation extends StObject {
  
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
