package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewPanoRequest extends js.Object {
  var pano: java.lang.String
}

object StreetViewPanoRequest {
  @scala.inline
  def apply(pano: java.lang.String): StreetViewPanoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pano")(pano)
    __obj.asInstanceOf[StreetViewPanoRequest]
  }
}

