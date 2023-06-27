package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.anon.Iconallowoverlap
import typings.maplibreMaplibreGlStyleSpec.anon.Iconcolor
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolLayerSpecification
  extends StObject
     with LayerSpecification {
  
  var filter: js.UndefOr[FilterSpecification] = js.undefined
  
  var id: String
  
  var layout: js.UndefOr[Iconallowoverlap] = js.undefined
  
  var maxzoom: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  var minzoom: js.UndefOr[Double] = js.undefined
  
  var paint: js.UndefOr[Iconcolor] = js.undefined
  
  var source: String
  
  var `source-layer`: js.UndefOr[String] = js.undefined
  
  var `type`: symbol
}
object SymbolLayerSpecification {
  
  inline def apply(id: String, source: String): SymbolLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symbol")
    __obj.asInstanceOf[SymbolLayerSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SymbolLayerSpecification] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: FilterSpecification): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: Iconallowoverlap): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    inline def setPaint(value: Iconcolor): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def `setSource-layer`(value: String): Self = StObject.set(x, "source-layer", value.asInstanceOf[js.Any])
    
    inline def `setSource-layerUndefined`: Self = StObject.set(x, "source-layer", js.undefined)
    
    inline def setType(value: symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
