package typings.mapboxMapboxGlDraw.anon

import typings.mapboxGl.mod.AnySourceData
import typings.mapboxGl.mod.CircleLayout
import typings.mapboxGl.mod.CirclePaint
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mapbox-gl.mapbox-gl.CircleLayer & {  id :@mapbox/mapbox-gl-draw.@mapbox/mapbox-gl-draw.ThemeLayerId} */
trait CircleLayeridThemeLayerId extends StObject {
  
  var filter: js.UndefOr[js.Array[Any]] = js.undefined
  
  var id: String
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var layout: js.UndefOr[CircleLayout] = js.undefined
  
  var maxzoom: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  var minzoom: js.UndefOr[Double] = js.undefined
  
  var paint: js.UndefOr[CirclePaint] = js.undefined
  
  var ref: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String | AnySourceData] = js.undefined
  
  var `source-layer`: js.UndefOr[String] = js.undefined
  
  var `type`: circle
}
object CircleLayeridThemeLayerId {
  
  inline def apply(id: String): CircleLayeridThemeLayerId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[CircleLayeridThemeLayerId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CircleLayeridThemeLayerId] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: js.Array[Any]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: Any*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setLayout(value: CircleLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    inline def setPaint(value: CirclePaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setSource(value: String | AnySourceData): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def `setSource-layer`(value: String): Self = StObject.set(x, "source-layer", value.asInstanceOf[js.Any])
    
    inline def `setSource-layerUndefined`: Self = StObject.set(x, "source-layer", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: circle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
