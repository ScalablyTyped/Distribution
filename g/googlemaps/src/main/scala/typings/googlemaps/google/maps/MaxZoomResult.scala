package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxZoomResult extends js.Object {
  var status: MaxZoomStatus
  var zoom: Double
}

object MaxZoomResult {
  @scala.inline
  def apply(status: MaxZoomStatus, zoom: Double): MaxZoomResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MaxZoomResult]
  }
}

