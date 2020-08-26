package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

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
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadataOps[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata] (val x: Self) extends AnyVal {
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
    def setActionDigest(value: SchemaGoogleDevtoolsRemoteexecutionV1testDigest): Self = this.set("actionDigest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionDigest: Self = this.set("actionDigest", js.undefined)
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
    @scala.inline
    def setStderrStreamName(value: String): Self = this.set("stderrStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStderrStreamName: Self = this.set("stderrStreamName", js.undefined)
    @scala.inline
    def setStdoutStreamName(value: String): Self = this.set("stdoutStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdoutStreamName: Self = this.set("stdoutStreamName", js.undefined)
  }
  
}

