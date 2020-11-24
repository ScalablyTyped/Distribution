package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An optional Metadata to attach to any RPC request to tell the server about
  * an external context of the request. The server may use this for logging or
  * other purposes. To use it, the client attaches the header to the call using
  * the canonical proto serialization:  * name:
  * `build.bazel.remote.execution.v2.requestmetadata-bin` * contents: the
  * base64 encoded binary `RequestMetadata` message.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2RequestMetadata extends js.Object {
  
  /**
    * An identifier that ties multiple requests to the same action. For
    * example, multiple requests to the CAS, Action Cache, and Execution API
    * are used in order to compile foo.cc.
    */
  var actionId: js.UndefOr[String] = js.native
  
  /**
    * An identifier to tie multiple tool invocations together. For example,
    * runs of foo_test, bar_test and baz_test on a post-submit of a given
    * patch.
    */
  var correlatedInvocationsId: js.UndefOr[String] = js.native
  
  /**
    * The details for the tool invoking the requests.
    */
  var toolDetails: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ToolDetails] = js.native
  
  /**
    * An identifier that ties multiple actions together to a final result. For
    * example, multiple actions are required to build and run foo_test.
    */
  var toolInvocationId: js.UndefOr[String] = js.native
}
object SchemaBuildBazelRemoteExecutionV2RequestMetadata {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2RequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2RequestMetadata]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2RequestMetadataOps[Self <: SchemaBuildBazelRemoteExecutionV2RequestMetadata] (val x: Self) extends AnyVal {
    
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
    def setActionId(value: String): Self = this.set("actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionId: Self = this.set("actionId", js.undefined)
    
    @scala.inline
    def setCorrelatedInvocationsId(value: String): Self = this.set("correlatedInvocationsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrelatedInvocationsId: Self = this.set("correlatedInvocationsId", js.undefined)
    
    @scala.inline
    def setToolDetails(value: SchemaBuildBazelRemoteExecutionV2ToolDetails): Self = this.set("toolDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolDetails: Self = this.set("toolDetails", js.undefined)
    
    @scala.inline
    def setToolInvocationId(value: String): Self = this.set("toolInvocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolInvocationId: Self = this.set("toolInvocationId", js.undefined)
  }
}
