package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message for ContentAddressableStorage.FindMissingBlobs.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse extends js.Object {
  /**
    * A list of the blobs requested *not* present in the storage.
    */
  var missingBlobDigests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Digest]] = js.native
}

object SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse {
  @scala.inline
  def apply(missingBlobDigests: js.Array[SchemaBuildBazelRemoteExecutionV2Digest] = null): SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse = {
    val __obj = js.Dynamic.literal()
    if (missingBlobDigests != null) __obj.updateDynamic("missingBlobDigests")(missingBlobDigests.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse]
  }
}

