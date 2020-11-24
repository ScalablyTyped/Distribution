package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputsOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs] (val x: Self) extends AnyVal {
    
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
    def setDirectoriesVarargs(value: String*): Self = this.set("directories", js.Array(value :_*))
    
    @scala.inline
    def setDirectories(value: js.Array[String]): Self = this.set("directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectories: Self = this.set("directories", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setStderrDestination(value: String): Self = this.set("stderrDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStderrDestination: Self = this.set("stderrDestination", js.undefined)
    
    @scala.inline
    def setStdoutDestination(value: String): Self = this.set("stdoutDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdoutDestination: Self = this.set("stdoutDestination", js.undefined)
  }
}
