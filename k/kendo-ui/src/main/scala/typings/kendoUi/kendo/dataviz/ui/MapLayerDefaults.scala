package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerDefaults extends StObject {
  
  var bing: js.UndefOr[MapLayerDefaultsBing] = js.undefined
  
  var bubble: js.UndefOr[MapLayerDefaultsBubble] = js.undefined
  
  var marker: js.UndefOr[MapLayerDefaultsMarker] = js.undefined
  
  var shape: js.UndefOr[MapLayerDefaultsShape] = js.undefined
  
  var tile: js.UndefOr[MapLayerDefaultsTile] = js.undefined
  
  var tileSize: js.UndefOr[Double] = js.undefined
}
object MapLayerDefaults {
  
  inline def apply(): MapLayerDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaults]
  }
  
  extension [Self <: MapLayerDefaults](x: Self) {
    
    inline def setBing(value: MapLayerDefaultsBing): Self = StObject.set(x, "bing", value.asInstanceOf[js.Any])
    
    inline def setBingUndefined: Self = StObject.set(x, "bing", js.undefined)
    
    inline def setBubble(value: MapLayerDefaultsBubble): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
    
    inline def setBubbleUndefined: Self = StObject.set(x, "bubble", js.undefined)
    
    inline def setMarker(value: MapLayerDefaultsMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setShape(value: MapLayerDefaultsShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setTile(value: MapLayerDefaultsTile): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
  }
}
