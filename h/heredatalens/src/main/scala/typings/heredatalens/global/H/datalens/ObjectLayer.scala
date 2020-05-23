package typings.heredatalens.global.H.datalens

import typings.heredatalens.H.datalens.ObjectLayer.Options
import typings.heredatalens.H.datalens.ObjectLayer.Row
import typings.heredatalens.H.datalens.Service.Data
import typings.heremaps.H.geo.Rect
import typings.heremaps.H.map.Icon
import typings.heremaps.H.map.layer.ITileLayer.Response
import typings.heremaps.H.map.provider.RemoteTileProvider
import typings.heremaps.H.map.provider.Tile
import typings.heremaps.H.math.Point
import typings.heremaps.H.util.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Presents data as points or spatial map objects with data-driven styles and client-side clustering.
  * Applicable for drawing interactive map objects like markers, polygons, circles and other instances of map.Object. Source of data can be either tiled or not tiled.
  * Styles for objects can be parametrized with data rows and zoom level. Allows to create data-driven icons for markers like donuts or bars.
  * Also enables clustering and data domains for visualizing up to 100k points or more.
  */
@JSGlobal("H.datalens.ObjectLayer")
@js.native
class ObjectLayer protected ()
  extends typings.heredatalens.H.datalens.ObjectLayer {
  def this(provider: typings.heredatalens.H.datalens.Provider, options: Options) = this()
  def this(provider: typings.heredatalens.H.datalens.QueryProvider, options: Options) = this()
  def this(provider: typings.heredatalens.H.datalens.QueryTileProvider, options: Options) = this()
  /**
    * Constructor
    * @param provider - Data source (tiled or not)
    * @param options - Defines data processing, clustering and data-driven styling
    */
  def this(provider: RemoteTileProvider, options: Options) = this()
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
@JSGlobal("H.datalens.ObjectLayer")
@js.native
object ObjectLayer extends js.Object {
  /**
    * A factory method for data-driven icons. The method allows you to build an icon from SVG markup or JsonML object. Provides caching of icons with the same markup.
    * @param svg - SVG presented as markup or JsonML Array
    * @param options - Icon options (eg size and anchor). Note that the default anchor is in the middle.
    * @param options.size - When the icon is a square, you can define the size as a number in pixels
    * @returns - Icon which can be used for marker or cluster
    */
  def createIcon(svg: String): Icon = js.native
  def createIcon(svg: String, options: typings.heremaps.H.map.Icon.Options): Icon = js.native
  def createIcon(svg: js.Array[_]): Icon = js.native
  def createIcon(svg: js.Array[_], options: typings.heremaps.H.map.Icon.Options): Icon = js.native
  /**
    * Default value for dataToRows callback option. It represents each row as an object where property names correspond to data column names.
    */
  def defaultDataToRows(data: Data): js.Array[Row] = js.native
  /**
    * Returns cache of icons created with the createIcon method. Can be used to clean the icon cache.
    * @return - Icon cache
    */
  def getIconCache(): Cache = js.native
}

