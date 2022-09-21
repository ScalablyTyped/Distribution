package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxVectorTile.mod.VectorTileLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bucket extends StObject {
  
  /**
  	 * Release the WebGL resources associated with the buffers. Note that because
  	 * buckets are shared between layers having the same layout properties, they
  	 * must be destroyed in groups (all buckets for a tile, or all symbol buckets).
  	 *
  	 * @private
  	 */
  def destroy(): scala.Unit
  
  var hasPattern: Boolean
  
  def isEmpty(): Boolean
  
  var layerIds: js.Array[String]
  
  val layers: js.Array[Any]
  
  def populate(features: js.Array[IndexedFeature], options: PopulateParameters, canonical: CanonicalTileID): scala.Unit
  
  val stateDependentLayerIds: js.Array[String]
  
  val stateDependentLayers: js.Array[Any]
  
  def update(states: FeatureStates, vtLayer: VectorTileLayer, imagePositions: StringDictionary[ImagePosition]): scala.Unit
  
  def upload(context: Context): scala.Unit
  
  def uploadPending(): Boolean
}
object Bucket {
  
  inline def apply(
    destroy: () => scala.Unit,
    hasPattern: Boolean,
    isEmpty: () => Boolean,
    layerIds: js.Array[String],
    layers: js.Array[Any],
    populate: (js.Array[IndexedFeature], PopulateParameters, CanonicalTileID) => scala.Unit,
    stateDependentLayerIds: js.Array[String],
    stateDependentLayers: js.Array[Any],
    update: (FeatureStates, VectorTileLayer, StringDictionary[ImagePosition]) => scala.Unit,
    upload: Context => scala.Unit,
    uploadPending: () => Boolean
  ): Bucket = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hasPattern = hasPattern.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), layerIds = layerIds.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], populate = js.Any.fromFunction3(populate), stateDependentLayerIds = stateDependentLayerIds.asInstanceOf[js.Any], stateDependentLayers = stateDependentLayers.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), upload = js.Any.fromFunction1(upload), uploadPending = js.Any.fromFunction0(uploadPending))
    __obj.asInstanceOf[Bucket]
  }
  
  extension [Self <: Bucket](x: Self) {
    
    inline def setDestroy(value: () => scala.Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setHasPattern(value: Boolean): Self = StObject.set(x, "hasPattern", value.asInstanceOf[js.Any])
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setLayerIds(value: js.Array[String]): Self = StObject.set(x, "layerIds", value.asInstanceOf[js.Any])
    
    inline def setLayerIdsVarargs(value: String*): Self = StObject.set(x, "layerIds", js.Array(value*))
    
    inline def setLayers(value: js.Array[Any]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersVarargs(value: Any*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setPopulate(value: (js.Array[IndexedFeature], PopulateParameters, CanonicalTileID) => scala.Unit): Self = StObject.set(x, "populate", js.Any.fromFunction3(value))
    
    inline def setStateDependentLayerIds(value: js.Array[String]): Self = StObject.set(x, "stateDependentLayerIds", value.asInstanceOf[js.Any])
    
    inline def setStateDependentLayerIdsVarargs(value: String*): Self = StObject.set(x, "stateDependentLayerIds", js.Array(value*))
    
    inline def setStateDependentLayers(value: js.Array[Any]): Self = StObject.set(x, "stateDependentLayers", value.asInstanceOf[js.Any])
    
    inline def setStateDependentLayersVarargs(value: Any*): Self = StObject.set(x, "stateDependentLayers", js.Array(value*))
    
    inline def setUpdate(value: (FeatureStates, VectorTileLayer, StringDictionary[ImagePosition]) => scala.Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    
    inline def setUpload(value: Context => scala.Unit): Self = StObject.set(x, "upload", js.Any.fromFunction1(value))
    
    inline def setUploadPending(value: () => Boolean): Self = StObject.set(x, "uploadPending", js.Any.fromFunction0(value))
  }
}
