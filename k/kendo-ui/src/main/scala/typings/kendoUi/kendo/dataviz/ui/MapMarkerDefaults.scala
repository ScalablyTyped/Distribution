package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapMarkerDefaults extends StObject {
  
  var shape: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[MapMarkerDefaultsTooltip] = js.undefined
}
object MapMarkerDefaults {
  
  inline def apply(): MapMarkerDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMarkerDefaults]
  }
  
  extension [Self <: MapMarkerDefaults](x: Self) {
    
    inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setTooltip(value: MapMarkerDefaultsTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
