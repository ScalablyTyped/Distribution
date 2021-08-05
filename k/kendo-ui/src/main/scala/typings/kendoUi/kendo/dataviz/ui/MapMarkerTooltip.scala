package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapMarkerTooltip extends StObject {
  
  var animation: js.UndefOr[MapMarkerTooltipAnimation] = js.undefined
  
  var autoHide: js.UndefOr[Boolean] = js.undefined
  
  var callout: js.UndefOr[Boolean] = js.undefined
  
  var content: js.UndefOr[String | js.Function | MapMarkerTooltipContent] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var iframe: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var showAfter: js.UndefOr[Double] = js.undefined
  
  var showOn: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object MapMarkerTooltip {
  
  inline def apply(): MapMarkerTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMarkerTooltip]
  }
  
  extension [Self <: MapMarkerTooltip](x: Self) {
    
    inline def setAnimation(value: MapMarkerTooltipAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    inline def setCallout(value: Boolean): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    inline def setContent(value: String | js.Function | MapMarkerTooltipContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIframe(value: Boolean): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
    
    inline def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowAfter(value: Double): Self = StObject.set(x, "showAfter", value.asInstanceOf[js.Any])
    
    inline def setShowAfterUndefined: Self = StObject.set(x, "showAfter", js.undefined)
    
    inline def setShowOn(value: String): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    inline def setShowOnUndefined: Self = StObject.set(x, "showOn", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
