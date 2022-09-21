package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse extends StObject {
  
  /**
    * The responses to the requests.
    */
  var responses: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse](x: Self) {
    
    inline def setResponses(value: js.Array[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
