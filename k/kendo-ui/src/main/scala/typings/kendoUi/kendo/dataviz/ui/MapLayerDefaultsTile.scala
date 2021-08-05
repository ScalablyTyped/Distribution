package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerDefaultsTile extends StObject {
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var subdomains: js.UndefOr[js.Any] = js.undefined
  
  var urlTemplate: js.UndefOr[String] = js.undefined
}
object MapLayerDefaultsTile {
  
  inline def apply(): MapLayerDefaultsTile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsTile]
  }
  
  extension [Self <: MapLayerDefaultsTile](x: Self) {
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setSubdomains(value: js.Any): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
    
    inline def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
    
    inline def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
    
    inline def setUrlTemplateUndefined: Self = StObject.set(x, "urlTemplate", js.undefined)
  }
}
