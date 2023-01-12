package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerTooltipAnimation extends StObject {
  
  var close: js.UndefOr[MapLayerTooltipAnimationClose] = js.undefined
  
  var open: js.UndefOr[MapLayerTooltipAnimationOpen] = js.undefined
}
object MapLayerTooltipAnimation {
  
  inline def apply(): MapLayerTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerTooltipAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapLayerTooltipAnimation] (val x: Self) extends AnyVal {
    
    inline def setClose(value: MapLayerTooltipAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: MapLayerTooltipAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
