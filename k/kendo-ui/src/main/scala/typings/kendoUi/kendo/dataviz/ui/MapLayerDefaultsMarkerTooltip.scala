package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerDefaultsMarkerTooltip extends StObject {
  
  var animation: js.UndefOr[MapLayerDefaultsMarkerTooltipAnimation] = js.native
  
  var autoHide: js.UndefOr[Boolean] = js.native
  
  var callout: js.UndefOr[Boolean] = js.native
  
  var content: js.UndefOr[String | js.Function | MapLayerDefaultsMarkerTooltipContent] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var iframe: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var showAfter: js.UndefOr[Double] = js.native
  
  var showOn: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object MapLayerDefaultsMarkerTooltip {
  
  @scala.inline
  def apply(): MapLayerDefaultsMarkerTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsMarkerTooltip]
  }
  
  @scala.inline
  implicit class MapLayerDefaultsMarkerTooltipMutableBuilder[Self <: MapLayerDefaultsMarkerTooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: MapLayerDefaultsMarkerTooltipAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    @scala.inline
    def setCallout(value: Boolean): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    @scala.inline
    def setContent(value: String | js.Function | MapLayerDefaultsMarkerTooltipContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIframe(value: Boolean): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowAfter(value: Double): Self = StObject.set(x, "showAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAfterUndefined: Self = StObject.set(x, "showAfter", js.undefined)
    
    @scala.inline
    def setShowOn(value: String): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnUndefined: Self = StObject.set(x, "showOn", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
