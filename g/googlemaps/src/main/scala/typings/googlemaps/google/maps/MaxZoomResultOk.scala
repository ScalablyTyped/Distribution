package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.MaxZoomStatus.OK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link MaxZoomResult}
  * @see {@link MaxZoomResultError}
  */
trait MaxZoomResultOk extends MaxZoomResult {
  /**
    * Status of the request.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/max-zoom#MaxZoomResult.status Maps JavaScript API}
    * @see {@link MaxZoomResultError#status}
    */
  var status: OK
  /**
    * The maximum zoom level found at the given {@link LatLng}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/max-zoom#MaxZoomResult.zoom Maps JavaScript API}
    */
  var zoom: Double
}

object MaxZoomResultOk {
  @scala.inline
  def apply(status: OK, zoom: Double): MaxZoomResultOk = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxZoomResultOk]
  }
}

