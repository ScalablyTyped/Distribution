package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1Evaluation extends StObject {
  
  /**
    * Output only. Type of task that the model version being evaluated performs, as defined in the evaluationJobConfig.inputConfig.annotationType field of the evaluation job that created
    * this evaluation.
    */
  var annotationType: js.UndefOr[String] = js.undefined
  
  /** Output only. Options used in the evaluation job that created this evaluation. */
  var config: js.UndefOr[GoogleCloudDatalabelingV1beta1EvaluationConfig] = js.undefined
  
  /** Output only. Timestamp for when this evaluation was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The number of items in the ground truth dataset that were used for this evaluation. Only populated when the evaulation is for certain AnnotationTypes. */
  var evaluatedItemCount: js.UndefOr[String] = js.undefined
  
  /** Output only. Timestamp for when the evaluation job that created this evaluation ran. */
  var evaluationJobRunTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Metrics comparing predictions to ground truth labels. */
  var evaluationMetrics: js.UndefOr[GoogleCloudDatalabelingV1beta1EvaluationMetrics] = js.undefined
  
  /** Output only. Resource name of an evaluation. The name has the following format: "projects/{project_id}/datasets/{dataset_id}/evaluations/ {evaluation_id}' */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1Evaluation {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1Evaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Evaluation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1Evaluation] (val x: Self) extends AnyVal {
    
    inline def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    inline def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
    
    inline def setConfig(value: GoogleCloudDatalabelingV1beta1EvaluationConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEvaluatedItemCount(value: String): Self = StObject.set(x, "evaluatedItemCount", value.asInstanceOf[js.Any])
    
    inline def setEvaluatedItemCountUndefined: Self = StObject.set(x, "evaluatedItemCount", js.undefined)
    
    inline def setEvaluationJobRunTime(value: String): Self = StObject.set(x, "evaluationJobRunTime", value.asInstanceOf[js.Any])
    
    inline def setEvaluationJobRunTimeUndefined: Self = StObject.set(x, "evaluationJobRunTime", js.undefined)
    
    inline def setEvaluationMetrics(value: GoogleCloudDatalabelingV1beta1EvaluationMetrics): Self = StObject.set(x, "evaluationMetrics", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMetricsUndefined: Self = StObject.set(x, "evaluationMetrics", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
