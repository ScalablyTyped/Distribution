package typings.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceOptions extends StObject {
  
  var click: js.UndefOr[js.Function1[/* e */ SurfaceClickEvent, Unit]] = js.undefined
  
  var height: js.UndefOr[String] = js.undefined
  
  var mouseenter: js.UndefOr[js.Function1[/* e */ SurfaceMouseenterEvent, Unit]] = js.undefined
  
  var mouseleave: js.UndefOr[js.Function1[/* e */ SurfaceMouseleaveEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[SurfaceTooltip] = js.undefined
  
  var tooltipClose: js.UndefOr[js.Function1[/* e */ SurfaceTooltipCloseEvent, Unit]] = js.undefined
  
  var tooltipOpen: js.UndefOr[js.Function1[/* e */ SurfaceTooltipOpenEvent, Unit]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object SurfaceOptions {
  
  inline def apply(): SurfaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurfaceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SurfaceOptions] (val x: Self) extends AnyVal {
    
    inline def setClick(value: /* e */ SurfaceClickEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMouseenter(value: /* e */ SurfaceMouseenterEvent => Unit): Self = StObject.set(x, "mouseenter", js.Any.fromFunction1(value))
    
    inline def setMouseenterUndefined: Self = StObject.set(x, "mouseenter", js.undefined)
    
    inline def setMouseleave(value: /* e */ SurfaceMouseleaveEvent => Unit): Self = StObject.set(x, "mouseleave", js.Any.fromFunction1(value))
    
    inline def setMouseleaveUndefined: Self = StObject.set(x, "mouseleave", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTooltip(value: SurfaceTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipClose(value: /* e */ SurfaceTooltipCloseEvent => Unit): Self = StObject.set(x, "tooltipClose", js.Any.fromFunction1(value))
    
    inline def setTooltipCloseUndefined: Self = StObject.set(x, "tooltipClose", js.undefined)
    
    inline def setTooltipOpen(value: /* e */ SurfaceTooltipOpenEvent => Unit): Self = StObject.set(x, "tooltipOpen", js.Any.fromFunction1(value))
    
    inline def setTooltipOpenUndefined: Self = StObject.set(x, "tooltipOpen", js.undefined)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
