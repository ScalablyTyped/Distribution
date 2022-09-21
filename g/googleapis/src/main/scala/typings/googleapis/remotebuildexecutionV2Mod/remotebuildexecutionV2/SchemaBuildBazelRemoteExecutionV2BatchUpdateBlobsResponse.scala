package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse extends StObject {
  
  /**
    * The responses to the requests.
    */
  var responses: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse]] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponse](x: Self) {
    
    inline def setResponses(value: js.Array[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
