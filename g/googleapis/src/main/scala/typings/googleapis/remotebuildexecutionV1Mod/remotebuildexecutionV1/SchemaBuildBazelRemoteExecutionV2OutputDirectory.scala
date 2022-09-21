package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2OutputDirectory extends StObject {
  
  /**
    * The full path of the directory relative to the working directory. The path separator is a forward slash `/`. Since this is a relative path, it MUST NOT begin with a leading forward slash. The empty string value is allowed, and it denotes the entire working directory.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The digest of the encoded Tree proto containing the directory's contents.
    */
  var treeDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2OutputDirectory {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2OutputDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2OutputDirectory]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2OutputDirectory](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTreeDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "treeDigest", value.asInstanceOf[js.Any])
    
    inline def setTreeDigestUndefined: Self = StObject.set(x, "treeDigest", js.undefined)
  }
}
