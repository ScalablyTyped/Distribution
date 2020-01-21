package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about an ongoing execution, which will be contained in the
  * metadata field of the Operation.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadata extends js.Object {
  /**
    * The digest of the Action being executed.
    */
  var actionDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
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

object SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadata {
  @scala.inline
  def apply(
    actionDigest: SchemaBuildBazelRemoteExecutionV2Digest = null,
    stage: String = null,
    stderrStreamName: String = null,
    stdoutStreamName: String = null
  ): SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (actionDigest != null) __obj.updateDynamic("actionDigest")(actionDigest.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (stderrStreamName != null) __obj.updateDynamic("stderrStreamName")(stderrStreamName.asInstanceOf[js.Any])
    if (stdoutStreamName != null) __obj.updateDynamic("stdoutStreamName")(stdoutStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadata]
  }
}

