package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response corresponding to a single blob that the client tried to upload.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse extends js.Object {
  /**
    * The raw binary data.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The digest to which this response corresponds.
    */
  var digest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
  /**
    * The result of attempting to download that blob.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.native
}

object SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse {
  @scala.inline
  def apply(
    data: String = null,
    digest: SchemaBuildBazelRemoteExecutionV2Digest = null,
    status: SchemaGoogleRpcStatus = null
  ): SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]
  }
}

