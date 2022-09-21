package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest extends StObject {
  
  /**
    * A list of the blobs to check.
    */
  var blobDigests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Digest]] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest](x: Self) {
    
    inline def setBlobDigests(value: js.Array[SchemaBuildBazelRemoteExecutionV2Digest]): Self = StObject.set(x, "blobDigests", value.asInstanceOf[js.Any])
    
    inline def setBlobDigestsUndefined: Self = StObject.set(x, "blobDigests", js.undefined)
    
    inline def setBlobDigestsVarargs(value: SchemaBuildBazelRemoteExecutionV2Digest*): Self = StObject.set(x, "blobDigests", js.Array(value*))
  }
}
