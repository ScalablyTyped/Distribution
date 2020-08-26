package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Execution.Execute, which will be contained in the
  * response field of the Operation.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testExecuteResponse extends js.Object {
  /**
    * True if the result was served from cache, false if it was executed.
    */
  var cachedResult: js.UndefOr[Boolean] = js.native
  /**
    * The result of the action.
    */
  var result: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testActionResult] = js.native
  /**
    * An optional list of additional log outputs the server wishes to provide.
    * A server can use this to return execution-specific logs however it
    * wishes. This is intended primarily to make it easier for users to debug
    * issues that may be outside of the actual job execution, such as by
    * identifying the worker executing the action or by providing logs from the
    * worker&#39;s setup phase. The keys SHOULD be human readable so that a
    * client can display them to a user.
    */
  var serverLogs: js.UndefOr[StringDictionary[SchemaGoogleDevtoolsRemoteexecutionV1testLogFile]] = js.native
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

object SchemaGoogleDevtoolsRemoteexecutionV1testExecuteResponse {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testExecuteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testExecuteResponse]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testExecuteResponseOps[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testExecuteResponse] (val x: Self) extends AnyVal {
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
    def setResult(value: SchemaGoogleDevtoolsRemoteexecutionV1testActionResult): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setServerLogs(value: StringDictionary[SchemaGoogleDevtoolsRemoteexecutionV1testLogFile]): Self = this.set("serverLogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerLogs: Self = this.set("serverLogs", js.undefined)
    @scala.inline
    def setStatus(value: SchemaGoogleRpcStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

