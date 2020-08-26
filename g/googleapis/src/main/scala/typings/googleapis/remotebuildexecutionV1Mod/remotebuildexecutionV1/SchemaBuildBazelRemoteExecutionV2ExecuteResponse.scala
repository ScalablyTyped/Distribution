package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Execution.Execute, which will be contained in the
  * response field of the Operation.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ExecuteResponse extends js.Object {
  /**
    * True if the result was served from cache, false if it was executed.
    */
  var cachedResult: js.UndefOr[Boolean] = js.native
  /**
    * Freeform informational message with details on the execution of the
    * action that may be displayed to the user upon failure or when requested
    * explicitly.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The result of the action.
    */
  var result: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ActionResult] = js.native
  /**
    * An optional list of additional log outputs the server wishes to provide.
    * A server can use this to return execution-specific logs however it
    * wishes. This is intended primarily to make it easier for users to debug
    * issues that may be outside of the actual job execution, such as by
    * identifying the worker executing the action or by providing logs from the
    * worker&#39;s setup phase. The keys SHOULD be human readable so that a
    * client can display them to a user.
    */
  var serverLogs: js.UndefOr[StringDictionary[SchemaBuildBazelRemoteExecutionV2LogFile]] = js.native
  /**
    * If the status has a code other than `OK`, it indicates that the action
    * did not finish execution. For example, if the operation times out during
    * execution, the status will have a `DEADLINE_EXCEEDED` code. Servers MUST
    * use this field for errors in execution, rather than the error field on
    * the `Operation` object.  If the status code is other than `OK`, then the
    * result MUST NOT be cached. For an error status, the `result` field is
    * optional; the server may populate the output-, stdout-, and
    * stderr-related fields if it has any information available, such as the
    * stdout and stderr of a timed-out action.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.native
}

object SchemaBuildBazelRemoteExecutionV2ExecuteResponse {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ExecuteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecuteResponse]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ExecuteResponseOps[Self <: SchemaBuildBazelRemoteExecutionV2ExecuteResponse] (val x: Self) extends AnyVal {
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
    def setCachedResult(value: Boolean): Self = this.set("cachedResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachedResult: Self = this.set("cachedResult", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setResult(value: SchemaBuildBazelRemoteExecutionV2ActionResult): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setServerLogs(value: StringDictionary[SchemaBuildBazelRemoteExecutionV2LogFile]): Self = this.set("serverLogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerLogs: Self = this.set("serverLogs", js.undefined)
    @scala.inline
    def setStatus(value: SchemaGoogleRpcStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

