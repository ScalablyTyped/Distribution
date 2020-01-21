package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the expected outputs of the command.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs extends js.Object {
  /**
    * A list of expected directories, relative to the execution root. All paths
    * MUST be delimited by forward slashes.
    */
  var directories: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of expected files, relative to the execution root. All paths MUST
    * be delimited by forward slashes.
    */
  var files: js.UndefOr[js.Array[String]] = js.native
  /**
    * The destination to which any stderr should be sent. The method by which
    * the bot should send the stream contents to that destination is not
    * defined in this API. As examples, the destination could be a file
    * referenced in the `files` field in this message, or it could be a URI
    * that must be written via the ByteStream API.
    */
  var stderrDestination: js.UndefOr[String] = js.native
  /**
    * The destination to which any stdout should be sent. The method by which
    * the bot should send the stream contents to that destination is not
    * defined in this API. As examples, the destination could be a file
    * referenced in the `files` field in this message, or it could be a URI
    * that must be written via the ByteStream API.
    */
  var stdoutDestination: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs {
  @scala.inline
  def apply(
    directories: js.Array[String] = null,
    files: js.Array[String] = null,
    stderrDestination: String = null,
    stdoutDestination: String = null
  ): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs = {
    val __obj = js.Dynamic.literal()
    if (directories != null) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (stderrDestination != null) __obj.updateDynamic("stderrDestination")(stderrDestination.asInstanceOf[js.Any])
    if (stdoutDestination != null) __obj.updateDynamic("stdoutDestination")(stdoutDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs]
  }
}

