package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderComponentRestrictions extends js.Object {
  var administrativeArea: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String | js.Array[String]] = js.undefined
  var locality: js.UndefOr[String] = js.undefined
  var postalCode: js.UndefOr[String] = js.undefined
  var route: js.UndefOr[String] = js.undefined
}

object GeocoderComponentRestrictions {
  @scala.inline
  def apply(
    administrativeArea: String = null,
    country: String | js.Array[String] = null,
    locality: String = null,
    postalCode: String = null,
    route: String = null
  ): GeocoderComponentRestrictions = {
    val __obj = js.Dynamic.literal()
    if (administrativeArea != null) __obj.updateDynamic("administrativeArea")(administrativeArea.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderComponentRestrictions]
  }
}

