package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response message for ContentAddressableStorage.BatchReadBlobs.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse extends StObject {
  
  /**
    * The responses to the requests.
    */
  var responses: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]] = js.native
}
object SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
