package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "SourceCache")
@js.native
open class SourceCache protected () extends Evented {
  def this(id: String, options: SourceSpecification, dispatcher: Dispatcher) = this()
  
  def _abortTile(tile: Tile): scala.Unit = js.native
  
  /**
  	 * Add a tile, given its coordinate, to the pyramid.
  	 * @private
  	 */
  def _addTile(tileID: OverscaledTileID): Tile = js.native
  
  /**
  	* For raster terrain source, backfill DEM to eliminate visible tile boundaries
  	* @private
  	*/
  def _backfillDEM(tile: Tile): scala.Unit = js.native
  
  var _cache: TileCache = js.native
  
  var _cacheTimers: /* import warning: importer.ImportType#apply Failed type conversion: {[ _ in any ]: std.ReturnType<{readonly ^ <TArgs extends std.Array<any>>(callback : (args : TArgs): void, ms : number, args : TArgs): node.timers.<global>.NodeJS.Timeout, readonly ^ <TArgs extends std.Array<any>>(callback : (args : TArgs): void, ms : undefined, args : TArgs): node.timers.<global>.NodeJS.Timeout, readonly ^ (callback : (args : void): void): node.timers.<global>.NodeJS.Timeout, readonly ^ (callback : (args : void): void, ms : number): node.timers.<global>.NodeJS.Timeout}>} */ js.Any = js.native
  
  var _coveredTiles: StringDictionary[Boolean] = js.native
  
  def _getLoadedTile(tileID: OverscaledTileID): Tile = js.native
  
  def _isIdRenderable(id: String): Boolean = js.native
  def _isIdRenderable(id: String, symbolLayer: Boolean): Boolean = js.native
  
  def _loadTile(tile: Tile, callback: Callback[scala.Unit]): scala.Unit = js.native
  
  var _loadedParentTiles: StringDictionary[Tile] = js.native
  
  var _maxTileCacheSize: Double = js.native
  
  var _paused: Boolean = js.native
  
  var _prevLng: Double = js.native
  
  def _reloadTile(id: String, state: TileState): scala.Unit = js.native
  
  /**
  	 * Remove a tile, given its id, from the pyramid
  	 * @private
  	 */
  def _removeTile(id: String): scala.Unit = js.native
  
  /**
  	 * For a given set of tiles, retain children that are loaded and have a zoom
  	 * between `zoom` (exclusive) and `maxCoveringZoom` (inclusive)
  	 * @private
  	 */
  def _retainLoadedChildren(
    idealTiles: /* import warning: importer.ImportType#apply Failed type conversion: {[ _ in any ]: maplibre-gl.maplibre-gl.OverscaledTileID} */ js.Any,
    zoom: Double,
    maxCoveringZoom: Double,
    retain: /* import warning: importer.ImportType#apply Failed type conversion: {[ _ in any ]: maplibre-gl.maplibre-gl.OverscaledTileID} */ js.Any
  ): scala.Unit = js.native
  
  def _setTileReloadTimer(id: String, tile: Tile): scala.Unit = js.native
  
  var _shouldReloadOnResume: Boolean = js.native
  
  var _source: Source = js.native
  
  var _sourceErrored: Boolean = js.native
  
  var _sourceLoaded: Boolean = js.native
  
  var _state: SourceFeatureState = js.native
  
  def _tileLoaded(tile: Tile, id: String, previousState: TileState): scala.Unit = js.native
  def _tileLoaded(tile: Tile, id: String, previousState: TileState, err: js.Error): scala.Unit = js.native
  
  var _tiles: StringDictionary[Tile] = js.native
  
  var _timers: /* import warning: importer.ImportType#apply Failed type conversion: {[ _ in any ]: std.ReturnType<{readonly ^ <TArgs extends std.Array<any>>(callback : (args : TArgs): void, ms : number, args : TArgs): node.timers.<global>.NodeJS.Timeout, readonly ^ <TArgs extends std.Array<any>>(callback : (args : TArgs): void, ms : undefined, args : TArgs): node.timers.<global>.NodeJS.Timeout, readonly ^ (callback : (args : void): void): node.timers.<global>.NodeJS.Timeout, readonly ^ (callback : (args : void): void, ms : number): node.timers.<global>.NodeJS.Timeout}>} */ js.Any = js.native
  
  def _unloadTile(tile: Tile): scala.Unit = js.native
  
  def _updateLoadedParentTileCache(): scala.Unit = js.native
  
  def _updateRetainedTiles(idealTileIDs: js.Array[OverscaledTileID], zoom: Double): StringDictionary[OverscaledTileID] = js.native
  
  /**
  	 * Remove all tiles from this pyramid
  	 */
  def clearTiles(): scala.Unit = js.native
  
  var dispatcher: Dispatcher = js.native
  
  /**
  	 * Find a loaded parent of the given tile (up to minCoveringZoom)
  	 * @private
  	 */
  def findLoadedParent(tileID: OverscaledTileID, minCoveringZoom: Double): Tile = js.native
  
  def getFeatureState(sourceLayer: String, featureId: String): Any = js.native
  /**
  	 * Get the entire state object for a feature
  	 * @private
  	 */
  def getFeatureState(sourceLayer: String, featureId: Double): Any = js.native
  
  /**
  	 * Return all tile ids ordered with z-order, and cast to numbers
  	 * @private
  	 */
  def getIds(): js.Array[String] = js.native
  
  def getRenderableIds(): js.Array[String] = js.native
  def getRenderableIds(symbolLayer: Boolean): js.Array[String] = js.native
  
  def getSource(): Source = js.native
  
  /**
  	 * Get a specific tile by TileID
  	 * @private
  	 */
  def getTile(tileID: OverscaledTileID): Tile = js.native
  
  /**
  	 * Get a specific tile by id
  	 * @private
  	 */
  def getTileByID(id: String): Tile = js.native
  
  def getVisibleCoordinates(): js.Array[OverscaledTileID] = js.native
  def getVisibleCoordinates(symbolLayer: Boolean): js.Array[OverscaledTileID] = js.native
  
  def handleWrapJump(lng: Double): scala.Unit = js.native
  
  def hasRenderableParent(tileID: OverscaledTileID): Boolean = js.native
  
  def hasTransition(): Boolean = js.native
  
  var id: String = js.native
  
  /**
  	 * Return true if no tile data is pending, tiles will not change unless
  	 * an additional API call is received.
  	 * @private
  	 */
  def loaded(): Boolean = js.native
  
  var map: Map = js.native
  
  def onAdd(map: Map): scala.Unit = js.native
  
  def onRemove(map: Map): scala.Unit = js.native
  
  def pause(): scala.Unit = js.native
  
  def prepare(context: Context): scala.Unit = js.native
  
  def releaseSymbolFadeTiles(): scala.Unit = js.native
  
  def reload(): scala.Unit = js.native
  
  /**
  	 * Reloads all tiles that depend on the given keys.
  	 * @private
  	 */
  def reloadTilesForDependencies(namespaces: js.Array[String], keys: js.Array[String]): scala.Unit = js.native
  
  /**
  	 * Resets the value of a particular state key for a feature
  	 * @private
  	 */
  def removeFeatureState(): scala.Unit = js.native
  def removeFeatureState(sourceLayer: String): scala.Unit = js.native
  def removeFeatureState(sourceLayer: String, featureId: String): scala.Unit = js.native
  def removeFeatureState(sourceLayer: String, featureId: String, key: String): scala.Unit = js.native
  def removeFeatureState(sourceLayer: String, featureId: Double): scala.Unit = js.native
  def removeFeatureState(sourceLayer: String, featureId: Double, key: String): scala.Unit = js.native
  def removeFeatureState(sourceLayer: String, featureId: scala.Unit, key: String): scala.Unit = js.native
  def removeFeatureState(sourceLayer: scala.Unit, featureId: String): scala.Unit = js.native
  def removeFeatureState(sourceLayer: scala.Unit, featureId: String, key: String): scala.Unit = js.native
  def removeFeatureState(sourceLayer: scala.Unit, featureId: Double): scala.Unit = js.native
  def removeFeatureState(sourceLayer: scala.Unit, featureId: Double, key: String): scala.Unit = js.native
  def removeFeatureState(sourceLayer: scala.Unit, featureId: scala.Unit, key: String): scala.Unit = js.native
  
  def resume(): scala.Unit = js.native
  
  def serialize(): Any = js.native
  
  /**
  	 * Sets the set of keys that the tile depends on. This allows tiles to
  	 * be reloaded when their dependencies change.
  	 * @private
  	 */
  def setDependencies(tileKey: String, namespace: String, dependencies: js.Array[String]): scala.Unit = js.native
  
  def setFeatureState(sourceLayer: String, featureId: String, state: Any): scala.Unit = js.native
  /**
  	 * Set the value of a particular state for a feature
  	 * @private
  	 */
  def setFeatureState(sourceLayer: String, featureId: Double, state: Any): scala.Unit = js.native
  
  var style: Style = js.native
  
  var terrain: Terrain = js.native
  
  var tileSize: Double = js.native
  
  /**
  	 * Search through our current tiles and attempt to find the tiles that
  	 * cover the given bounds.
  	 * @param pointQueryGeometry coordinates of the corners of bounding rectangle
  	 * @returns {Array<Object>} result items have {tile, minX, maxX, minY, maxY}, where min/max bounding values are the given bounds transformed in into the coordinate space of this tile.
  	 * @private
  	 */
  def tilesIn(pointQueryGeometry: js.Array[^], maxPitchScaleFactor: Double, has3DLayer: Boolean): js.Array[Any] = js.native
  
  var transform: Transform = js.native
  
  /**
  	 * Removes tiles that are outside the viewport and adds new tiles that
  	 * are inside the viewport.
  	 * @private
  	 */
  def update(transform: Transform): scala.Unit = js.native
  def update(transform: Transform, terrain: Terrain): scala.Unit = js.native
  
  /**
  	 * Resizes the tile cache based on the current viewport's size
  	 * or the maxTileCacheSize option passed during map creation
  	 *
  	 * Larger viewports use more tiles and need larger caches. Larger viewports
  	 * are more likely to be found on devices with more memory and on pages where
  	 * the map is more important.
  	 * @private
  	 */
  def updateCacheSize(transform: Transform): scala.Unit = js.native
  
  var used: Boolean = js.native
  
  var usedForTerrain: Boolean = js.native
}
/* static members */
object SourceCache {
  
  @JSImport("maplibre-gl", "SourceCache")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl", "SourceCache.maxOverzooming")
  @js.native
  def maxOverzooming: Double = js.native
  inline def maxOverzooming_=(x: Double): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxOverzooming")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "SourceCache.maxUnderzooming")
  @js.native
  def maxUnderzooming: Double = js.native
  inline def maxUnderzooming_=(x: Double): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxUnderzooming")(x.asInstanceOf[js.Any])
}
