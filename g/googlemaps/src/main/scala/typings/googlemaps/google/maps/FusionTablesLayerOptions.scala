package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
trait FusionTablesLayerOptions extends StObject {
  
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  var heatmap: js.UndefOr[FusionTablesHeatmap] = js.undefined
  
  var map: js.UndefOr[Map[Element]] = js.undefined
  
  var query: js.UndefOr[FusionTablesQuery] = js.undefined
  
  var styles: js.UndefOr[js.Array[FusionTablesStyle]] = js.undefined
  
  var suppressInfoWindows: js.UndefOr[Boolean] = js.undefined
}
object FusionTablesLayerOptions {
  
  inline def apply(): FusionTablesLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusionTablesLayerOptions]
  }
  
  extension [Self <: FusionTablesLayerOptions](x: Self) {
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setHeatmap(value: FusionTablesHeatmap): Self = StObject.set(x, "heatmap", value.asInstanceOf[js.Any])
    
    inline def setHeatmapUndefined: Self = StObject.set(x, "heatmap", js.undefined)
    
    inline def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setQuery(value: FusionTablesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setStyles(value: js.Array[FusionTablesStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: FusionTablesStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    inline def setSuppressInfoWindows(value: Boolean): Self = StObject.set(x, "suppressInfoWindows", value.asInstanceOf[js.Any])
    
    inline def setSuppressInfoWindowsUndefined: Self = StObject.set(x, "suppressInfoWindows", js.undefined)
  }
}
