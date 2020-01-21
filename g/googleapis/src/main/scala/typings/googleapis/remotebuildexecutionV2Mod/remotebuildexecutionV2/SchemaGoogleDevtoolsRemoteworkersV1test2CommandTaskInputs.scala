package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the inputs to a shell-style task.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs extends js.Object {
  /**
    * The command itself to run (e.g., argv).  This field should be passed
    * directly to the underlying operating system, and so it must be sensible
    * to that operating system. For example, on Windows, the first argument
    * might be &quot;C:\Windows\System32\ping.exe&quot; - that is, using drive
    * letters and backslashes. A command for a *nix system, on the other hand,
    * would use forward slashes.  All other fields in the RWAPI must
    * consistently use forward slashes, since those fields may be interpretted
    * by both the service and the bot.
    */
  var arguments: js.UndefOr[js.Array[String]] = js.native
  /**
    * All environment variables required by the task.
    */
  var environmentVariables: js.UndefOr[
    js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable]
  ] = js.native
  /**
    * The input filesystem to be set up prior to the task beginning. The
    * contents should be a repeated set of FileMetadata messages though other
    * formats are allowed if better for the implementation (eg, a LUCI-style
    * .isolated file).  This field is repeated since implementations might want
    * to cache the metadata, in which case it may be useful to break up
    * portions of the filesystem that change frequently (eg, specific input
    * files) from those that don&#39;t (eg, standard header files).
    */
  var files: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2Digest]] = js.native
  /**
    * Inline contents for blobs expected to be needed by the bot to execute the
    * task. For example, contents of entries in `files` or blobs that are
    * indirectly referenced by an entry there.  The bot should check against
    * this list before downloading required task inputs to reduce the number of
    * communications between itself and the remote CAS server.
    */
  var inlineBlobs: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2Blob]] = js.native
  /**
    * Directory from which a command is executed. It is a relative directory
    * with respect to the bot&#39;s working directory (i.e., &quot;./&quot;).
    * If it is non-empty, then it must exist under &quot;./&quot;. Otherwise,
    * &quot;./&quot; will be used.
    */
  var workingDirectory: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs {
  @scala.inline
  def apply(
    arguments: js.Array[String] = null,
    environmentVariables: js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable] = null,
    files: js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2Digest] = null,
    inlineBlobs: js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2Blob] = null,
    workingDirectory: String = null
  ): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (inlineBlobs != null) __obj.updateDynamic("inlineBlobs")(inlineBlobs.asInstanceOf[js.Any])
    if (workingDirectory != null) __obj.updateDynamic("workingDirectory")(workingDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs]
  }
}

