package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketParameters[Layer /* <: TypedStyleLayer */] extends StObject {
  
  var collisionBoxArray: CollisionBoxArray
  
  var index: Double
  
  var layers: js.Array[Layer]
  
  var overscaling: Double
  
  var pixelRatio: Double
  
  var sourceID: String
  
  var sourceLayerIndex: Double
  
  var zoom: Double
}
object BucketParameters {
  
  inline def apply[Layer /* <: TypedStyleLayer */](
    collisionBoxArray: CollisionBoxArray,
    index: Double,
    layers: js.Array[Layer],
    overscaling: Double,
    pixelRatio: Double,
    sourceID: String,
    sourceLayerIndex: Double,
    zoom: Double
  ): BucketParameters[Layer] = {
    val __obj = js.Dynamic.literal(collisionBoxArray = collisionBoxArray.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], overscaling = overscaling.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], sourceID = sourceID.asInstanceOf[js.Any], sourceLayerIndex = sourceLayerIndex.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketParameters[Layer]]
  }
  
  extension [Self <: BucketParameters[?], Layer /* <: TypedStyleLayer */](x: Self & BucketParameters[Layer]) {
    
    inline def setCollisionBoxArray(value: CollisionBoxArray): Self = StObject.set(x, "collisionBoxArray", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setOverscaling(value: Double): Self = StObject.set(x, "overscaling", value.asInstanceOf[js.Any])
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setSourceID(value: String): Self = StObject.set(x, "sourceID", value.asInstanceOf[js.Any])
    
    inline def setSourceLayerIndex(value: Double): Self = StObject.set(x, "sourceLayerIndex", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
