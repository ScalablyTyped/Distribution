package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response containing a partial list of manifests and a page token used to
  * build the next request if the request has been truncated.
  */
@js.native
trait SchemaManifestsListResponse extends js.Object {
  /**
    * Output only. Manifests contained in this list response.
    */
  var manifests: js.UndefOr[js.Array[SchemaManifest]] = js.native
  /**
    * Output only. A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaManifestsListResponse {
  @scala.inline
  def apply(): SchemaManifestsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManifestsListResponse]
  }
  @scala.inline
  implicit class SchemaManifestsListResponseOps[Self <: SchemaManifestsListResponse] (val x: Self) extends AnyVal {
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
    def setManifestsVarargs(value: SchemaManifest*): Self = this.set("manifests", js.Array(value :_*))
    @scala.inline
    def setManifests(value: js.Array[SchemaManifest]): Self = this.set("manifests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifests: Self = this.set("manifests", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

