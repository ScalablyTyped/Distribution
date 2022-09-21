package typings.maplibreGl.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.glMatrix.mod.mat4
import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.Matrix
import typings.maplibreGl.anon.MaxElevation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Terrain")
@js.native
open class Terrain protected () extends StObject {
  def this(style: Style, sourceCache: SourceCache, options: TerrainSpecification) = this()
  
  var _coordsTexture: Texture = js.native
  
  var _coordsTextureSize: Double = js.native
  
  var _demMatrixCache: StringDictionary[Matrix] = js.native
  
  var _emptyDemMatrix: mat4 = js.native
  
  var _emptyDemTexture: Texture = js.native
  
  var _emptyDemUnpack: js.Array[Double] = js.native
  
  var _emptyDepthTexture: Texture = js.native
  
  var _fbo: Framebuffer = js.native
  
  var _fboCoordsTexture: Texture = js.native
  
  var _fboDepthTexture: Texture = js.native
  
  var _mesh: TerrainMesh = js.native
  
  var _rerender: StringDictionary[NumberDictionary[Boolean]] = js.native
  
  var _rttFramebuffer: Framebuffer = js.native
  
  def clearRerenderCache(): scala.Unit = js.native
  
  var coordsIndex: js.Array[String] = js.native
  
  var elevationOffset: Double = js.native
  
  var exaggeration: Double = js.native
  
  /**
  	 * create coords texture, needed to grab coordinates from canvas
  	 * encode coords coordinate into 4 bytes:
  	 *   - 8 lower bits for x
  	 *   - 8 lower bits for y
  	 *   - 4 higher bits for x
  	 *   - 4 higher bits for y
  	 *   - 8 bits for coordsIndex (1 .. 255) (= number of terraintile), is later setted in draw_terrain uniform value
  	 * @returns {Texture} - the texture
  	 */
  def getCoordsTexture(): Texture = js.native
  
  /**
  	 * get the elevation-value from original dem-data for a given tile-coordinate
  	 * @param {OverscaledTileID} tileID - the tile to get elevation for
  	 * @param {number} x between 0 .. EXTENT
  	 * @param {number} y between 0 .. EXTENT
  	 * @param {number} extent optional, default 8192
  	 * @returns {number} - the elevation
  	 */
  def getDEMElevation(tileID: OverscaledTileID, x: Double, y: Double): Double = js.native
  def getDEMElevation(tileID: OverscaledTileID, x: Double, y: Double, extent: Double): Double = js.native
  
  /**
  	 * get the Elevation for given coordinate in respect of elevationOffset and exaggeration.
  	 * @param {OverscaledTileID} tileID - the tile id
  	 * @param {number} x between 0 .. EXTENT
  	 * @param {number} y between 0 .. EXTENT
  	 * @param {number} extent optional, default 8192
  	 * @returns {number} - the elevation
  	 */
  def getElevation(tileID: OverscaledTileID, x: Double, y: Double): Double = js.native
  def getElevation(tileID: OverscaledTileID, x: Double, y: Double, extent: Double): Double = js.native
  
  /**
  	 * get a framebuffer as big as the map-div, which will be used to render depth & coords into a texture
  	 * @param {string} texture - the texture
  	 * @returns {Framebuffer} the frame buffer
  	 */
  def getFramebuffer(texture: String): Framebuffer = js.native
  
  /**
  	 * Get the minimum and maximum elevation contained in a tile. This includes any elevation offset
  	 * and exaggeration included in the terrain.
  	 *
  	 * @param tileID Id of the tile to be used as a source for the min/max elevation
  	 * @returns {Object} Minimum and maximum elevation found in the tile, including the terrain's
  	 * elevation offset and exaggeration
  	 */
  def getMinMaxElevation(tileID: OverscaledTileID): MaxElevation = js.native
  
  /**
  	 * create the render-to-texture framebuffer
  	 * @returns {Framebuffer} - the frame buffer
  	 */
  def getRTTFramebuffer(): Framebuffer = js.native
  
  /**
  	 * returns a Terrain Object for a tile. Unless the tile corresponds to data (e.g. tile is loading), return a flat dem object
  	 * @param {OverscaledTileID} tileID - the tile to get the terrain for
  	 * @returns {TerrainData} the terrain data to use in the program
  	 */
  def getTerrainData(tileID: OverscaledTileID): TerrainData = js.native
  
  /**
  	 * create a regular mesh which will be used by all terrain-tiles
  	 * @returns {TerrainMesh} - the created regular mesh
  	 */
  def getTerrainMesh(): TerrainMesh = js.native
  
  var meshSize: Double = js.native
  
  def needsRerender(source: String, tileID: OverscaledTileID): Any = js.native
  
  var options: TerrainSpecification = js.native
  
  /**
  	 * Reads a pixel from the coords-framebuffer and translate this to mercator.
  	 * @param {Point} p Screen-Coordinate
  	 * @returns {MercatorCoordinate} mercator coordinate for a screen pixel
  	 */
  def pointCoordinate(p: ^): MercatorCoordinate = js.native
  
  var qualityFactor: Double = js.native
  
  def rememberForRerender(source: String, tileID: OverscaledTileID): scala.Unit = js.native
  
  var sourceCache: TerrainSourceCache = js.native
  
  var style: Style = js.native
}
