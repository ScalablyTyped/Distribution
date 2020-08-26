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
  def apply(): SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestOps[Self <: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest] (val x: Self) extends AnyVal {
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
    def setRequestsVarargs(value: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest*): Self = this.set("requests", js.Array(value :_*))
    @scala.inline
    def setRequests(value: js.Array[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]): Self = this.set("requests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
  }
  
}

