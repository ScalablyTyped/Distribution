package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse extends js.Object {
  
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
  implicit class GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponseOps[Self <: GoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvaluationJobsVarargs(value: GoogleCloudDatalabelingV1beta1EvaluationJob*): Self = this.set("evaluationJobs", js.Array(value :_*))
    
    @scala.inline
    def setEvaluationJobs(value: js.Array[GoogleCloudDatalabelingV1beta1EvaluationJob]): Self = this.set("evaluationJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationJobs: Self = this.set("evaluationJobs", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
