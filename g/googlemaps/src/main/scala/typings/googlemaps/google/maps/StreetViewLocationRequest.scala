package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewLocationRequest extends js.Object {
  var location: LatLng | LatLngLiteral
  var preference: js.UndefOr[StreetViewPreference] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[StreetViewSource] = js.undefined
}

object StreetViewLocationRequest {
  @scala.inline
  def apply(
    location: LatLng | LatLngLiteral,
    preference: StreetViewPreference = null,
    radius: Int | Double = null,
    source: StreetViewSource = null
  ): StreetViewLocationRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (preference != null) __obj.updateDynamic("preference")(preference.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewLocationRequest]
  }
}

