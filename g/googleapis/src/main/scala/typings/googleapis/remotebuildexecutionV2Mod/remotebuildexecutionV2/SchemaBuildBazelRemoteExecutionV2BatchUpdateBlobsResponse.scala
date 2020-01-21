package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message for ContentAddressableStorage.BatchUpdateBlobs.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse extends js.Object {
  /**
    * The responses to the requests.
    */
  var responses: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse]] = js.native
}

object SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse {
  @scala.inline
  def apply(responses: js.Array[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse] = null): SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse]
  }
}

