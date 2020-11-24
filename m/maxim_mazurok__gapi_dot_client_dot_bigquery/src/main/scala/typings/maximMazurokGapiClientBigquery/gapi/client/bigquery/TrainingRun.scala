package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingRun extends js.Object {
  
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
  implicit class TrainingRunOps[Self <: TrainingRun] (val x: Self) extends AnyVal {
    
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
    def setDataSplitResult(value: DataSplitResult): Self = this.set("dataSplitResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSplitResult: Self = this.set("dataSplitResult", js.undefined)
    
    @scala.inline
    def setEvaluationMetrics(value: EvaluationMetrics): Self = this.set("evaluationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationMetrics: Self = this.set("evaluationMetrics", js.undefined)
    
    @scala.inline
    def setGlobalExplanationsVarargs(value: GlobalExplanation*): Self = this.set("globalExplanations", js.Array(value :_*))
    
    @scala.inline
    def setGlobalExplanations(value: js.Array[GlobalExplanation]): Self = this.set("globalExplanations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalExplanations: Self = this.set("globalExplanations", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: IterationResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[IterationResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTrainingOptions(value: TrainingOptions): Self = this.set("trainingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingOptions: Self = this.set("trainingOptions", js.undefined)
  }
}
