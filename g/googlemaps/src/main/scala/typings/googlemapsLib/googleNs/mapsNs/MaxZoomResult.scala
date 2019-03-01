package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxZoomResult extends js.Object {
  var status: MaxZoomStatus
  var zoom: scala.Double
}

object MaxZoomResult {
  @scala.inline
  def apply(status: MaxZoomStatus, zoom: scala.Double): MaxZoomResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[MaxZoomResult]
  }
}

