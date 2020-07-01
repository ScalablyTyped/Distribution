package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

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
  def apply(
    cachedResult: js.UndefOr[Boolean] = js.undefined,
    result: SchemaGoogleDevtoolsRemoteexecutionV1testActionResult = null,
    serverLogs: StringDictionary[SchemaGoogleDevtoolsRemoteexecutionV1testLogFile] = null,
    status: SchemaGoogleRpcStatus = null
  ): SchemaGoogleDevtoolsRemoteexecutionV1testExecuteResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cachedResult)) __obj.updateDynamic("cachedResult")(cachedResult.get.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (serverLogs != null) __obj.updateDynamic("serverLogs")(serverLogs.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testExecuteResponse]
  }
}

