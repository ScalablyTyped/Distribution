package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobExecutionDetails extends StObject {
  
  /** If present, this response does not contain all requested tasks. To obtain the next page of results, repeat the request with page_token set to this value. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The stages of the job execution. */
  var stages: js.UndefOr[js.Array[StageSummary]] = js.undefined
}
object JobExecutionDetails {
  
  inline def apply(): JobExecutionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobExecutionDetails] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setStages(value: js.Array[StageSummary]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
    
    inline def setStagesVarargs(value: StageSummary*): Self = StObject.set(x, "stages", js.Array(value*))
  }
}
