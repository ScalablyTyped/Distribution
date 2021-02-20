package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseIconOptions extends LayerOptions {
  
  var className: js.UndefOr[String] = js.native
  
  var iconAnchor: js.UndefOr[PointExpression] = js.native
  
  var iconRetinaUrl: js.UndefOr[String] = js.native
  
  var iconSize: js.UndefOr[PointExpression] = js.native
  
  var iconUrl: js.UndefOr[String] = js.native
  
  var popupAnchor: js.UndefOr[PointExpression] = js.native
  
  var shadowAnchor: js.UndefOr[PointExpression] = js.native
  
  var shadowRetinaUrl: js.UndefOr[String] = js.native
  
  var shadowSize: js.UndefOr[PointExpression] = js.native
  
  var shadowUrl: js.UndefOr[String] = js.native
  
  var tooltipAnchor: js.UndefOr[PointExpression] = js.native
}
object BaseIconOptions {
  
  @scala.inline
  def apply(): BaseIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseIconOptions]
  }
  
  @scala.inline
  implicit class BaseIconOptionsMutableBuilder[Self <: BaseIconOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setIconAnchor(value: PointExpression): Self = StObject.set(x, "iconAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconAnchorUndefined: Self = StObject.set(x, "iconAnchor", js.undefined)
    
    @scala.inline
    def setIconRetinaUrl(value: String): Self = StObject.set(x, "iconRetinaUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconRetinaUrlUndefined: Self = StObject.set(x, "iconRetinaUrl", js.undefined)
    
    @scala.inline
    def setIconSize(value: PointExpression): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setPopupAnchor(value: PointExpression): Self = StObject.set(x, "popupAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupAnchorUndefined: Self = StObject.set(x, "popupAnchor", js.undefined)
    
    @scala.inline
    def setShadowAnchor(value: PointExpression): Self = StObject.set(x, "shadowAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowAnchorUndefined: Self = StObject.set(x, "shadowAnchor", js.undefined)
    
    @scala.inline
    def setShadowRetinaUrl(value: String): Self = StObject.set(x, "shadowRetinaUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowRetinaUrlUndefined: Self = StObject.set(x, "shadowRetinaUrl", js.undefined)
    
    @scala.inline
    def setShadowSize(value: PointExpression): Self = StObject.set(x, "shadowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowSizeUndefined: Self = StObject.set(x, "shadowSize", js.undefined)
    
    @scala.inline
    def setShadowUrl(value: String): Self = StObject.set(x, "shadowUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUrlUndefined: Self = StObject.set(x, "shadowUrl", js.undefined)
    
    @scala.inline
    def setTooltipAnchor(value: PointExpression): Self = StObject.set(x, "tooltipAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipAnchorUndefined: Self = StObject.set(x, "tooltipAnchor", js.undefined)
  }
}
