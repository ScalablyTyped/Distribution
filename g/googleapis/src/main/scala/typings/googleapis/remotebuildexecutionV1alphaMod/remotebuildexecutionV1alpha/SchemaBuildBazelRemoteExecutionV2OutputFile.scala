package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An `OutputFile` is similar to a FileNode, but it is used as an output in an
  * `ActionResult`. It allows a full file path rather than only a name.
  * `OutputFile` is binary-compatible with `FileNode`.
  */
trait SchemaBuildBazelRemoteExecutionV2OutputFile extends StObject {
  
  /**
    * The digest of the file&#39;s content.
    */
  var digest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /**
    * True if file is executable, false otherwise.
    */
  var isExecutable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The full path of the file relative to the working directory, including
    * the filename. The path separator is a forward slash `/`. Since this is a
    * relative path, it MUST NOT begin with a leading forward slash.
    */
  var path: js.UndefOr[String] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2OutputFile {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2OutputFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2OutputFile]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2OutputFileMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2OutputFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setIsExecutable(value: Boolean): Self = StObject.set(x, "isExecutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExecutableUndefined: Self = StObject.set(x, "isExecutable", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
