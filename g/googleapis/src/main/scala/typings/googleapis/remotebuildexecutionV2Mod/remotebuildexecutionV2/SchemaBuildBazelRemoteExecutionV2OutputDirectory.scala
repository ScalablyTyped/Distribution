package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An `OutputDirectory` is the output in an `ActionResult` corresponding to a
  * directory&#39;s full contents rather than a single file.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2OutputDirectory extends StObject {
  
  /**
    * The full path of the directory relative to the working directory. The
    * path separator is a forward slash `/`. Since this is a relative path, it
    * MUST NOT begin with a leading forward slash. The empty string value is
    * allowed, and it denotes the entire working directory.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The digest of the encoded Tree proto containing the directory&#39;s
    * contents.
    */
  var treeDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
}
object SchemaBuildBazelRemoteExecutionV2OutputDirectory {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2OutputDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2OutputDirectory]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2OutputDirectoryMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2OutputDirectory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTreeDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "treeDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDigestUndefined: Self = StObject.set(x, "treeDigest", js.undefined)
  }
}
