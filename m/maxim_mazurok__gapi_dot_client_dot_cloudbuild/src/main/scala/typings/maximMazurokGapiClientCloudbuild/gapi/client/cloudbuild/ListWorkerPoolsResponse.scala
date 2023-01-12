package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkerPoolsResponse extends StObject {
  
  /** Continuation token used to page through large result sets. Provide this value in a subsequent ListWorkerPoolsRequest to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** `WorkerPools` for the specified project. */
  var workerPools: js.UndefOr[js.Array[WorkerPool]] = js.undefined
}
object ListWorkerPoolsResponse {
  
  inline def apply(): ListWorkerPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkerPoolsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkerPoolsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWorkerPools(value: js.Array[WorkerPool]): Self = StObject.set(x, "workerPools", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolsUndefined: Self = StObject.set(x, "workerPools", js.undefined)
    
    inline def setWorkerPoolsVarargs(value: WorkerPool*): Self = StObject.set(x, "workerPools", js.Array(value*))
  }
}
