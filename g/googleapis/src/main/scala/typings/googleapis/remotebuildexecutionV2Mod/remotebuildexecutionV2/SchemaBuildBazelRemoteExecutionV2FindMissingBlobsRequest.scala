package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request message for ContentAddressableStorage.FindMissingBlobs.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest extends js.Object {
  /**
    * A list of the blobs to check.
    */
  var blobDigests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Digest]] = js.native
}

object SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest {
  @scala.inline
  def apply(blobDigests: js.Array[SchemaBuildBazelRemoteExecutionV2Digest] = null): SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest = {
    val __obj = js.Dynamic.literal()
    if (blobDigests != null) __obj.updateDynamic("blobDigests")(blobDigests.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest]
  }
}

