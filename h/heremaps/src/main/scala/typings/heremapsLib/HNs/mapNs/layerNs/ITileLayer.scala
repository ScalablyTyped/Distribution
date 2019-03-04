package typings
package heremapsLib.HNs.mapNs.layerNs

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
  def cancelTile(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit
  /**
    * This method requests a single tile according to tile coordinates. It returns either a Tile object if it is already loaded or undefined and starts loading the tile
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - The zoom level for which the tile is requested
    * @param cacheOnly {boolean} - indicates whether only cached tiles are to be considered
    * @returns {(H.map.provider.Tile | undefined)} - tile object corresponding to requested coordinates
    */
  def requestTile(x: scala.Double, y: scala.Double, z: scala.Double, cacheOnly: scala.Boolean): heremapsLib.HNs.mapNs.providerNs.Tile | scala.Unit
  /**
    * This method requests tiles for the current bounding rectangle at the given zoom level (z-value).
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which tiles are to be returned
    * @param zoomLevel {number} - The zoom level for which the tiles are requested
    * @param cacheOnly {boolean} - Indicates whether only cached tiles are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {H.map.layer.ITileLayer.Response} - a response object containing the total number of tiles requested and the tile objects that could be immediately returned
    */
  def requestTiles(
    boundingRect: heremapsLib.HNs.geoNs.Rect,
    zoomLevel: scala.Double,
    cacheOnly: scala.Boolean,
    prioCenter: heremapsLib.HNs.mathNs.Point
  ): heremapsLib.HNs.mapNs.layerNs.ITileLayerNs.Response
}

object ITileLayer {
  @scala.inline
  def apply(
    cancelTile: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit],
    requestTile: js.Function4[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Boolean, 
      heremapsLib.HNs.mapNs.providerNs.Tile | scala.Unit
    ],
    requestTiles: js.Function4[
      heremapsLib.HNs.geoNs.Rect, 
      scala.Double, 
      scala.Boolean, 
      heremapsLib.HNs.mathNs.Point, 
      heremapsLib.HNs.mapNs.layerNs.ITileLayerNs.Response
    ]
  ): ITileLayer = {
    val __obj = js.Dynamic.literal(cancelTile = cancelTile, requestTile = requestTile, requestTiles = requestTiles)
  
    __obj.asInstanceOf[ITileLayer]
  }
}

