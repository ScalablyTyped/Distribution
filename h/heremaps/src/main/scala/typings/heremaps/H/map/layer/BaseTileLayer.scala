package typings.heremaps.H.map.layer

import typings.heremaps.H.geo.Rect
import typings.heremaps.H.map.layer.ITileLayer.Response
import typings.heremaps.H.map.provider.Tile
import typings.heremaps.H.map.provider.TileProvider
import typings.heremaps.H.math.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BaseTileLayer encapsulates funcitonailty that is common to all layers that deliver tiles, such as H.map.layer.TileLayer. The functionality includes geo bounding box to grid
  * calculation, tile request management.
  */
@js.native
trait BaseTileLayer extends Layer {
  
  /**
    * This method cancels a previously requested tile.
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - zoom level
    */
  def cancelTile(x: Double, y: Double, z: Double): Unit = js.native
  
  /**
    * This method transforms a geo-rectangle to geometrical projected rectangle at the current projection zoom level or at provided zoom level
    * @param geoRect {H.geo.Rect} - geo bounds to be projected
    * @param opt_zoom {number=} - overrides current projection zoom level
    * @returns {H.math.Rect} - projected 2d space rect cooresponding to provided geo bounds
    */
  def geoRectToRect(geoRect: Rect): typings.heremaps.H.math.Rect = js.native
  def geoRectToRect(geoRect: Rect, opt_zoom: Double): typings.heremaps.H.math.Rect = js.native
  
  /**
    * This method returns the provider which feeds this layer with data.
    * @returns {H.map.provider.TileProvider} - this layer's provider
    */
  def getProvider(): TileProvider = js.native
  
  /**
    * This method requests tiles from the data source (provider). It can return a set of tiles which are currently loaded. All tiles which are not yet loaded will be included in response
    * as soon as they will be available during subsequent calls.
    * @param tileBounds {H.math.Rect} - bounds in tile grid
    * @param isCDB {boolean}
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {H.map.layer.ITileLayer.Response} - returns an array if tile which are already loaded
    */
  def getProviderTiles(
    tileBounds: typings.heremaps.H.math.Rect,
    isCDB: Boolean,
    zoomLevel: Double,
    cacheOnly: Boolean,
    prioCenter: Point
  ): Response = js.native
  
  /**
    * This method returns tile grid for a bounding rectangle
    * @param rectBounds {H.math.Rect} - projected rect bounds which coorespond to geo bounding box
    * @param zoom {number} - current zoom level
    * @returns {H.math.Rect} - rectangle which represents the tile grid bounds
    */
  def getTileBounds(rectBounds: typings.heremaps.H.math.Rect, zoom: Double): typings.heremaps.H.math.Rect = js.native
  
  /**
    * This method requests a single tile according to tile coordinates. It returns either a Tile object if it is already loaded or undefined and starts loading the tile
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - The zoom level for which the tile is requested
    * @param cacheOnly {boolean} - indicates whether only cached tiles are to be considered
    * @returns {(H.map.provider.Tile | undefined)} - tile object corresponding to requested coordinates
    */
  def requestTile(x: Double, y: Double, z: Double, cacheOnly: Boolean): Tile | Unit = js.native
}
