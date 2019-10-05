package typings.heremaps.H.map.layer

import typings.heremaps.H.map.ICopyright
import typings.heremaps.H.map.layer.IMarkerLayer.Response
import typings.heremaps.H.map.layer.IMarkerLayer.TiledResponse
import typings.heremaps.H.map.layer.ITileLayer.Options
import typings.heremaps.H.map.provider.MarkerTileProvider
import typings.heremaps.H.math.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectTileLayer represents map objects which are requested on a tile basis
  */
@JSGlobal("H.map.layer.MarkerTileLayer")
@js.native
class MarkerTileLayer protected ()
  extends BaseTileLayer
     with IMarkerLayer {
  /**
    * Constructor
    * @param provider {H.map.provider.MarkerTileProvider}
    * @param opt_options {H.map.layer.ITileLayer.Options=}
    */
  def this(provider: MarkerTileProvider) = this()
  def this(provider: MarkerTileProvider, opt_options: Options) = this()
  /* InferMemberOverrides */
  override def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  /**
    * This method returns the copyright of the current data provider.
    * @param bounds {H.geo.Rect} - the bounding area for which to retrieve the copyright information
    * @param level {number} - the zoom level for which to retrieve the copyright information
    * @returns {Array<H.map.ICopyright>} - a list of copyright information objects for the provided area and zoom level
    */
  /* InferMemberOverrides */
  override def getCopyrights(bounds: typings.heremaps.H.geo.Rect, level: Double): js.Array[ICopyright] = js.native
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
  /* InferMemberOverrides */
  override def requestDomMarkers(
    boundingRect: typings.heremaps.H.geo.Rect,
    zoomLevel: Double,
    cacheOnly: Boolean,
    prioCenter: Point
  ): Response | TiledResponse = js.native
  /**
    * This method requests marker objects for provided bounding rectangle.
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
    */
  /* InferMemberOverrides */
  override def requestMarkers(
    boundingRect: typings.heremaps.H.geo.Rect,
    zoomLevel: Double,
    cacheOnly: Boolean,
    prioCenter: Point
  ): Response | TiledResponse = js.native
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

