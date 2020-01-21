package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message for ContentAddressableStorage.BatchReadBlobs.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse extends js.Object {
  /**
    * The responses to the requests.
    */
  var responses: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]] = js.native
}

object SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse {
  @scala.inline
  def apply(responses: js.Array[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse] = null): SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse]
  }
}

