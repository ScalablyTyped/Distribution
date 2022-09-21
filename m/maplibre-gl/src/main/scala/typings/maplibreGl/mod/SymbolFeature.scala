package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.maplibreGlStrings.LineString
import typings.maplibreGl.maplibreGlStrings.Point
import typings.maplibreGl.maplibreGlStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolFeature extends StObject {
  
  var geometry: js.Array[js.Array[^]]
  
  var icon: ResolvedImage
  
  var id: js.UndefOr[Any] = js.undefined
  
  var index: Double
  
  var properties: Any
  
  var sortKey: Double | scala.Unit
  
  var sourceLayerIndex: Double
  
  var text: Formatted | scala.Unit
  
  var `type`: Point | LineString | Polygon
}
object SymbolFeature {
  
  inline def apply(
    geometry: js.Array[js.Array[^]],
    icon: ResolvedImage,
    index: Double,
    properties: Any,
    sortKey: Double | scala.Unit,
    sourceLayerIndex: Double,
    text: Formatted | scala.Unit,
    `type`: Point | LineString | Polygon
  ): SymbolFeature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], sortKey = sortKey.asInstanceOf[js.Any], sourceLayerIndex = sourceLayerIndex.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolFeature]
  }
  
  extension [Self <: SymbolFeature](x: Self) {
    
    inline def setGeometry(value: js.Array[js.Array[^]]): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryVarargs(value: js.Array[^]*): Self = StObject.set(x, "geometry", js.Array(value*))
    
    inline def setIcon(value: ResolvedImage): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSortKey(value: Double | scala.Unit): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
    
    inline def setSourceLayerIndex(value: Double): Self = StObject.set(x, "sourceLayerIndex", value.asInstanceOf[js.Any])
    
    inline def setText(value: Formatted | scala.Unit): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: Point | LineString | Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
