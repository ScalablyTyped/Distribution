package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceDetailsRequest extends js.Object {
  var fields: js.UndefOr[js.Array[String]] = js.native
  var placeId: String = js.native
  var sessionToken: js.UndefOr[AutocompleteSessionToken] = js.native
}

object PlaceDetailsRequest {
  @scala.inline
  def apply(placeId: String): PlaceDetailsRequest = {
    val __obj = js.Dynamic.literal(placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceDetailsRequest]
  }
  @scala.inline
  implicit class PlaceDetailsRequestOps[Self <: PlaceDetailsRequest] (val x: Self) extends AnyVal {
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
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setSessionToken(value: AutocompleteSessionToken): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionToken: Self = this.set("sessionToken", js.undefined)
  }
  
}

