package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingRun extends StObject {
  
  /** Data split result of the training run. Only set when the input data is actually split. */
  var dataSplitResult: js.UndefOr[DataSplitResult] = js.native
  
  /** The evaluation metrics over training/eval data that were computed at the end of training. */
  var evaluationMetrics: js.UndefOr[EvaluationMetrics] = js.native
  
  /** Global explanations for important features of the model. For multi-class models, there is one entry for each label class. For other models, there is only one entry in the list. */
  var globalExplanations: js.UndefOr[js.Array[GlobalExplanation]] = js.native
  
  /** Output of each iteration run, results.size() <= max_iterations. */
  var results: js.UndefOr[js.Array[IterationResult]] = js.native
  
  /** The start time of this training run. */
  var startTime: js.UndefOr[String] = js.native
  
  /** Options that were used for this training run, includes user specified and default options that were used. */
  var trainingOptions: js.UndefOr[TrainingOptions] = js.native
}
object TrainingRun {
  
  @scala.inline
  def apply(): TrainingRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingRun]
  }
  
  @scala.inline
  implicit class TrainingRunMutableBuilder[Self <: TrainingRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSplitResult(value: DataSplitResult): Self = StObject.set(x, "dataSplitResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSplitResultUndefined: Self = StObject.set(x, "dataSplitResult", js.undefined)
    
    @scala.inline
    def setEvaluationMetrics(value: EvaluationMetrics): Self = StObject.set(x, "evaluationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationMetricsUndefined: Self = StObject.set(x, "evaluationMetrics", js.undefined)
    
    @scala.inline
    def setGlobalExplanations(value: js.Array[GlobalExplanation]): Self = StObject.set(x, "globalExplanations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalExplanationsUndefined: Self = StObject.set(x, "globalExplanations", js.undefined)
    
    @scala.inline
    def setGlobalExplanationsVarargs(value: GlobalExplanation*): Self = StObject.set(x, "globalExplanations", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[IterationResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: IterationResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setTrainingOptions(value: TrainingOptions): Self = StObject.set(x, "trainingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingOptionsUndefined: Self = StObject.set(x, "trainingOptions", js.undefined)
  }
}
