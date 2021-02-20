package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerBase extends StObject {
  
  var filter: js.UndefOr[js.Array[_]] = js.native
  
  var id: String = js.native
  
  var interactive: js.UndefOr[Boolean] = js.native
  
  var maxzoom: js.UndefOr[Double] = js.native
  
  var metadata: js.UndefOr[js.Any] = js.native
  
  var minzoom: js.UndefOr[Double] = js.native
  
  var ref: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[String | AnySourceData] = js.native
  
  var `source-layer`: js.UndefOr[String] = js.native
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
    def setFilter(value: js.Array[_]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
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
