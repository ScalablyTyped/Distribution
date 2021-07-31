package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request message for ContentAddressableStorage.BatchUpdateBlobs.
  */
trait SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest extends StObject {
  
  /**
    * The individual upload requests.
    */
  var requests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequests(value: js.Array[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
