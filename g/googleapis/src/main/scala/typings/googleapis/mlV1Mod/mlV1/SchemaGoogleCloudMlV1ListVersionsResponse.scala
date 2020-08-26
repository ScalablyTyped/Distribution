package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the ListVersions method.
  */
@js.native
trait SchemaGoogleCloudMlV1ListVersionsResponse extends js.Object {
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of versions.
    */
  var versions: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Version]] = js.native
}

object SchemaGoogleCloudMlV1ListVersionsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ListVersionsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1ListVersionsResponseOps[Self <: SchemaGoogleCloudMlV1ListVersionsResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setVersionsVarargs(value: SchemaGoogleCloudMlV1Version*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: js.Array[SchemaGoogleCloudMlV1Version]): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
  
}

