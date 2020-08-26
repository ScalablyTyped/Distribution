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
  def apply(): SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponseOps[Self <: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse] (val x: Self) extends AnyVal {
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
    def setDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = this.set("digest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
    @scala.inline
    def setStatus(value: SchemaGoogleRpcStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

