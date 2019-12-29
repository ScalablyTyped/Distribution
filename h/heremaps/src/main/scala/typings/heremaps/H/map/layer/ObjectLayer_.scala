package typings.heremaps.H.map.layer

import typings.heremaps.H.clustering.Provider
import typings.heremaps.H.geo.Rect
import typings.heremaps.H.map.ICopyright
import typings.heremaps.H.map.layer.IMarkerLayer.Response
import typings.heremaps.H.map.layer.IMarkerLayer.TiledResponse
import typings.heremaps.H.map.layer.ObjectLayer.Options
import typings.heremaps.H.map.layer.ObjectLayer.OverlaysResponse
import typings.heremaps.H.map.provider.ObjectProvider
import typings.heremaps.H.map.provider.Tile
import typings.heremaps.H.math.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a layer which renders map objects. Spatial objects like polygons and polylines a rendered to tiles before being passed to the enigne. Point objects like markers
  * are provided as objects given an rectangular area.
  */
@JSGlobal("H.map.layer.ObjectLayer")
@js.native
class ObjectLayer_ protected ()
  extends Layer
     with ITileLayer {
  def this(provider: Provider) = this()
  /**
    * Constructor
    * @param provider {H.map.provider.ObjectProvider} - the ObjectProvider which provides the map objects to this object layer.
    * @param opt_options {H.map.layer.ObjectLayer.Options=} - The options for this layer
    */
  def this(provider: ObjectProvider) = this()
  def this(provider: Provider, opt_options: Options) = this()
  def this(provider: ObjectProvider, opt_options: Options) = this()
  /* InferMemberOverrides */
  override def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  /**
    * This method cancels a previously requested tile.
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - zoom level
    */
  /* InferMemberOverrides */
  override def cancelTile(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * This method returns the copyright of the current data provider.
    * @param bounds {H.geo.Rect} - the bounding area for which to retrieve the copyright information
    * @param level {number} - the zoom level for which to retrieve the copyright information
    * @returns {Array<H.map.ICopyright>} - a list of copyright information objects for the provided area and zoom level
    */
  /* InferMemberOverrides */
  override def getCopyrights(bounds: Rect, level: Double): js.Array[ICopyright] = js.native
  /**
    * This method returns current ObjectLayer's data provider
    * @returns {H.map.provider.ObjectProvider}
    */
  def getProvider(): ObjectProvider = js.native
  /**
    * This method checks if a zoom level can be served by this layer.
    * @param zoomLevel {number} - the zoom level to check
    * @returns {boolean} - true if this layer can provide data for the zoom level, otherwise false
    */
  /* InferMemberOverrides */
  override def isValid(zoomLevel: Double): Boolean = js.native
  /**
    * This method requests dom marker objects for provided bounding rectangle.
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
    */
  def requestDomMarkers(boundingRect: Rect, zoomLevel: Double, cacheOnly: Boolean, prioCenter: Point): Response | TiledResponse = js.native
  /**
    * This method requests marker objects for provided bounding rectangle.
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
    */
  def requestMarkers(boundingRect: Rect, zoomLevel: Double, cacheOnly: Boolean, prioCenter: Point): Response | TiledResponse = js.native
  /**
    * To request overlay objects for the passsed bounding rectangle. It returns all overlay objects which are contained within this bounding rectangle.
    * @param bounds {H.geo.Rect} - The bounding rectangle for which overlays are to be returned
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {H.map.layer.ObjectLayer.OverlaysResponse}
    */
  def requestOverlays(bounds: Rect, zoomLevel: Double, cacheOnly: Boolean, prioCenter: Point): OverlaysResponse = js.native
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
  /* InferMemberOverrides */
  override def requestTiles(boundingRect: Rect, zoomLevel: Double, cacheOnly: Boolean, prioCenter: Point): typings.heremaps.H.map.layer.ITileLayer.Response = js.native
  /**
    * This method sets the maximum zoom level for which this layer will provide tiles.
    * @param max {number} - The new maximum zoom level of this layer
    * @returns {H.map.layer.Layer} - Returns this instance of the layer
    */
  /* InferMemberOverrides */
  override def setMax(max: Double): Layer = js.native
  /**
    * This method sets the minimum zoom level for which this layer will provide tiles.
    * @param min {number} - The new minimum zoom level of this layer
    * @returns {H.map.layer.Layer} - Returns this instance of the layer
    */
  /* InferMemberOverrides */
  override def setMin(min: Double): Layer = js.native
}

