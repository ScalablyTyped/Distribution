package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service for obtaining the highest zoom level at which satellite imagery is available for a given location.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/max-zoom#MaxZoomService Maps JavaScript API}
  */
@js.native
trait MaxZoomService extends js.Object {
  def getMaxZoomAtLatLng(latlng: LatLngLiteral, callback: js.Function1[/* result */ MaxZoomResult, Unit]): Unit = js.native
  /**
    * Returns the maximum zoom level for which detailed imagery is available at a particular {@link LatLng} for the
    * {@link MapTypeId.SATELLITE satellite} map type. As this request is asynchronous, you must pass a `callback`
    * function which will be executed upon completion of the request, being passed a {@link MaxZoomResult}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/max-zoom#MaxZoomService.getMaxZoomAtLatLng Maps JavaScript API}
    */
  def getMaxZoomAtLatLng(latlng: LatLng, callback: js.Function1[/* result */ MaxZoomResult, Unit]): Unit = js.native
}

