package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.glMatrix.mod.mat4
import typings.mapboxPointGeometry.mod.^
import typings.mapboxVectorTile.mod.VectorTileLayer
import typings.maplibreGl.anon.AvailableImages
import typings.maplibreGl.anon.Filter
import typings.std.PerformanceResourceTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Tile")
@js.native
open class Tile protected () extends StObject {
  /**
  	 * @param {OverscaledTileID} tileID
  	 * @param size
  	 * @private
  	 */
  def this(tileID: OverscaledTileID, size: Double) = this()
  
  var aborted: Boolean = js.native
  
  var actor: Actor = js.native
  
  var buckets: StringDictionary[Bucket] = js.native
  
  def clearFadeHold(): scala.Unit = js.native
  
  def clearTextures(painter: Any): scala.Unit = js.native
  
  var collisionBoxArray: CollisionBoxArray = js.native
  
  var dem: DEMData = js.native
  
  var demMatrix: mat4 = js.native
  
  var demTexture: Texture = js.native
  
  var dependencies: Any = js.native
  
  var expirationTime: Any = js.native
  
  var expiredRequestCount: Double = js.native
  
  var fadeEndTime: Any = js.native
  
  var fbo: Framebuffer = js.native
  
  def getBucket(layer: StyleLayer): Bucket = js.native
  
  def getExpiryTimeout(): Double = js.native
  
  var glyphAtlasImage: AlphaImage = js.native
  
  var glyphAtlasTexture: Texture = js.native
  
  def hasData(): Boolean = js.native
  
  def hasDependency(namespaces: js.Array[String], keys: js.Array[String]): Boolean = js.native
  
  var hasRTLText: Boolean = js.native
  
  var hasSymbolBuckets: Boolean = js.native
  
  def holdingForFade(): Boolean = js.native
  
  var imageAtlas: ImageAtlas = js.native
  
  var imageAtlasTexture: Texture = js.native
  
  var latestFeatureIndex: FeatureIndex = js.native
  
  var latestRawTileData: js.typedarray.ArrayBuffer = js.native
  
  /**
  	 * Given a data object with a 'buffers' property, load it into
  	 * this tile's elementGroups and buffers properties and set loaded
  	 * to true. If the data is null, like in the case of an empty
  	 * GeoJSON tile, no-op but still set loaded to true.
  	 * @param {Object} data
  	 * @param painter
  	 * @returns {undefined}
  	 * @private
  	 */
  def loadVectorData(data: WorkerTileResult, painter: Any): scala.Unit = js.native
  def loadVectorData(data: WorkerTileResult, painter: Any, justReloaded: Boolean): scala.Unit = js.native
  
  var needsHillshadePrepare: Boolean = js.native
  
  var needsTerrainPrepare: Boolean = js.native
  
  var neighboringTiles: Any = js.native
  
  def patternsLoaded(): Boolean = js.native
  
  var placementSource: Any = js.native
  
  def prepare(imageManager: ImageManager): scala.Unit = js.native
  
  var queryPadding: Double = js.native
  
  def queryRenderedFeatures(
    layers: StringDictionary[StyleLayer],
    serializedLayers: StringDictionary[Any],
    sourceFeatureState: SourceFeatureState,
    queryGeometry: js.Array[^],
    cameraQueryGeometry: js.Array[^],
    scale: Double,
    params: AvailableImages,
    transform: Transform,
    maxPitchScaleFactor: Double,
    pixelPosMatrix: mat4
  ): StringDictionary[js.Array[typings.maplibreGl.anon.Feature]] = js.native
  
  def querySourceFeatures(result: js.Array[GeoJSONFeature]): scala.Unit = js.native
  def querySourceFeatures(result: js.Array[GeoJSONFeature], params: Filter): scala.Unit = js.native
  
  var redoWhenDone: Boolean = js.native
  
  var refreshedUponExpiration: Boolean = js.native
  
  def registerFadeDuration(duration: Double): scala.Unit = js.native
  
  var reloadCallback: Any = js.native
  
  var request: Cancelable = js.native
  
  var resourceTiming: js.Array[PerformanceResourceTiming] = js.native
  
  def setDependencies(namespace: String, dependencies: js.Array[String]): scala.Unit = js.native
  
  def setExpiryData(data: ExpiryData): scala.Unit = js.native
  
  def setFeatureState(states: LayerFeatureStates, painter: Any): scala.Unit = js.native
  
  def setHoldDuration(duration: Double): scala.Unit = js.native
  
  var showCollisionBoxes: Boolean = js.native
  
  var state: TileState = js.native
  
  def symbolFadeFinished(): Boolean = js.native
  
  var symbolFadeHoldUntil: Double = js.native
  
  var texture: Any = js.native
  
  var textureCoords: StringDictionary[String] = js.native
  
  var textures: js.Array[Texture] = js.native
  
  var tileID: OverscaledTileID = js.native
  
  var tileSize: Double = js.native
  
  var timeAdded: Any = js.native
  
  var timeLoaded: Any = js.native
  
  var uid: Double = js.native
  
  /**
  	 * Release any data or WebGL resources referenced by this tile.
  	 * @returns {undefined}
  	 * @private
  	 */
  def unloadVectorData(): scala.Unit = js.native
  
  def upload(context: Context): scala.Unit = js.native
  
  var uses: Double = js.native
  
  var vtLayers: StringDictionary[VectorTileLayer] = js.native
  
  def wasRequested(): Boolean = js.native
}
