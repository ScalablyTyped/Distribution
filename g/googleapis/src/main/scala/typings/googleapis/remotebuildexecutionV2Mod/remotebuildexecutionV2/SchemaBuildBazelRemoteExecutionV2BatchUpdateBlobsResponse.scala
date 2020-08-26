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
  def apply(): SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseOps[Self <: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse] (val x: Self) extends AnyVal {
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
    def setResponsesVarargs(value: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse*): Self = this.set("responses", js.Array(value :_*))
    @scala.inline
    def setResponses(value: js.Array[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse]): Self = this.set("responses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
  }
  
}

