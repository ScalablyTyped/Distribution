package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest extends StObject {
  
  /**
    * The individual upload requests.
    */
  var requests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
