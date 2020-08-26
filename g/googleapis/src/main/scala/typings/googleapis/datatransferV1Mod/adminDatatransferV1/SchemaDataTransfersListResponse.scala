package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for a collection of DataTransfer resources.
  */
@js.native
trait SchemaDataTransfersListResponse extends js.Object {
  /**
    * List of data transfer requests.
    */
  var dataTransfers: js.UndefOr[js.Array[SchemaDataTransfer]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a collection of data transfer requests.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Continuation token which will be used to specify next page in list API.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaDataTransfersListResponse {
  @scala.inline
  def apply(): SchemaDataTransfersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataTransfersListResponse]
  }
  @scala.inline
  implicit class SchemaDataTransfersListResponseOps[Self <: SchemaDataTransfersListResponse] (val x: Self) extends AnyVal {
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
    def setDataTransfersVarargs(value: SchemaDataTransfer*): Self = this.set("dataTransfers", js.Array(value :_*))
    @scala.inline
    def setDataTransfers(value: js.Array[SchemaDataTransfer]): Self = this.set("dataTransfers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTransfers: Self = this.set("dataTransfers", js.undefined)
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

