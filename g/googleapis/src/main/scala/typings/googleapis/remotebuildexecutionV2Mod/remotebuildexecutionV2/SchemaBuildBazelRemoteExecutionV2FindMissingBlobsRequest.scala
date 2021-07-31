package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request message for ContentAddressableStorage.FindMissingBlobs.
  */
trait SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest extends StObject {
  
  /**
    * A list of the blobs to check.
    */
  var blobDigests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Digest]] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequestMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlobDigests(value: js.Array[SchemaBuildBazelRemoteExecutionV2Digest]): Self = StObject.set(x, "blobDigests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobDigestsUndefined: Self = StObject.set(x, "blobDigests", js.undefined)
    
    @scala.inline
    def setBlobDigestsVarargs(value: SchemaBuildBazelRemoteExecutionV2Digest*): Self = StObject.set(x, "blobDigests", js.Array(value :_*))
  }
}
