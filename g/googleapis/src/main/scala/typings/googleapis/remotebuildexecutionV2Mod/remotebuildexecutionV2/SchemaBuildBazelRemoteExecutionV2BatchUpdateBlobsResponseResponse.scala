package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response corresponding to a single blob that the client tried to upload.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse extends js.Object {
  /**
    * The blob digest to which this response corresponds.
    */
  var digest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
  /**
    * The result of attempting to upload that blob.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.native
}

object SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse {
  @scala.inline
  def apply(digest: SchemaBuildBazelRemoteExecutionV2Digest = null, status: SchemaGoogleRpcStatus = null): SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse]
  }
}

