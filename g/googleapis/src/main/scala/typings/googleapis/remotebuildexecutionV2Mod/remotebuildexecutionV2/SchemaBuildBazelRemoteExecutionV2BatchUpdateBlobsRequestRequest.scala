package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request corresponding to a single blob that the client wants to upload.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest extends js.Object {
  /**
    * The raw binary data.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The digest of the blob. This MUST be the digest of `data`.
    */
  var digest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
}

object SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequestOps[Self <: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = this.set("digest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
  }
  
}

