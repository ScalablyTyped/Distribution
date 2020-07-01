package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.MaxZoomStatus.ERROR
import typings.googlemaps.google.maps.MaxZoomStatus.OK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A MaxZoom result in JSON format retrieved from the {@link MaxZoomService}.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/max-zoom#MaxZoomResult Maps JavaScript API}
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlemaps.google.maps.MaxZoomResultError
  - typings.googlemaps.google.maps.MaxZoomResultOk
*/
trait MaxZoomResult extends js.Object

object MaxZoomResult {
  @scala.inline
  def MaxZoomResultError(status: ERROR): MaxZoomResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxZoomResult]
  }
  @scala.inline
  def MaxZoomResultOk(status: OK, zoom: Double): MaxZoomResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxZoomResult]
  }
}

