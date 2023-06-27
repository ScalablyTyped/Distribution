package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.anon.Circleblur
import typings.maplibreMaplibreGlStyleSpec.anon.Circlesortkey
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleLayerSpecification
  extends StObject
     with LayerSpecification {
  
  var filter: js.UndefOr[FilterSpecification] = js.undefined
  
  var id: String
  
  var layout: js.UndefOr[Circlesortkey] = js.undefined
  
  var maxzoom: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  var minzoom: js.UndefOr[Double] = js.undefined
  
  var paint: js.UndefOr[Circleblur] = js.undefined
  
  var source: String
  
  var `source-layer`: js.UndefOr[String] = js.undefined
  
  var `type`: circle
}
object CircleLayerSpecification {
  
  inline def apply(id: String, source: String): CircleLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[CircleLayerSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CircleLayerSpecification] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: FilterSpecification): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: Circlesortkey): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    inline def setPaint(value: Circleblur): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def `setSource-layer`(value: String): Self = StObject.set(x, "source-layer", value.asInstanceOf[js.Any])
    
    inline def `setSource-layerUndefined`: Self = StObject.set(x, "source-layer", js.undefined)
    
    inline def setType(value: circle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
