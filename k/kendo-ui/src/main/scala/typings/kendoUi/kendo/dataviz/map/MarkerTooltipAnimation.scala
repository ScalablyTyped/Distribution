package typings.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerTooltipAnimation extends StObject {
  
  var close: js.UndefOr[MarkerTooltipAnimationClose] = js.undefined
  
  var open: js.UndefOr[MarkerTooltipAnimationOpen] = js.undefined
}
object MarkerTooltipAnimation {
  
  inline def apply(): MarkerTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerTooltipAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerTooltipAnimation] (val x: Self) extends AnyVal {
    
    inline def setClose(value: MarkerTooltipAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: MarkerTooltipAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
