package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapMarkerTooltipAnimation extends StObject {
  
  var close: js.UndefOr[MapMarkerTooltipAnimationClose] = js.undefined
  
  var open: js.UndefOr[MapMarkerTooltipAnimationOpen] = js.undefined
}
object MapMarkerTooltipAnimation {
  
  inline def apply(): MapMarkerTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMarkerTooltipAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapMarkerTooltipAnimation] (val x: Self) extends AnyVal {
    
    inline def setClose(value: MapMarkerTooltipAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: MapMarkerTooltipAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
