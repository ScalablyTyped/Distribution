package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request message for ContentAddressableStorage.BatchUpdateBlobs.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest extends js.Object {
  /**
    * The individual upload requests.
    */
  var requests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]] = js.native
}

object SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest {
  @scala.inline
  def apply(requests: js.Array[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest] = null): SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest]
  }
}

