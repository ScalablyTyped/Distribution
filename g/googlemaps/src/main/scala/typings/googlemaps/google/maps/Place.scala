package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Place extends js.Object {
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var placeId: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
}

object Place {
  @scala.inline
  def apply(location: LatLng | LatLngLiteral = null, placeId: String = null, query: String = null): Place = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (placeId != null) __obj.updateDynamic("placeId")(placeId.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Place]
  }
}

