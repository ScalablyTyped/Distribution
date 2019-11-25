package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceDetailsRequest extends js.Object {
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var placeId: String
  var sessionToken: js.UndefOr[AutocompleteSessionToken] = js.undefined
}

object PlaceDetailsRequest {
  @scala.inline
  def apply(placeId: String, fields: js.Array[String] = null, sessionToken: AutocompleteSessionToken = null): PlaceDetailsRequest = {
    val __obj = js.Dynamic.literal(placeId = placeId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceDetailsRequest]
  }
}

