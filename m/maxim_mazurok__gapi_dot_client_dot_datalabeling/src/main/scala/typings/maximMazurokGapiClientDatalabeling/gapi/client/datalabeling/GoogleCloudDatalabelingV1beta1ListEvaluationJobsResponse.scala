package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse extends StObject {
  
  /** The list of evaluation jobs to return. */
  var evaluationJobs: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1EvaluationJob]] = js.native
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponseMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationJobs(value: js.Array[GoogleCloudDatalabelingV1beta1EvaluationJob]): Self = StObject.set(x, "evaluationJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationJobsUndefined: Self = StObject.set(x, "evaluationJobs", js.undefined)
    
    @scala.inline
    def setEvaluationJobsVarargs(value: GoogleCloudDatalabelingV1beta1EvaluationJob*): Self = StObject.set(x, "evaluationJobs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
