package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse extends StObject {
  
  /** The list of evaluation jobs to return. */
  var evaluationJobs: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1EvaluationJob]] = js.undefined
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse](x: Self) {
    
    inline def setEvaluationJobs(value: js.Array[GoogleCloudDatalabelingV1beta1EvaluationJob]): Self = StObject.set(x, "evaluationJobs", value.asInstanceOf[js.Any])
    
    inline def setEvaluationJobsUndefined: Self = StObject.set(x, "evaluationJobs", js.undefined)
    
    inline def setEvaluationJobsVarargs(value: GoogleCloudDatalabelingV1beta1EvaluationJob*): Self = StObject.set(x, "evaluationJobs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
