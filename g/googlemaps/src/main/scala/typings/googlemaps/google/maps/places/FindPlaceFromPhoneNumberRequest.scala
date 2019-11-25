package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindPlaceFromPhoneNumberRequest extends js.Object {
  var fields: js.Array[String]
  var locationBias: js.UndefOr[LocationBias] = js.undefined
  var phoneNumber: String
}

object FindPlaceFromPhoneNumberRequest {
  @scala.inline
  def apply(fields: js.Array[String], phoneNumber: String, locationBias: LocationBias = null): FindPlaceFromPhoneNumberRequest = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    if (locationBias != null) __obj.updateDynamic("locationBias")(locationBias.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceFromPhoneNumberRequest]
  }
}

