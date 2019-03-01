package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindPlaceFromPhoneNumberRequest extends js.Object {
  var fields: js.Array[java.lang.String]
  var locationBias: js.UndefOr[LocationBias] = js.undefined
  var phoneNumber: java.lang.String
}

object FindPlaceFromPhoneNumberRequest {
  @scala.inline
  def apply(
    fields: js.Array[java.lang.String],
    phoneNumber: java.lang.String,
    locationBias: LocationBias = null
  ): FindPlaceFromPhoneNumberRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (locationBias != null) __obj.updateDynamic("locationBias")(locationBias.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceFromPhoneNumberRequest]
  }
}

