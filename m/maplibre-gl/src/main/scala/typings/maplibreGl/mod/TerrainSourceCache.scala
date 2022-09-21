package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TerrainSourceCache")
@js.native
open class TerrainSourceCache protected () extends Evented {
  def this(sourceCache: SourceCache) = this()
  
  var _renderableTilesKeys: js.Array[String] = js.native
  
  var _sourceTileCache: StringDictionary[String] = js.native
  
  var _tiles: StringDictionary[Tile] = js.native
  
  var deltaZoom: Double = js.native
  
  def destruct(): scala.Unit = js.native
  
  /**
  	 * get a list of tiles, which are loaded and should be rendered in the current scene
  	 * @returns {Array<Tile>} the renderable tiles
  	 */
  def getRenderableTiles(): js.Array[Tile] = js.native
  
  /**
  	 * find the covering raster-dem tile
  	 * @param {OverscaledTileID} tileID - the tile to look for
  	 * @param {boolean} searchForDEM Optinal parameter to search for (parent) souretiles with loaded dem.
  	 * @returns {Tile} - the tile
  	 */
  def getSourceTile(tileID: OverscaledTileID): Tile = js.native
  def getSourceTile(tileID: OverscaledTileID, searchForDEM: Boolean): Tile = js.native
  
  /**
  	 * Searches for the corresponding current renderable terrain-tiles
  	 * @param {OverscaledTileID} tileID - the tile to look for
  	 * @returns {Record<string, OverscaledTileID>} - the tiles that were found
  	 */
  def getTerrainCoords(tileID: OverscaledTileID): Record[String, OverscaledTileID] = js.native
  
  /**
  	 * get terrain tile by the TileID key
  	 * @param id - the tile id
  	 * @returns {Tile} - the tile
  	 */
  def getTileByID(id: String): Tile = js.native
  
  var maxzoom: Double = js.native
  
  var minzoom: Double = js.native
  
  /**
  	 * This method should called before each render-to-texture step to free old cached tiles
  	 * @param {Painter} painter - the painter
  	 */
  def removeOutdated(painter: Painter): scala.Unit = js.native
  
  var renderHistory: js.Array[String] = js.native
  
  var renderHistorySize: Double = js.native
  
  var sourceCache: SourceCache = js.native
  
  var tileSize: Double = js.native
  
  /**
  	 * get a list of tiles, loaded after a spezific time. This is used to update depth & coords framebuffers.
  	 * @param {Date} time - the time
  	 * @returns {Array<Tile>} - the relevant tiles
  	 */
  def tilesAfterTime(): js.Array[Tile] = js.native
  def tilesAfterTime(time: Double): js.Array[Tile] = js.native
  
  /**
  	 * Load Terrain Tiles, create internal render-to-texture tiles, free GPU memory.
  	 * @param {Transform} transform - the operation to do
  	 * @param {Terrain} terrain - the terrain
  	 */
  def update(transform: Transform, terrain: Terrain): scala.Unit = js.native
}
