package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceDetailsRequest extends js.Object {
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var placeId: java.lang.String
  var sessionToken: js.UndefOr[AutocompleteSessionToken] = js.undefined
}

object PlaceDetailsRequest {
  @scala.inline
  def apply(
    placeId: java.lang.String,
    fields: js.Array[java.lang.String] = null,
    sessionToken: AutocompleteSessionToken = null
  ): PlaceDetailsRequest = {
    val __obj = js.Dynamic.literal(placeId = placeId)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    __obj.asInstanceOf[PlaceDetailsRequest]
  }
}

