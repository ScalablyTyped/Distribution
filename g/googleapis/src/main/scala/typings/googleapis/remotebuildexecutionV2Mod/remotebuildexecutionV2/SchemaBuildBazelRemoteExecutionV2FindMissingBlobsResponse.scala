package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response message for ContentAddressableStorage.FindMissingBlobs.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse extends StObject {
  
  /**
    * A list of the blobs requested *not* present in the storage.
    */
  var missingBlobDigests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Digest]] = js.native
}
object SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponseMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissingBlobDigests(value: js.Array[SchemaBuildBazelRemoteExecutionV2Digest]): Self = StObject.set(x, "missingBlobDigests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingBlobDigestsUndefined: Self = StObject.set(x, "missingBlobDigests", js.undefined)
    
    @scala.inline
    def setMissingBlobDigestsVarargs(value: SchemaBuildBazelRemoteExecutionV2Digest*): Self = StObject.set(x, "missingBlobDigests", js.Array(value :_*))
  }
}
