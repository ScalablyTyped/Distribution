package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindPlaceFromQueryRequest extends js.Object {
  var fields: js.Array[String] = js.native
  var locationBias: js.UndefOr[LocationBias] = js.native
  var query: String = js.native
}

object FindPlaceFromQueryRequest {
  @scala.inline
  def apply(fields: js.Array[String], query: String): FindPlaceFromQueryRequest = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceFromQueryRequest]
  }
  @scala.inline
  implicit class FindPlaceFromQueryRequestOps[Self <: FindPlaceFromQueryRequest] (val x: Self) extends AnyVal {
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
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationBias(value: LocationBias): Self = this.set("locationBias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationBias: Self = this.set("locationBias", js.undefined)
  }
  
}

