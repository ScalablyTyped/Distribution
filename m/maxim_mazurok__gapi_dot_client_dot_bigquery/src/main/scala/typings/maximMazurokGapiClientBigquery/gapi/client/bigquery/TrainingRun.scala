package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingRun extends StObject {
  
  /** Global explanation contains the explanation of top features on the class level. Applies to classification models only. */
  var classLevelGlobalExplanations: js.UndefOr[js.Array[GlobalExplanation]] = js.undefined
  
  /** Data split result of the training run. Only set when the input data is actually split. */
  var dataSplitResult: js.UndefOr[DataSplitResult] = js.undefined
  
  /** The evaluation metrics over training/eval data that were computed at the end of training. */
  var evaluationMetrics: js.UndefOr[EvaluationMetrics] = js.undefined
  
  /** Global explanation contains the explanation of top features on the model level. Applies to both regression and classification models. */
  var modelLevelGlobalExplanation: js.UndefOr[GlobalExplanation] = js.undefined
  
  /** Output of each iteration run, results.size() <= max_iterations. */
  var results: js.UndefOr[js.Array[IterationResult]] = js.undefined
  
  /** The start time of this training run. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Options that were used for this training run, includes user specified and default options that were used. */
  var trainingOptions: js.UndefOr[TrainingOptions] = js.undefined
  
  /** The start time of this training run, in milliseconds since epoch. */
  var trainingStartTime: js.UndefOr[String] = js.undefined
  
  /** The model id in Vertex AI Model Registry for this training run */
  var vertexAiModelId: js.UndefOr[String] = js.undefined
  
  /** The model version in Vertex AI Model Registry for this training run */
  var vertexAiModelVersion: js.UndefOr[String] = js.undefined
}
object TrainingRun {
  
  inline def apply(): TrainingRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrainingRun] (val x: Self) extends AnyVal {
    
    inline def setClassLevelGlobalExplanations(value: js.Array[GlobalExplanation]): Self = StObject.set(x, "classLevelGlobalExplanations", value.asInstanceOf[js.Any])
    
    inline def setClassLevelGlobalExplanationsUndefined: Self = StObject.set(x, "classLevelGlobalExplanations", js.undefined)
    
    inline def setClassLevelGlobalExplanationsVarargs(value: GlobalExplanation*): Self = StObject.set(x, "classLevelGlobalExplanations", js.Array(value*))
    
    inline def setDataSplitResult(value: DataSplitResult): Self = StObject.set(x, "dataSplitResult", value.asInstanceOf[js.Any])
    
    inline def setDataSplitResultUndefined: Self = StObject.set(x, "dataSplitResult", js.undefined)
    
    inline def setEvaluationMetrics(value: EvaluationMetrics): Self = StObject.set(x, "evaluationMetrics", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMetricsUndefined: Self = StObject.set(x, "evaluationMetrics", js.undefined)
    
    inline def setModelLevelGlobalExplanation(value: GlobalExplanation): Self = StObject.set(x, "modelLevelGlobalExplanation", value.asInstanceOf[js.Any])
    
    inline def setModelLevelGlobalExplanationUndefined: Self = StObject.set(x, "modelLevelGlobalExplanation", js.undefined)
    
    inline def setResults(value: js.Array[IterationResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: IterationResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTrainingOptions(value: TrainingOptions): Self = StObject.set(x, "trainingOptions", value.asInstanceOf[js.Any])
    
    inline def setTrainingOptionsUndefined: Self = StObject.set(x, "trainingOptions", js.undefined)
    
    inline def setTrainingStartTime(value: String): Self = StObject.set(x, "trainingStartTime", value.asInstanceOf[js.Any])
    
    inline def setTrainingStartTimeUndefined: Self = StObject.set(x, "trainingStartTime", js.undefined)
    
    inline def setVertexAiModelId(value: String): Self = StObject.set(x, "vertexAiModelId", value.asInstanceOf[js.Any])
    
    inline def setVertexAiModelIdUndefined: Self = StObject.set(x, "vertexAiModelId", js.undefined)
    
    inline def setVertexAiModelVersion(value: String): Self = StObject.set(x, "vertexAiModelVersion", value.asInstanceOf[js.Any])
    
    inline def setVertexAiModelVersionUndefined: Self = StObject.set(x, "vertexAiModelVersion", js.undefined)
  }
}
