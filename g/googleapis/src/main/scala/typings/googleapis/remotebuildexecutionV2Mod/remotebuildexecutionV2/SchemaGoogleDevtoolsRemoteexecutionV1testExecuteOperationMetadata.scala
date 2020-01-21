package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about an ongoing execution, which will be contained in the
  * metadata field of the Operation.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata extends js.Object {
  /**
    * The digest of the Action being executed.
    */
  var actionDigest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.native
  var stage: js.UndefOr[String] = js.native
  /**
    * If set, the client can use this name with ByteStream.Read to stream the
    * standard error.
    */
  var stderrStreamName: js.UndefOr[String] = js.native
  /**
    * If set, the client can use this name with ByteStream.Read to stream the
    * standard output.
    */
  var stdoutStreamName: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata {
  @scala.inline
  def apply(
    actionDigest: SchemaGoogleDevtoolsRemoteexecutionV1testDigest = null,
    stage: String = null,
    stderrStreamName: String = null,
    stdoutStreamName: String = null
  ): SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (actionDigest != null) __obj.updateDynamic("actionDigest")(actionDigest.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (stderrStreamName != null) __obj.updateDynamic("stderrStreamName")(stderrStreamName.asInstanceOf[js.Any])
    if (stdoutStreamName != null) __obj.updateDynamic("stdoutStreamName")(stdoutStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata]
  }
}

