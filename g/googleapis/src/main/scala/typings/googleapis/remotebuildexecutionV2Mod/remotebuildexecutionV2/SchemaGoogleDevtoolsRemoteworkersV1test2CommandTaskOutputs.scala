package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the expected outputs of the command.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs extends StObject {
  
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
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputsMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectories(value: js.Array[String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    @scala.inline
    def setDirectoriesVarargs(value: String*): Self = StObject.set(x, "directories", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setStderrDestination(value: String): Self = StObject.set(x, "stderrDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderrDestinationUndefined: Self = StObject.set(x, "stderrDestination", js.undefined)
    
    @scala.inline
    def setStdoutDestination(value: String): Self = StObject.set(x, "stdoutDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdoutDestinationUndefined: Self = StObject.set(x, "stdoutDestination", js.undefined)
  }
}
