package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs] (val x: Self) extends AnyVal {
    
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
    def setArgumentsVarargs(value: String*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[String]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setEnvironmentVariablesVarargs(value: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable*): Self = this.set("environmentVariables", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentVariables(value: js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable]): Self = this.set("environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentVariables: Self = this.set("environmentVariables", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: SchemaGoogleDevtoolsRemoteworkersV1test2Digest*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2Digest]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setInlineBlobsVarargs(value: SchemaGoogleDevtoolsRemoteworkersV1test2Blob*): Self = this.set("inlineBlobs", js.Array(value :_*))
    
    @scala.inline
    def setInlineBlobs(value: js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2Blob]): Self = this.set("inlineBlobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineBlobs: Self = this.set("inlineBlobs", js.undefined)
    
    @scala.inline
    def setWorkingDirectory(value: String): Self = this.set("workingDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkingDirectory: Self = this.set("workingDirectory", js.undefined)
  }
}
