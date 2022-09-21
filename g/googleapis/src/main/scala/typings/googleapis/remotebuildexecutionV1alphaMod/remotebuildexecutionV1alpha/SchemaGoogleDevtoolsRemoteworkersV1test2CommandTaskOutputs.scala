package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs extends StObject {
  
  /**
    * A list of expected directories, relative to the execution root. All paths MUST be delimited by forward slashes.
    */
  var directories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of expected files, relative to the execution root. All paths MUST be delimited by forward slashes.
    */
  var files: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The destination to which any stderr should be sent. The method by which the bot should send the stream contents to that destination is not defined in this API. As examples, the destination could be a file referenced in the `files` field in this message, or it could be a URI that must be written via the ByteStream API.
    */
  var stderrDestination: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The destination to which any stdout should be sent. The method by which the bot should send the stream contents to that destination is not defined in this API. As examples, the destination could be a file referenced in the `files` field in this message, or it could be a URI that must be written via the ByteStream API.
    */
  var stdoutDestination: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs {
  
  inline def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs](x: Self) {
    
    inline def setDirectories(value: js.Array[String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesNull: Self = StObject.set(x, "directories", null)
    
    inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    inline def setDirectoriesVarargs(value: String*): Self = StObject.set(x, "directories", js.Array(value*))
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesNull: Self = StObject.set(x, "files", null)
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setStderrDestination(value: String): Self = StObject.set(x, "stderrDestination", value.asInstanceOf[js.Any])
    
    inline def setStderrDestinationNull: Self = StObject.set(x, "stderrDestination", null)
    
    inline def setStderrDestinationUndefined: Self = StObject.set(x, "stderrDestination", js.undefined)
    
    inline def setStdoutDestination(value: String): Self = StObject.set(x, "stdoutDestination", value.asInstanceOf[js.Any])
    
    inline def setStdoutDestinationNull: Self = StObject.set(x, "stdoutDestination", null)
    
    inline def setStdoutDestinationUndefined: Self = StObject.set(x, "stdoutDestination", js.undefined)
  }
}
