package typings.heremaps.HNs.mapNs.layerNs

import typings.heremaps.HNs.mapNs.layerNs.IMarkerLayerNs.Response
import typings.heremaps.HNs.mapNs.layerNs.IMarkerLayerNs.TiledResponse
import typings.heremaps.HNs.mathNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface describes a layer which provides marker objects to the renderer.
  */
trait IMarkerLayer extends js.Object {
  /**
    * This method requests dom marker objects for provided bounding rectangle.
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
    */
  def requestDomMarkers(
    boundingRect: typings.heremaps.HNs.geoNs.Rect,
    zoomLevel: Double,
    cacheOnly: Boolean,
    prioCenter: Point
  ): Response | TiledResponse
  /**
    * This method requests marker objects for provided bounding rectangle.
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
    */
  def requestMarkers(
    boundingRect: typings.heremaps.HNs.geoNs.Rect,
    zoomLevel: Double,
    cacheOnly: Boolean,
    prioCenter: Point
  ): Response | TiledResponse
}

object IMarkerLayer {
  @scala.inline
  def apply(
    requestDomMarkers: (typings.heremaps.HNs.geoNs.Rect, Double, Boolean, Point) => Response | TiledResponse,
    requestMarkers: (typings.heremaps.HNs.geoNs.Rect, Double, Boolean, Point) => Response | TiledResponse
  ): IMarkerLayer = {
    val __obj = js.Dynamic.literal(requestDomMarkers = js.Any.fromFunction4(requestDomMarkers), requestMarkers = js.Any.fromFunction4(requestMarkers))
  
    __obj.asInstanceOf[IMarkerLayer]
  }
}

