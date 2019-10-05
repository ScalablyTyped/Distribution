package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewPanoRequest extends js.Object {
  var pano: String
}

object StreetViewPanoRequest {
  @scala.inline
  def apply(pano: String): StreetViewPanoRequest = {
    val __obj = js.Dynamic.literal(pano = pano)
  
    __obj.asInstanceOf[StreetViewPanoRequest]
  }
}

