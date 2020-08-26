package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request message for Execution.Execute.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ExecuteRequest extends js.Object {
  /**
    * The digest of the Action to execute.
    */
  var actionDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
  /**
    * An optional policy for execution of the action. The server will have a
    * default policy if this is not provided.
    */
  var executionPolicy: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ExecutionPolicy] = js.native
  /**
    * An optional policy for the results of this execution in the remote cache.
    * The server will have a default policy if this is not provided. This may
    * be applied to both the ActionResult and the associated blobs.
    */
  var resultsCachePolicy: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ResultsCachePolicy] = js.native
  /**
    * If true, the action will be executed anew even if its result was already
    * present in the cache. If false, the result may be served from the
    * ActionCache.
    */
  var skipCacheLookup: js.UndefOr[Boolean] = js.native
}

object SchemaBuildBazelRemoteExecutionV2ExecuteRequest {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ExecuteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecuteRequest]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ExecuteRequestOps[Self <: SchemaBuildBazelRemoteExecutionV2ExecuteRequest] (val x: Self) extends AnyVal {
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
    def setActionDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = this.set("actionDigest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionDigest: Self = this.set("actionDigest", js.undefined)
    @scala.inline
    def setExecutionPolicy(value: SchemaBuildBazelRemoteExecutionV2ExecutionPolicy): Self = this.set("executionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionPolicy: Self = this.set("executionPolicy", js.undefined)
    @scala.inline
    def setResultsCachePolicy(value: SchemaBuildBazelRemoteExecutionV2ResultsCachePolicy): Self = this.set("resultsCachePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultsCachePolicy: Self = this.set("resultsCachePolicy", js.undefined)
    @scala.inline
    def setSkipCacheLookup(value: Boolean): Self = this.set("skipCacheLookup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipCacheLookup: Self = this.set("skipCacheLookup", js.undefined)
  }
  
}

