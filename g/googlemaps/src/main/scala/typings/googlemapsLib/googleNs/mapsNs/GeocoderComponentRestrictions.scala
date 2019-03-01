package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderComponentRestrictions extends js.Object {
  var administrativeArea: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var locality: js.UndefOr[java.lang.String] = js.undefined
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  var route: js.UndefOr[java.lang.String] = js.undefined
}

object GeocoderComponentRestrictions {
  @scala.inline
  def apply(
    administrativeArea: java.lang.String = null,
    country: java.lang.String | js.Array[java.lang.String] = null,
    locality: java.lang.String = null,
    postalCode: java.lang.String = null,
    route: java.lang.String = null
  ): GeocoderComponentRestrictions = {
    val __obj = js.Dynamic.literal()
    if (administrativeArea != null) __obj.updateDynamic("administrativeArea")(administrativeArea)
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (route != null) __obj.updateDynamic("route")(route)
    __obj.asInstanceOf[GeocoderComponentRestrictions]
  }
}

