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
  def apply(
    dataTransfers: js.Array[SchemaDataTransfer] = null,
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaDataTransfersListResponse = {
    val __obj = js.Dynamic.literal()
    if (dataTransfers != null) __obj.updateDynamic("dataTransfers")(dataTransfers.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDataTransfersListResponse]
  }
}

