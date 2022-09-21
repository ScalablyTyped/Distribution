package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxPointGeometry.mod.^
import typings.mapboxVectorTile.mod.VectorTileLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "CircleBucket")
@js.native
open class CircleBucket[Layer /* <: CircleStyleLayer | HeatmapStyleLayer */] protected ()
  extends StObject
     with Bucket {
  def this(options: BucketParameters[Layer]) = this()
  
  def addFeature(feature: BucketFeature, geometry: js.Array[js.Array[^]], index: Double, canonical: CanonicalTileID): scala.Unit = js.native
  
  /**
  	 * Release the WebGL resources associated with the buffers. Note that because
  	 * buckets are shared between layers having the same layout properties, they
  	 * must be destroyed in groups (all buckets for a tile, or all symbol buckets).
  	 *
  	 * @private
  	 */
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  
  /* CompleteClass */
  var hasPattern: Boolean = js.native
  
  var index: Double = js.native
  
  var indexArray: TriangleIndexArray = js.native
  
  var indexBuffer: IndexBuffer = js.native
  
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  
  /* CompleteClass */
  var layerIds: js.Array[String] = js.native
  
  /* CompleteClass */
  override val layers: js.Array[Any] = js.native
  @JSName("layers")
  var layers_CircleBucket: js.Array[Layer] = js.native
  
  var layoutVertexArray: CircleLayoutArray = js.native
  
  var layoutVertexBuffer: VertexBuffer = js.native
  
  var overscaling: Double = js.native
  
  /* CompleteClass */
  override def populate(features: js.Array[IndexedFeature], options: PopulateParameters, canonical: CanonicalTileID): scala.Unit = js.native
  
  var programConfigurations: ProgramConfigurationSet[Layer] = js.native
  
  var segments: SegmentVector = js.native
  
  /* CompleteClass */
  override val stateDependentLayerIds: js.Array[String] = js.native
  
  /* CompleteClass */
  override val stateDependentLayers: js.Array[Any] = js.native
  @JSName("stateDependentLayers")
  var stateDependentLayers_CircleBucket: js.Array[Layer] = js.native
  
  /* CompleteClass */
  override def update(states: FeatureStates, vtLayer: VectorTileLayer, imagePositions: StringDictionary[ImagePosition]): scala.Unit = js.native
  
  /* CompleteClass */
  override def upload(context: Context): scala.Unit = js.native
  
  /* CompleteClass */
  override def uploadPending(): Boolean = js.native
  
  var uploaded: Boolean = js.native
  
  var zoom: Double = js.native
}
