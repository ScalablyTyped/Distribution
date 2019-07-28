package typings.heremaps.HNs.mapNs.layerNs

import typings.heremaps.HNs.mapNs.layerNs.ITileLayerNs.Options
import typings.heremaps.HNs.mapNs.layerNs.ITileLayerNs.Response
import typings.heremaps.HNs.mapNs.providerNs.Tile
import typings.heremaps.HNs.mapNs.providerNs.TileProvider
import typings.heremaps.HNs.mathNs.Point
import typings.heremaps.HNs.utilNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tile Layer, represents data shown on map on a tile basis. Can be used to show map tile images or other type of data which is partitioned into tiles.
  * @event update {H.util.Event}
  */
@JSGlobal("H.map.layer.TileLayer")
@js.native
class TileLayer protected ()
  extends BaseTileLayer
     with ITileLayer {
  /**
    * Constructor
    * @param provider {H.map.provider.TileProvider} - data source for the TileLayer
    * @param opt_options {H.map.layer.ITileLayer.Options=} - additional options
    */
  def this(provider: TileProvider) = this()
  def this(provider: TileProvider, opt_options: Options) = this()
  var update: Event = js.native
  /**
    * This method cancels a previously requested tile.
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - zoom level
    */
  /* InferMemberOverrides */
  override def cancelTile(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * This method requests a single tile according to tile coordinates. It returns either a Tile object if it is already loaded or undefined and starts loading the tile
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - The zoom level for which the tile is requested
    * @param cacheOnly {boolean} - indicates whether only cached tiles are to be considered
    * @returns {(H.map.provider.Tile | undefined)} - tile object corresponding to requested coordinates
    */
  /* InferMemberOverrides */
  override def requestTile(x: Double, y: Double, z: Double, cacheOnly: Boolean): Tile | Unit = js.native
  /**
    * This method requests tiles for the current bounding rectangle at the given zoom level (z-value).
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which tiles are to be returned
    * @param zoomLevel {number} - The zoom level for which the tiles are requested
    * @param cacheOnly {boolean} - Indicates whether only cached tiles are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {H.map.layer.ITileLayer.Response} - a response object containing the total number of tiles requested and the tile objects that could be immediately returned
    */
  /* CompleteClass */
  override def requestTiles(
    boundingRect: typings.heremaps.HNs.geoNs.Rect,
    zoomLevel: Double,
    cacheOnly: Boolean,
    prioCenter: Point
  ): Response = js.native
}

