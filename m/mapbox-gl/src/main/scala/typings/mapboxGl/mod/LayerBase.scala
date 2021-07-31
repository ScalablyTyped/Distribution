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
  
  @scala.inline
  def apply(id: String): LayerBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerBase]
  }
  
  @scala.inline
  implicit class LayerBaseMutableBuilder[Self <: LayerBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: js.Array[js.Any]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    @scala.inline
    def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setSource(value: String | AnySourceData): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-layer`(value: String): Self = StObject.set(x, "source-layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-layerUndefined`: Self = StObject.set(x, "source-layer", js.undefined)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
