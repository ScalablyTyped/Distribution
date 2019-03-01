package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewLocation extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var latLng: js.UndefOr[LatLng] = js.undefined
  var pano: js.UndefOr[java.lang.String] = js.undefined
  var shortDescription: js.UndefOr[java.lang.String] = js.undefined
}

object StreetViewLocation {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    latLng: LatLng = null,
    pano: java.lang.String = null,
    shortDescription: java.lang.String = null
  ): StreetViewLocation = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (latLng != null) __obj.updateDynamic("latLng")(latLng)
    if (pano != null) __obj.updateDynamic("pano")(pano)
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription)
    __obj.asInstanceOf[StreetViewLocation]
  }
}

