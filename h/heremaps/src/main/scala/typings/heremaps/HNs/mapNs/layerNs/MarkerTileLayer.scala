package typings.heremaps.HNs.mapNs.layerNs

import typings.heremaps.HNs.mapNs.layerNs.IMarkerLayerNs.Response
import typings.heremaps.HNs.mapNs.layerNs.IMarkerLayerNs.TiledResponse
import typings.heremaps.HNs.mapNs.layerNs.ITileLayerNs.Options
import typings.heremaps.HNs.mapNs.providerNs.MarkerTileProvider
import typings.heremaps.HNs.mathNs.Point
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
  /**
    * This method requests dom marker objects for provided bounding rectangle.
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
    */
  /* CompleteClass */
  override def requestDomMarkers(
    boundingRect: typings.heremaps.HNs.geoNs.Rect,
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
  /* CompleteClass */
  override def requestMarkers(
    boundingRect: typings.heremaps.HNs.geoNs.Rect,
    zoomLevel: Double,
    cacheOnly: Boolean,
    prioCenter: Point
  ): Response | TiledResponse = js.native
}

