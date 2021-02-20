package typings.kendoUi.kendo.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SurfaceOptions extends StObject {
  
  var click: js.UndefOr[js.Function1[/* e */ SurfaceClickEvent, Unit]] = js.native
  
  var height: js.UndefOr[String] = js.native
  
  var mouseenter: js.UndefOr[js.Function1[/* e */ SurfaceMouseenterEvent, Unit]] = js.native
  
  var mouseleave: js.UndefOr[js.Function1[/* e */ SurfaceMouseleaveEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[SurfaceTooltip] = js.native
  
  var tooltipClose: js.UndefOr[js.Function1[/* e */ SurfaceTooltipCloseEvent, Unit]] = js.native
  
  var tooltipOpen: js.UndefOr[js.Function1[/* e */ SurfaceTooltipOpenEvent, Unit]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object SurfaceOptions {
  
  @scala.inline
  def apply(): SurfaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurfaceOptions]
  }
  
  @scala.inline
  implicit class SurfaceOptionsMutableBuilder[Self <: SurfaceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: /* e */ SurfaceClickEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMouseenter(value: /* e */ SurfaceMouseenterEvent => Unit): Self = StObject.set(x, "mouseenter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseenterUndefined: Self = StObject.set(x, "mouseenter", js.undefined)
    
    @scala.inline
    def setMouseleave(value: /* e */ SurfaceMouseleaveEvent => Unit): Self = StObject.set(x, "mouseleave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseleaveUndefined: Self = StObject.set(x, "mouseleave", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTooltip(value: SurfaceTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipClose(value: /* e */ SurfaceTooltipCloseEvent => Unit): Self = StObject.set(x, "tooltipClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltipCloseUndefined: Self = StObject.set(x, "tooltipClose", js.undefined)
    
    @scala.inline
    def setTooltipOpen(value: /* e */ SurfaceTooltipOpenEvent => Unit): Self = StObject.set(x, "tooltipOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltipOpenUndefined: Self = StObject.set(x, "tooltipOpen", js.undefined)
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
