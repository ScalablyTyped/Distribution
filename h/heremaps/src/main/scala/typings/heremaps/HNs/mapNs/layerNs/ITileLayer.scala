package typings.heremaps.HNs.mapNs.layerNs

import typings.heremaps.HNs.mapNs.layerNs.ITileLayerNs.Response
import typings.heremaps.HNs.mapNs.providerNs.Tile
import typings.heremaps.HNs.mathNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface describes a layer which provides data partitioned in quad-tree tiles in an x, y, z fashion (where z describes the level within the tree and x and y describe the absolute
  * column and row indeces whithin the level).
  */
trait ITileLayer extends js.Object {
  /**
    * This method cancels a previously requested tile.
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - zoom level
    */
  def cancelTile(x: Double, y: Double, z: Double): Unit
  /**
    * This method requests a single tile according to tile coordinates. It returns either a Tile object if it is already loaded or undefined and starts loading the tile
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - The zoom level for which the tile is requested
    * @param cacheOnly {boolean} - indicates whether only cached tiles are to be considered
    * @returns {(H.map.provider.Tile | undefined)} - tile object corresponding to requested coordinates
    */
  def requestTile(x: Double, y: Double, z: Double, cacheOnly: Boolean): Tile | Unit
  /**
    * This method requests tiles for the current bounding rectangle at the given zoom level (z-value).
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which tiles are to be returned
    * @param zoomLevel {number} - The zoom level for which the tiles are requested
    * @param cacheOnly {boolean} - Indicates whether only cached tiles are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {H.map.layer.ITileLayer.Response} - a response object containing the total number of tiles requested and the tile objects that could be immediately returned
    */
  def requestTiles(
    boundingRect: typings.heremaps.HNs.geoNs.Rect,
    zoomLevel: Double,
    cacheOnly: Boolean,
    prioCenter: Point
  ): Response
}

object ITileLayer {
  @scala.inline
  def apply(
    cancelTile: (Double, Double, Double) => Unit,
    requestTile: (Double, Double, Double, Boolean) => Tile | Unit,
    requestTiles: (typings.heremaps.HNs.geoNs.Rect, Double, Boolean, Point) => Response
  ): ITileLayer = {
    val __obj = js.Dynamic.literal(cancelTile = js.Any.fromFunction3(cancelTile), requestTile = js.Any.fromFunction4(requestTile), requestTiles = js.Any.fromFunction4(requestTiles))
  
    __obj.asInstanceOf[ITileLayer]
  }
}

