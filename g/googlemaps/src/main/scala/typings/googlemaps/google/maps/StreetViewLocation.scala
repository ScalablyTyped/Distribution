package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewLocation extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var latLng: js.UndefOr[LatLng] = js.undefined
  var pano: js.UndefOr[String] = js.undefined
  var shortDescription: js.UndefOr[String] = js.undefined
}

object StreetViewLocation {
  @scala.inline
  def apply(
    description: String = null,
    latLng: LatLng = null,
    pano: String = null,
    shortDescription: String = null
  ): StreetViewLocation = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (latLng != null) __obj.updateDynamic("latLng")(latLng.asInstanceOf[js.Any])
    if (pano != null) __obj.updateDynamic("pano")(pano.asInstanceOf[js.Any])
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewLocation]
  }
}

