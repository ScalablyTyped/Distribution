package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for a collection of Applications.
  */
@js.native
trait SchemaApplicationsListResponse extends js.Object {
  /**
    * List of applications that support data transfer and are also installed
    * for the customer.
    */
  var applications: js.UndefOr[js.Array[SchemaApplication]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a collection of Applications.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Continuation token which will be used to specify next page in list API.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaApplicationsListResponse {
  @scala.inline
  def apply(): SchemaApplicationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationsListResponse]
  }
  @scala.inline
  implicit class SchemaApplicationsListResponseOps[Self <: SchemaApplicationsListResponse] (val x: Self) extends AnyVal {
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
    def setApplicationsVarargs(value: SchemaApplication*): Self = this.set("applications", js.Array(value :_*))
    @scala.inline
    def setApplications(value: js.Array[SchemaApplication]): Self = this.set("applications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplications: Self = this.set("applications", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

