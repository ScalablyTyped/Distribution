package typings.maplibreGl.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.glMatrix.mod.mat4
import typings.mapboxPointGeometry.mod.^
import typings.mapboxVectorTile.mod.VectorTileLayer
import typings.maplibreGl.anon.LineLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "SymbolBucket")
@js.native
open class SymbolBucket protected ()
  extends StObject
     with Bucket {
  def this(options: BucketParameters[SymbolStyleLayer]) = this()
  
  def _addCollisionDebugVertex(
    layoutVertexArray: StructArray,
    collisionVertexArray: StructArray,
    point: ^,
    anchorX: Double,
    anchorY: Double,
    extrude: ^
  ): Any = js.native
  
  def _deserializeCollisionBoxesForSymbol(
    collisionBoxArray: CollisionBoxArray,
    textStartIndex: Double,
    textEndIndex: Double,
    verticalTextStartIndex: Double,
    verticalTextEndIndex: Double,
    iconStartIndex: Double,
    iconEndIndex: Double,
    verticalIconStartIndex: Double,
    verticalIconEndIndex: Double
  ): CollisionArrays = js.native
  
  def addCollisionDebugVertices(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    arrays: CollisionBuffers,
    boxAnchorPoint: ^,
    symbolInstance: SymbolInstance
  ): scala.Unit = js.native
  
  def addDebugCollisionBoxes(startIndex: Double, endIndex: Double, symbolInstance: SymbolInstance, isText: Boolean): scala.Unit = js.native
  
  def addIndicesForPlacedSymbol(iconOrText: SymbolBuffers, placedSymbolIndex: Double): scala.Unit = js.native
  
  def addSymbols(
    arrays: SymbolBuffers,
    quads: js.Array[SymbolQuad],
    sizeVertex: Any,
    lineOffset: js.Tuple2[Double, Double],
    alongLine: Boolean,
    feature: SymbolFeature,
    writingMode: WritingMode,
    labelAnchor: Anchor,
    lineStartIndex: Double,
    lineLength: Double,
    associatedIconIndex: Double,
    canonical: CanonicalTileID
  ): scala.Unit = js.native
  
  def addToLineVertexArray(anchor: Anchor, line: Any): LineLength = js.native
  
  def addToSortKeyRanges(symbolInstanceIndex: Double, sortKey: Double): scala.Unit = js.native
  
  var allowVerticalPlacement: Boolean = js.native
  
  var bucketInstanceId: Double = js.native
  
  def calculateGlyphDependencies(
    text: String,
    stack: NumberDictionary[Boolean],
    textAlongLine: Boolean,
    allowVerticalPlacement: Boolean,
    doesAllowVerticalWritingMode: Boolean
  ): scala.Unit = js.native
  
  var canOverlap: Boolean = js.native
  
  var collisionArrays: js.Array[CollisionArrays] = js.native
  
  var collisionBoxArray: CollisionBoxArray = js.native
  
  var collisionCircleArray: js.Array[Double] = js.native
  
  var compareText: StringDictionary[js.Array[^]] = js.native
  
  def createArrays(): scala.Unit = js.native
  
  def deserializeCollisionBoxes(collisionBoxArray: CollisionBoxArray): scala.Unit = js.native
  
  /**
  	 * Release the WebGL resources associated with the buffers. Note that because
  	 * buckets are shared between layers having the same layout properties, they
  	 * must be destroyed in groups (all buckets for a tile, or all symbol buckets).
  	 *
  	 * @private
  	 */
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  
  def destroyDebugData(): scala.Unit = js.native
  
  var fadeStartTime: Double = js.native
  
  var featureSortOrder: js.Array[Double] = js.native
  
  var features: js.Array[SymbolFeature] = js.native
  
  def generateCollisionDebugBuffers(): scala.Unit = js.native
  
  def getSortedSymbolIndexes(angle: Double): js.Array[Any] = js.native
  
  var glyphOffsetArray: GlyphOffsetArray = js.native
  
  def hasDebugData(): CollisionBuffers = js.native
  
  def hasIconCollisionBoxData(): Boolean = js.native
  
  def hasIconData(): Boolean = js.native
  
  /* CompleteClass */
  var hasPattern: Boolean = js.native
  
  var hasRTLText: Boolean = js.native
  
  def hasTextCollisionBoxData(): Boolean = js.native
  
  def hasTextData(): Boolean = js.native
  
  var icon: SymbolBuffers = js.native
  
  var iconCollisionBox: CollisionBuffers = js.native
  
  var iconSizeData: SizeData = js.native
  
  var iconsInText: Boolean = js.native
  
  var iconsNeedLinear: Boolean = js.native
  
  var index: Double = js.native
  
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  
  var justReloaded: Boolean = js.native
  
  /* CompleteClass */
  var layerIds: js.Array[String] = js.native
  
  /* CompleteClass */
  override val layers: js.Array[Any] = js.native
  @JSName("layers")
  var layers_SymbolBucket: js.Array[SymbolStyleLayer] = js.native
  
  var lineVertexArray: SymbolLineVertexArray = js.native
  
  var overscaling: Double = js.native
  
  var pixelRatio: Double = js.native
  
  var placementInvProjMatrix: mat4 = js.native
  
  var placementViewportMatrix: mat4 = js.native
  
  /* CompleteClass */
  override def populate(features: js.Array[IndexedFeature], options: PopulateParameters, canonical: CanonicalTileID): scala.Unit = js.native
  
  var sdfIcons: Boolean = js.native
  
  def sortFeatures(angle: Double): scala.Unit = js.native
  
  var sortFeaturesByKey: Boolean = js.native
  
  var sortFeaturesByY: Boolean = js.native
  
  var sortKeyRanges: js.Array[SortKeyRange] = js.native
  
  var sortedAngle: Double = js.native
  
  var sourceID: String = js.native
  
  var sourceLayerIndex: Double = js.native
  
  /* CompleteClass */
  override val stateDependentLayerIds: js.Array[String] = js.native
  
  /* CompleteClass */
  override val stateDependentLayers: js.Array[Any] = js.native
  @JSName("stateDependentLayers")
  var stateDependentLayers_SymbolBucket: js.Array[SymbolStyleLayer] = js.native
  
  var symbolInstanceIndexes: js.Array[Double] = js.native
  
  var symbolInstances: SymbolInstanceArray = js.native
  
  var text: SymbolBuffers = js.native
  
  var textCollisionBox: CollisionBuffers = js.native
  
  var textSizeData: SizeData = js.native
  
  var tilePixelRatio: Double = js.native
  
  /* CompleteClass */
  override def update(states: FeatureStates, vtLayer: VectorTileLayer, imagePositions: StringDictionary[ImagePosition]): scala.Unit = js.native
  
  /* CompleteClass */
  override def upload(context: Context): scala.Unit = js.native
  
  /* CompleteClass */
  override def uploadPending(): Boolean = js.native
  
  var uploaded: Boolean = js.native
  
  var writingModes: js.Array[WritingMode] = js.native
  
  var zoom: Double = js.native
}
/* static members */
object SymbolBucket {
  
  @JSImport("maplibre-gl", "SymbolBucket")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl", "SymbolBucket.MAX_GLYPHS")
  @js.native
  def MAX_GLYPHS: Double = js.native
  inline def MAX_GLYPHS_=(x: Double): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_GLYPHS")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "SymbolBucket.addDynamicAttributes")
  @js.native
  def addDynamicAttributes: js.Function3[
    /* dynamicLayoutVertexArray */ StructArray, 
    /* p */ typings.mapboxPointGeometry.mod.^, 
    /* angle */ Double, 
    scala.Unit
  ] = js.native
  inline def addDynamicAttributes(dynamicLayoutVertexArray: StructArray, p: typings.mapboxPointGeometry.mod.^, angle: Double): scala.Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addDynamicAttributes")(dynamicLayoutVertexArray.asInstanceOf[js.Any], p.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  inline def addDynamicAttributes_=(
    x: js.Function3[
      /* dynamicLayoutVertexArray */ StructArray, 
      /* p */ typings.mapboxPointGeometry.mod.^, 
      /* angle */ Double, 
      scala.Unit
    ]
  ): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addDynamicAttributes")(x.asInstanceOf[js.Any])
}
