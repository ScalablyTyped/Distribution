package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1Evaluation extends StObject {
  
  /**
    * Output only. Type of task that the model version being evaluated performs, as defined in the evaluationJobConfig.inputConfig.annotationType field of the evaluation job that created this evaluation.
    */
  var annotationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Options used in the evaluation job that created this evaluation.
    */
  var config: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1EvaluationConfig] = js.undefined
  
  /**
    * Output only. Timestamp for when this evaluation was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The number of items in the ground truth dataset that were used for this evaluation. Only populated when the evaulation is for certain AnnotationTypes.
    */
  var evaluatedItemCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp for when the evaluation job that created this evaluation ran.
    */
  var evaluationJobRunTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Metrics comparing predictions to ground truth labels.
    */
  var evaluationMetrics: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1EvaluationMetrics] = js.undefined
  
  /**
    * Output only. Resource name of an evaluation. The name has the following format: "projects/{project_id\}/datasets/{dataset_id\}/evaluations/ {evaluation_id\}'
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1Evaluation {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1Evaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1Evaluation]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1Evaluation](x: Self) {
    
    inline def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    inline def setAnnotationTypeNull: Self = StObject.set(x, "annotationType", null)
    
    inline def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
    
    inline def setConfig(value: SchemaGoogleCloudDatalabelingV1beta1EvaluationConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEvaluatedItemCount(value: String): Self = StObject.set(x, "evaluatedItemCount", value.asInstanceOf[js.Any])
    
    inline def setEvaluatedItemCountNull: Self = StObject.set(x, "evaluatedItemCount", null)
    
    inline def setEvaluatedItemCountUndefined: Self = StObject.set(x, "evaluatedItemCount", js.undefined)
    
    inline def setEvaluationJobRunTime(value: String): Self = StObject.set(x, "evaluationJobRunTime", value.asInstanceOf[js.Any])
    
    inline def setEvaluationJobRunTimeNull: Self = StObject.set(x, "evaluationJobRunTime", null)
    
    inline def setEvaluationJobRunTimeUndefined: Self = StObject.set(x, "evaluationJobRunTime", js.undefined)
    
    inline def setEvaluationMetrics(value: SchemaGoogleCloudDatalabelingV1beta1EvaluationMetrics): Self = StObject.set(x, "evaluationMetrics", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMetricsUndefined: Self = StObject.set(x, "evaluationMetrics", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
