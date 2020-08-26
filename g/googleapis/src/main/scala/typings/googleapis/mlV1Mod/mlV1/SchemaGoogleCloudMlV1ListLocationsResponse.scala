package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleCloudMlV1ListLocationsResponse extends js.Object {
  /**
    * Locations where at least one type of CMLE capability is available.
    */
  var locations: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Location]] = js.native
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1ListLocationsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1ListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ListLocationsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1ListLocationsResponseOps[Self <: SchemaGoogleCloudMlV1ListLocationsResponse] (val x: Self) extends AnyVal {
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
    def setLocationsVarargs(value: SchemaGoogleCloudMlV1Location*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[SchemaGoogleCloudMlV1Location]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

