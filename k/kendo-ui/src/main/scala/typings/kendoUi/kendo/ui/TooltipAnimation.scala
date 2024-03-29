package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipAnimation extends StObject {
  
  var close: js.UndefOr[TooltipAnimationClose] = js.undefined
  
  var open: js.UndefOr[TooltipAnimationOpen] = js.undefined
}
object TooltipAnimation {
  
  inline def apply(): TooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipAnimation] (val x: Self) extends AnyVal {
    
    inline def setClose(value: TooltipAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: TooltipAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
