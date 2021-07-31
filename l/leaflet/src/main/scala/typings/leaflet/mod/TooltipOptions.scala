package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipOptions
  extends StObject
     with DivOverlayOptions {
  
  var direction: js.UndefOr[Direction] = js.undefined
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var permanent: js.UndefOr[Boolean] = js.undefined
  
  var sticky: js.UndefOr[Boolean] = js.undefined
}
object TooltipOptions {
  
  @scala.inline
  def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  
  @scala.inline
  implicit class TooltipOptionsMutableBuilder[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPermanent(value: Boolean): Self = StObject.set(x, "permanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermanentUndefined: Self = StObject.set(x, "permanent", js.undefined)
    
    @scala.inline
    def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
  }
}
