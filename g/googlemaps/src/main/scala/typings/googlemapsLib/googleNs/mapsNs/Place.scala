package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Place extends js.Object {
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var placeId: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
}

object Place {
  @scala.inline
  def apply(
    location: LatLng | LatLngLiteral = null,
    placeId: java.lang.String = null,
    query: java.lang.String = null
  ): Place = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (placeId != null) __obj.updateDynamic("placeId")(placeId)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Place]
  }
}

