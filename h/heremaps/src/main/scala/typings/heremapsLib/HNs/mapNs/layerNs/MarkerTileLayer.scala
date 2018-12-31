package typings
package heremapsLib.HNs.mapNs.layerNs

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
  def this(provider: heremapsLib.HNs.mapNs.providerNs.MarkerTileProvider) = this()
  def this(provider: heremapsLib.HNs.mapNs.providerNs.MarkerTileProvider, opt_options: heremapsLib.HNs.mapNs.layerNs.ITileLayerNs.Options) = this()
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
    boundingRect: heremapsLib.HNs.geoNs.Rect,
    zoomLevel: scala.Double,
    cacheOnly: scala.Boolean,
    prioCenter: heremapsLib.HNs.mathNs.Point
  ): heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.Response | heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.TiledResponse = js.native
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
    boundingRect: heremapsLib.HNs.geoNs.Rect,
    zoomLevel: scala.Double,
    cacheOnly: scala.Boolean,
    prioCenter: heremapsLib.HNs.mathNs.Point
  ): heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.Response | heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.TiledResponse = js.native
}

