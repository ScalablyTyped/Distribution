package typings.heredatalens.global.H.datalens

import typings.heredatalens.H.datalens.SpatialLayer.Options
import typings.heremaps.H.geo.Rect
import typings.heremaps.H.map.layer.ITileLayer.Response
import typings.heremaps.H.map.provider.Tile
import typings.heremaps.H.math.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renders vector tiles using data-driven styles
  * This layer binds the spatial data and user data, all provided by the Data Lens REST API. The layer renders geometry features using data-driven styles.
  */
@JSGlobal("H.datalens.SpatialLayer")
@js.native
class SpatialLayer protected ()
  extends typings.heredatalens.H.datalens.SpatialLayer {
  /**
    * Constructor
    * @param dataProvider - Source of tiled data (pass in null if data come from feature properties)
    * @param spatialProvider - Source of geometry data
    * @param options - Configuration for data processing and rendering
    */
  def this(
    dataProvider: typings.heredatalens.H.datalens.Provider,
    spatialProvider: typings.heredatalens.H.datalens.SpatialTileProvider,
    options: Options
  ) = this()
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
@JSGlobal("H.datalens.SpatialLayer")
@js.native
object SpatialLayer extends js.Object {
  var DEFAULT_STATE: js.Any = js.native
  var Spatial: js.Any = js.native
  /**
    * Default value for dataToRows callback option. It represents each row as an object where property names correspond to data column names.
    */
  var defaultDataToRows: js.Any = js.native
}

