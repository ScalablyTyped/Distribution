package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1Evaluation extends js.Object {
  
  /**
    * Output only. Type of task that the model version being evaluated performs, as defined in the evaluationJobConfig.inputConfig.annotationType field of the evaluation job that created
    * this evaluation.
    */
  var annotationType: js.UndefOr[String] = js.native
  
  /** Output only. Options used in the evaluation job that created this evaluation. */
  var config: js.UndefOr[GoogleCloudDatalabelingV1beta1EvaluationConfig] = js.native
  
  /** Output only. Timestamp for when this evaluation was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The number of items in the ground truth dataset that were used for this evaluation. Only populated when the evaulation is for certain AnnotationTypes. */
  var evaluatedItemCount: js.UndefOr[String] = js.native
  
  /** Output only. Timestamp for when the evaluation job that created this evaluation ran. */
  var evaluationJobRunTime: js.UndefOr[String] = js.native
  
  /** Output only. Metrics comparing predictions to ground truth labels. */
  var evaluationMetrics: js.UndefOr[GoogleCloudDatalabelingV1beta1EvaluationMetrics] = js.native
  
  /** Output only. Resource name of an evaluation. The name has the following format: "projects/{project_id}/datasets/{dataset_id}/evaluations/ {evaluation_id}' */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1Evaluation {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1Evaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Evaluation]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1EvaluationOps[Self <: GoogleCloudDatalabelingV1beta1Evaluation] (val x: Self) extends AnyVal {
    
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
    def setAnnotationType(value: String): Self = this.set("annotationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationType: Self = this.set("annotationType", js.undefined)
    
    @scala.inline
    def setConfig(value: GoogleCloudDatalabelingV1beta1EvaluationConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEvaluatedItemCount(value: String): Self = this.set("evaluatedItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluatedItemCount: Self = this.set("evaluatedItemCount", js.undefined)
    
    @scala.inline
    def setEvaluationJobRunTime(value: String): Self = this.set("evaluationJobRunTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationJobRunTime: Self = this.set("evaluationJobRunTime", js.undefined)
    
    @scala.inline
    def setEvaluationMetrics(value: GoogleCloudDatalabelingV1beta1EvaluationMetrics): Self = this.set("evaluationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationMetrics: Self = this.set("evaluationMetrics", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
