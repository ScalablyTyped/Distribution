package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request message for ContentAddressableStorage.BatchReadBlobs.
  */
trait SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest extends StObject {
  
  /**
    * The individual blob digests.
    */
  var digests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Digest]] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequestMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigests(value: js.Array[SchemaBuildBazelRemoteExecutionV2Digest]): Self = StObject.set(x, "digests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestsUndefined: Self = StObject.set(x, "digests", js.undefined)
    
    @scala.inline
    def setDigestsVarargs(value: SchemaBuildBazelRemoteExecutionV2Digest*): Self = StObject.set(x, "digests", js.Array(value :_*))
  }
}
