package typings.heredatalens.global.H.datalens

import typings.heredatalens.H.datalens.HeatmapLayer.Aggregation
import typings.heredatalens.H.datalens.HeatmapLayer.InputScale
import typings.heredatalens.H.datalens.HeatmapLayer.Options
import typings.heredatalens.H.datalens.HeatmapLayer.Row
import typings.heredatalens.H.datalens.QueryTileProvider.X
import typings.heredatalens.H.datalens.QueryTileProvider.Y
import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import typings.heredatalens.H.datalens.Service.Data
import typings.heremaps.H.geo.Rect
import typings.heremaps.H.map.layer.ITileLayer.Response
import typings.heremaps.H.map.provider.Tile
import typings.heremaps.H.math.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functionality of value-based heat map with density alpha mask.
  * Layer support different types of blending, including weighted average. Also it allows to apply alpha mask calculated by density.
  * In most cases, the layer consumes data grouped by 1x1 pixels buckets. For proper averaging it requires aggregated value and count (number of rows in bucket) for each bucket.
  * Blending of buckets is implemented via kernel density estimation (KDE) with a Gaussian kernel.
  */
@JSGlobal("H.datalens.HeatmapLayer")
@js.native
class HeatmapLayer protected ()
  extends typings.heredatalens.H.datalens.HeatmapLayer {
  /**
    * Constructor
    * @param provider - Source of tiled data
    * @param options - Configuration for data processing and rendering
    */
  def this(provider: typings.heredatalens.H.datalens.QueryTileProvider, options: Options) = this()
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
@JSGlobal("H.datalens.HeatmapLayer")
@js.native
object HeatmapLayer extends js.Object {
  /**
    * Set of possible values for the aggregation option
    */
  var aggregation: Aggregation = js.native
  /**
    * Set of possible values for the inputScale option
    */
  var inputScale: InputScale = js.native
  /**
    * Default value for dataToRows callback option. It represents each row as an object where property names correspond to data column names.
    */
  def defaultDataToRows(data: Data, x: X, y: Y, zoom: Zoom): js.Array[Row] = js.native
  /**
    * Set of possible values for the aggregation option.
    * If the heat map input data is buckets, then different types of aggregation can be applied to the rows in a bucket.
    * The aggregation type is required for proper blending mode of the heat map. For the AVERAGE aggregation type, an averaged heat map is rendered.
    */
  @js.native
  object Aggregation extends js.Object {
    /* 1 */ val AVERAGE: typings.heredatalens.H.datalens.HeatmapLayer.Aggregation.AVERAGE with Double = js.native
    /* 0 */ val SUM: typings.heredatalens.H.datalens.HeatmapLayer.Aggregation.SUM with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.heredatalens.H.datalens.HeatmapLayer.Aggregation with Double] = js.native
  }
  
  /**
    * Set of possible values for the inputScale option.
    * The input scale is required for proper heat map blending. If the input scale is not linear, then the TilePoint.value is converted to linear scale before calculating the sum or average.
    */
  @js.native
  object InputScale extends js.Object {
    /* 0 */ val DB: typings.heredatalens.H.datalens.HeatmapLayer.InputScale.DB with Double = js.native
    /* 1 */ val LINEAR: typings.heredatalens.H.datalens.HeatmapLayer.InputScale.LINEAR with Double = js.native
    /* 2 */ val LOG: typings.heredatalens.H.datalens.HeatmapLayer.InputScale.LOG with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.heredatalens.H.datalens.HeatmapLayer.InputScale with Double] = js.native
  }
  
}

