package typings.maplibreGl.mod

import typings.mapboxVectorTile.mod.VectorTileFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedFeature extends StObject {
  
  var feature: VectorTileFeature
  
  var id: Double | String
  
  var index: Double
  
  var sourceLayerIndex: Double
}
object IndexedFeature {
  
  inline def apply(feature: VectorTileFeature, id: Double | String, index: Double, sourceLayerIndex: Double): IndexedFeature = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], sourceLayerIndex = sourceLayerIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexedFeature] (val x: Self) extends AnyVal {
    
    inline def setFeature(value: VectorTileFeature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setSourceLayerIndex(value: Double): Self = StObject.set(x, "sourceLayerIndex", value.asInstanceOf[js.Any])
  }
}
