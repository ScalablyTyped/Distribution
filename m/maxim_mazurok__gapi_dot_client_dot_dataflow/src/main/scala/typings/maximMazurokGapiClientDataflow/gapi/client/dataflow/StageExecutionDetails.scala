package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StageExecutionDetails extends StObject {
  
  /** If present, this response does not contain all requested tasks. To obtain the next page of results, repeat the request with page_token set to this value. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Workers that have done work on the stage. */
  var workers: js.UndefOr[js.Array[WorkerDetails]] = js.native
}
object StageExecutionDetails {
  
  @scala.inline
  def apply(): StageExecutionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageExecutionDetails]
  }
  
  @scala.inline
  implicit class StageExecutionDetailsMutableBuilder[Self <: StageExecutionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setWorkers(value: js.Array[WorkerDetails]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    
    @scala.inline
    def setWorkersVarargs(value: WorkerDetails*): Self = StObject.set(x, "workers", js.Array(value :_*))
  }
}
