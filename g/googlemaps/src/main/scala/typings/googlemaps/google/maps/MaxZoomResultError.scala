package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.MaxZoomStatus.ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link MaxZoomResult}
  * @see {@link MaxZoomResultOk}
  */
trait MaxZoomResultError extends MaxZoomResult {
  /**
    * Status of the request.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/max-zoom#MaxZoomResult.status Maps JavaScript API}
    * @see {@link MaxZoomResultOk#status}
    */
  var status: ERROR
}

object MaxZoomResultError {
  @scala.inline
  def apply(status: ERROR): MaxZoomResultError = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxZoomResultError]
  }
}

