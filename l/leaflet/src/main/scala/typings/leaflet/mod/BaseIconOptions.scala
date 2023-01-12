package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseIconOptions
  extends StObject
     with LayerOptions {
  
  var className: js.UndefOr[String] = js.undefined
  
  var iconAnchor: js.UndefOr[PointExpression] = js.undefined
  
  var iconRetinaUrl: js.UndefOr[String] = js.undefined
  
  var iconSize: js.UndefOr[PointExpression] = js.undefined
  
  var iconUrl: js.UndefOr[String] = js.undefined
  
  var popupAnchor: js.UndefOr[PointExpression] = js.undefined
  
  var shadowAnchor: js.UndefOr[PointExpression] = js.undefined
  
  var shadowRetinaUrl: js.UndefOr[String] = js.undefined
  
  var shadowSize: js.UndefOr[PointExpression] = js.undefined
  
  var shadowUrl: js.UndefOr[String] = js.undefined
  
  var tooltipAnchor: js.UndefOr[PointExpression] = js.undefined
}
object BaseIconOptions {
  
  inline def apply(): BaseIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseIconOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseIconOptions] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setIconAnchor(value: PointExpression): Self = StObject.set(x, "iconAnchor", value.asInstanceOf[js.Any])
    
    inline def setIconAnchorUndefined: Self = StObject.set(x, "iconAnchor", js.undefined)
    
    inline def setIconRetinaUrl(value: String): Self = StObject.set(x, "iconRetinaUrl", value.asInstanceOf[js.Any])
    
    inline def setIconRetinaUrlUndefined: Self = StObject.set(x, "iconRetinaUrl", js.undefined)
    
    inline def setIconSize(value: PointExpression): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setPopupAnchor(value: PointExpression): Self = StObject.set(x, "popupAnchor", value.asInstanceOf[js.Any])
    
    inline def setPopupAnchorUndefined: Self = StObject.set(x, "popupAnchor", js.undefined)
    
    inline def setShadowAnchor(value: PointExpression): Self = StObject.set(x, "shadowAnchor", value.asInstanceOf[js.Any])
    
    inline def setShadowAnchorUndefined: Self = StObject.set(x, "shadowAnchor", js.undefined)
    
    inline def setShadowRetinaUrl(value: String): Self = StObject.set(x, "shadowRetinaUrl", value.asInstanceOf[js.Any])
    
    inline def setShadowRetinaUrlUndefined: Self = StObject.set(x, "shadowRetinaUrl", js.undefined)
    
    inline def setShadowSize(value: PointExpression): Self = StObject.set(x, "shadowSize", value.asInstanceOf[js.Any])
    
    inline def setShadowSizeUndefined: Self = StObject.set(x, "shadowSize", js.undefined)
    
    inline def setShadowUrl(value: String): Self = StObject.set(x, "shadowUrl", value.asInstanceOf[js.Any])
    
    inline def setShadowUrlUndefined: Self = StObject.set(x, "shadowUrl", js.undefined)
    
    inline def setTooltipAnchor(value: PointExpression): Self = StObject.set(x, "tooltipAnchor", value.asInstanceOf[js.Any])
    
    inline def setTooltipAnchorUndefined: Self = StObject.set(x, "tooltipAnchor", js.undefined)
  }
}
