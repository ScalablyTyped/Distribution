package typings.kendoUi.kendo.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceTooltipAnimation extends StObject {
  
  var close: js.UndefOr[SurfaceTooltipAnimationClose] = js.undefined
  
  var open: js.UndefOr[SurfaceTooltipAnimationOpen] = js.undefined
}
object SurfaceTooltipAnimation {
  
  @scala.inline
  def apply(): SurfaceTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurfaceTooltipAnimation]
  }
  
  @scala.inline
  implicit class SurfaceTooltipAnimationMutableBuilder[Self <: SurfaceTooltipAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: SurfaceTooltipAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: SurfaceTooltipAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
