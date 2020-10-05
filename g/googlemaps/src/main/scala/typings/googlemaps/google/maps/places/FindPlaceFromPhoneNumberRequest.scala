package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindPlaceFromPhoneNumberRequest extends js.Object {
  var fields: js.Array[String] = js.native
  var locationBias: js.UndefOr[LocationBias] = js.native
  var phoneNumber: String = js.native
}

object FindPlaceFromPhoneNumberRequest {
  @scala.inline
  def apply(fields: js.Array[String], phoneNumber: String): FindPlaceFromPhoneNumberRequest = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceFromPhoneNumberRequest]
  }
  @scala.inline
  implicit class FindPlaceFromPhoneNumberRequestOps[Self <: FindPlaceFromPhoneNumberRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationBias(value: LocationBias): Self = this.set("locationBias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationBias: Self = this.set("locationBias", js.undefined)
  }
  
}

