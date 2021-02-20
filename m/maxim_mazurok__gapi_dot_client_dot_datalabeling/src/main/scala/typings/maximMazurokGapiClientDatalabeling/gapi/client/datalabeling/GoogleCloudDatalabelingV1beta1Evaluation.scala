package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1Evaluation extends StObject {
  
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
  implicit class GoogleCloudDatalabelingV1beta1EvaluationMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1Evaluation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
    
    @scala.inline
    def setConfig(value: GoogleCloudDatalabelingV1beta1EvaluationConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEvaluatedItemCount(value: String): Self = StObject.set(x, "evaluatedItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluatedItemCountUndefined: Self = StObject.set(x, "evaluatedItemCount", js.undefined)
    
    @scala.inline
    def setEvaluationJobRunTime(value: String): Self = StObject.set(x, "evaluationJobRunTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationJobRunTimeUndefined: Self = StObject.set(x, "evaluationJobRunTime", js.undefined)
    
    @scala.inline
    def setEvaluationMetrics(value: GoogleCloudDatalabelingV1beta1EvaluationMetrics): Self = StObject.set(x, "evaluationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationMetricsUndefined: Self = StObject.set(x, "evaluationMetrics", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
