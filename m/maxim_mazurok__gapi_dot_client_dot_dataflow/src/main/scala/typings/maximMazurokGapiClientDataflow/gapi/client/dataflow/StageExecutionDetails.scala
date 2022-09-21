package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StageExecutionDetails extends StObject {
  
  /** If present, this response does not contain all requested tasks. To obtain the next page of results, repeat the request with page_token set to this value. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Workers that have done work on the stage. */
  var workers: js.UndefOr[js.Array[WorkerDetails]] = js.undefined
}
object StageExecutionDetails {
  
  inline def apply(): StageExecutionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageExecutionDetails]
  }
  
  extension [Self <: StageExecutionDetails](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWorkers(value: js.Array[WorkerDetails]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
    
    inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    
    inline def setWorkersVarargs(value: WorkerDetails*): Self = StObject.set(x, "workers", js.Array(value*))
  }
}
