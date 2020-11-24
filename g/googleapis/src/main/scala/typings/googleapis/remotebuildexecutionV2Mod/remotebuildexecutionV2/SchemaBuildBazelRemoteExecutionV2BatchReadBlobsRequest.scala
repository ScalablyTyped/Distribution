package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequestOps[Self <: SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest] (val x: Self) extends AnyVal {
    
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
    def setDigestsVarargs(value: SchemaBuildBazelRemoteExecutionV2Digest*): Self = this.set("digests", js.Array(value :_*))
    
    @scala.inline
    def setDigests(value: js.Array[SchemaBuildBazelRemoteExecutionV2Digest]): Self = this.set("digests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigests: Self = this.set("digests", js.undefined)
  }
}
