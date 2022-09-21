package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxPointGeometry.mod.^
import typings.mapboxVectorTile.mod.VectorTileLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "LineBucket")
@js.native
open class LineBucket protected ()
  extends StObject
     with Bucket {
  def this(options: BucketParameters[LineStyleLayer]) = this()
  
  /**
  	 * Add two vertices to the buffers.
  	 *
  	 * @param p the line vertex to add buffer vertices for
  	 * @param normal vertex normal
  	 * @param endLeft extrude to shift the left vertex along the line
  	 * @param endRight extrude to shift the left vertex along the line
  	 * @param segment the segment object to add the vertex to
  	 * @param round whether this is a round cap
  	 * @private
  	 */
  def addCurrentVertex(p: ^, normal: ^, endLeft: Double, endRight: Double, segment: Segment): scala.Unit = js.native
  def addCurrentVertex(p: ^, normal: ^, endLeft: Double, endRight: Double, segment: Segment, round: Boolean): scala.Unit = js.native
  
  def addFeature(
    feature: BucketFeature,
    geometry: js.Array[js.Array[^]],
    index: Double,
    canonical: CanonicalTileID,
    imagePositions: StringDictionary[ImagePosition]
  ): scala.Unit = js.native
  
  def addFeatures(
    options: PopulateParameters,
    canonical: CanonicalTileID,
    imagePositions: StringDictionary[ImagePosition]
  ): scala.Unit = js.native
  
  def addHalfVertex(
    hasXY: ^,
    extrudeX: Double,
    extrudeY: Double,
    round: Boolean,
    up: Boolean,
    dir: Double,
    segment: Segment
  ): scala.Unit = js.native
  
  def addLine(
    vertices: js.Array[^],
    feature: BucketFeature,
    join: String,
    cap: String,
    miterLimit: Double,
    roundLimit: Double
  ): scala.Unit = js.native
  
  /**
  	 * Release the WebGL resources associated with the buffers. Note that because
  	 * buckets are shared between layers having the same layout properties, they
  	 * must be destroyed in groups (all buckets for a tile, or all symbol buckets).
  	 *
  	 * @private
  	 */
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  
  var distance: Double = js.native
  
  var e1: Double = js.native
  
  var e2: Double = js.native
  
  var gradients: StringDictionary[GradientTexture] = js.native
  
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
  var layers_LineBucket: js.Array[LineStyleLayer] = js.native
  
  var layoutVertexArray: LineLayoutArray = js.native
  
  var layoutVertexArray2: LineExtLayoutArray = js.native
  
  var layoutVertexBuffer: VertexBuffer = js.native
  
  var layoutVertexBuffer2: VertexBuffer = js.native
  
  var lineClips: js.UndefOr[LineClips] = js.native
  
  var lineClipsArray: js.Array[LineClips] = js.native
  
  def lineFeatureClips(feature: BucketFeature): js.UndefOr[LineClips] = js.native
  
  var maxLineLength: Double = js.native
  
  var overscaling: Double = js.native
  
  var patternFeatures: js.Array[BucketFeature] = js.native
  
  /* CompleteClass */
  override def populate(features: js.Array[IndexedFeature], options: PopulateParameters, canonical: CanonicalTileID): scala.Unit = js.native
  
  var programConfigurations: ProgramConfigurationSet[LineStyleLayer] = js.native
  
  var scaledDistance: Double = js.native
  
  var segments: SegmentVector = js.native
  
  /* CompleteClass */
  override val stateDependentLayerIds: js.Array[String] = js.native
  
  /* CompleteClass */
  override val stateDependentLayers: js.Array[Any] = js.native
  
  var totalDistance: Double = js.native
  
  /* CompleteClass */
  override def update(states: FeatureStates, vtLayer: VectorTileLayer, imagePositions: StringDictionary[ImagePosition]): scala.Unit = js.native
  
  def updateDistance(prev: ^, next: ^): scala.Unit = js.native
  
  def updateScaledDistance(): scala.Unit = js.native
  
  /* CompleteClass */
  override def upload(context: Context): scala.Unit = js.native
  
  /* CompleteClass */
  override def uploadPending(): Boolean = js.native
  
  var uploaded: Boolean = js.native
  
  var zoom: Double = js.native
}
