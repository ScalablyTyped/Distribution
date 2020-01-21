package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request message for ContentAddressableStorage.BatchReadBlobs.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest extends js.Object {
  /**
    * The individual blob digests.
    */
  var digests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Digest]] = js.native
}

object SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest {
  @scala.inline
  def apply(digests: js.Array[SchemaBuildBazelRemoteExecutionV2Digest] = null): SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest = {
    val __obj = js.Dynamic.literal()
    if (digests != null) __obj.updateDynamic("digests")(digests.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest]
  }
}

