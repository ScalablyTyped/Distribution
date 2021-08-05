package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerDefaultsMarkerTooltipAnimation extends StObject {
  
  var close: js.UndefOr[MapLayerDefaultsMarkerTooltipAnimationClose] = js.undefined
  
  var open: js.UndefOr[MapLayerDefaultsMarkerTooltipAnimationOpen] = js.undefined
}
object MapLayerDefaultsMarkerTooltipAnimation {
  
  inline def apply(): MapLayerDefaultsMarkerTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsMarkerTooltipAnimation]
  }
  
  extension [Self <: MapLayerDefaultsMarkerTooltipAnimation](x: Self) {
    
    inline def setClose(value: MapLayerDefaultsMarkerTooltipAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: MapLayerDefaultsMarkerTooltipAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
