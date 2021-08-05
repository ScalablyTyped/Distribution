package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerDefaultsShape extends StObject {
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[MapLayerDefaultsShapeStyle] = js.undefined
}
object MapLayerDefaultsShape {
  
  inline def apply(): MapLayerDefaultsShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsShape]
  }
  
  extension [Self <: MapLayerDefaultsShape](x: Self) {
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setStyle(value: MapLayerDefaultsShapeStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
