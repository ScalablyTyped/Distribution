package typings.heredatalens.global.H.datalens

import typings.heredatalens.H.datalens.RasterLayer.TilePoint
import typings.heremaps.H.geo.Rect
import typings.heremaps.H.map.layer.ITileLayer.Response
import typings.heremaps.H.map.provider.Tile
import typings.heremaps.H.math.Point
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides pixel-wise rendering of data.
  * Layer used when you need to visualize more than 10k points. The layer requires source data to be located in pixel coordinates.
  * The rendering is implemented by drawing directly on a canvas.  The layer is often used together with a Data Lens query which groups rows by pixels.
  * This reduces the amount of data delivered to the client.
  */
@JSGlobal("H.datalens.RasterLayer")
@js.native
/**
  * Constructor
  */
class RasterLayer ()
  extends typings.heredatalens.H.datalens.RasterLayer {
  /**
    * This method cancels a previously requested tile.
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - zoom level
    */
  /* CompleteClass */
  override def cancelTile(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * This method requests a single tile according to tile coordinates. It returns either a Tile object if it is already loaded or undefined and starts loading the tile
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - The zoom level for which the tile is requested
    * @param cacheOnly {boolean} - indicates whether only cached tiles are to be considered
    * @returns {(H.map.provider.Tile | undefined)} - tile object corresponding to requested coordinates
    */
  /* CompleteClass */
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
  override def requestTiles(boundingRect: Rect, zoomLevel: Double, cacheOnly: Boolean, prioCenter: Point): Response = js.native
}

/* static members */
@JSGlobal("H.datalens.RasterLayer")
@js.native
object RasterLayer extends js.Object {
  /**
    * Default value for dataToRows callback option.
    * It represents each row as an object where property names correspond to data column names.
    */
  var defaultDataToRows: js.Any = js.native
  /**
    * This is a default implementation of renderTile callback. This method represents each point as a black 1x1 pixel square.
    * @param points - Input data points within a tile
    * @param canvas - The target canvas
    */
  def defaultRenderTile(points: js.Array[TilePoint], canvas: HTMLCanvasElement): Unit = js.native
}

