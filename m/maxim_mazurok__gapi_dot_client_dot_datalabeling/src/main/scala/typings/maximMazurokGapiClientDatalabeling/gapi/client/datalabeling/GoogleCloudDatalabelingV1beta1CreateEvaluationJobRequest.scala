package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest extends StObject {
  
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
  implicit class GoogleCloudDatalabelingV1beta1CreateEvaluationJobRequestMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: GoogleCloudDatalabelingV1beta1EvaluationJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
