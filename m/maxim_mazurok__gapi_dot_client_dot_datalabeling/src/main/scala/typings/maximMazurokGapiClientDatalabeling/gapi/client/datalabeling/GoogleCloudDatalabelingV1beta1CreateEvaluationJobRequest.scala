package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest extends js.Object {
  
  /** Required. The evaluation job to create. */
  var job: js.UndefOr[GoogleCloudDatalabelingV1beta1EvaluationJob] = js.native
}
object GoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1CreateEvaluationJobRequestOps[Self <: GoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest] (val x: Self) extends AnyVal {
    
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
    def setJob(value: GoogleCloudDatalabelingV1beta1EvaluationJob): Self = this.set("job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob: Self = this.set("job", js.undefined)
  }
}
