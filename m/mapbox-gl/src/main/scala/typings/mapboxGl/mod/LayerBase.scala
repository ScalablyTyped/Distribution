package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerBase extends StObject {
  
  var filter: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var id: String
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var maxzoom: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[js.Any] = js.undefined
  
  var minzoom: js.UndefOr[Double] = js.undefined
  
  var ref: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String | AnySourceData] = js.undefined
  
  var `source-layer`: js.UndefOr[String] = js.undefined
}
object LayerBase {
  
  inline def apply(id: String): LayerBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerBase]
  }
  
  extension [Self <: LayerBase](x: Self) {
    
    inline def setFilter(value: js.Array[js.Any]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setSource(value: String | AnySourceData): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def `setSource-layer`(value: String): Self = StObject.set(x, "source-layer", value.asInstanceOf[js.Any])
    
    inline def `setSource-layerUndefined`: Self = StObject.set(x, "source-layer", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
