package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse extends StObject {
  
  /**
    * A list of the blobs requested *not* present in the storage.
    */
  var missingBlobDigests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Digest]] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse](x: Self) {
    
    inline def setMissingBlobDigests(value: js.Array[SchemaBuildBazelRemoteExecutionV2Digest]): Self = StObject.set(x, "missingBlobDigests", value.asInstanceOf[js.Any])
    
    inline def setMissingBlobDigestsUndefined: Self = StObject.set(x, "missingBlobDigests", js.undefined)
    
    inline def setMissingBlobDigestsVarargs(value: SchemaBuildBazelRemoteExecutionV2Digest*): Self = StObject.set(x, "missingBlobDigests", js.Array(value*))
  }
}
