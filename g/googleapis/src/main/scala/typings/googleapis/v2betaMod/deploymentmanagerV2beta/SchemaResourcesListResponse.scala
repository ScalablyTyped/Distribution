package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response containing a partial list of resources and a page token used to
  * build the next request if the request has been truncated.
  */
@js.native
trait SchemaResourcesListResponse extends js.Object {
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Resources contained in this list response.
    */
  var resources: js.UndefOr[js.Array[SchemaResource]] = js.native
}

object SchemaResourcesListResponse {
  @scala.inline
  def apply(): SchemaResourcesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcesListResponse]
  }
  @scala.inline
  implicit class SchemaResourcesListResponseOps[Self <: SchemaResourcesListResponse] (val x: Self) extends AnyVal {
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
    def setResourcesVarargs(value: SchemaResource*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[SchemaResource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
  }
  
}

