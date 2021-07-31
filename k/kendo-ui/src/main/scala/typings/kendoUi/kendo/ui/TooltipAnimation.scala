package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipAnimation extends StObject {
  
  var close: js.UndefOr[TooltipAnimationClose] = js.undefined
  
  var open: js.UndefOr[TooltipAnimationOpen] = js.undefined
}
object TooltipAnimation {
  
  @scala.inline
  def apply(): TooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipAnimation]
  }
  
  @scala.inline
  implicit class TooltipAnimationMutableBuilder[Self <: TooltipAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: TooltipAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: TooltipAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
