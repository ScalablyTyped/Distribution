package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HparamTuningTrial extends StObject {
  
  /** Ending time of the trial. */
  var endTimeMs: js.UndefOr[String] = js.undefined
  
  /** Error message for FAILED and INFEASIBLE trial. */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /** Loss computed on the eval data at the end of trial. */
  var evalLoss: js.UndefOr[Double] = js.undefined
  
  /** Evaluation metrics of this trial calculated on the test data. Empty in Job API. */
  var evaluationMetrics: js.UndefOr[EvaluationMetrics] = js.undefined
  
  /** Hyperparameter tuning evaluation metrics of this trial calculated on the eval data. Unlike evaluation_metrics, only the fields corresponding to the hparam_tuning_objectives are set. */
  var hparamTuningEvaluationMetrics: js.UndefOr[EvaluationMetrics] = js.undefined
  
  /** The hyperprameters selected for this trial. */
  var hparams: js.UndefOr[TrainingOptions] = js.undefined
  
  /** Starting time of the trial. */
  var startTimeMs: js.UndefOr[String] = js.undefined
  
  /** The status of the trial. */
  var status: js.UndefOr[String] = js.undefined
  
  /** Loss computed on the training data at the end of trial. */
  var trainingLoss: js.UndefOr[Double] = js.undefined
  
  /** 1-based index of the trial. */
  var trialId: js.UndefOr[String] = js.undefined
}
object HparamTuningTrial {
  
  inline def apply(): HparamTuningTrial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HparamTuningTrial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HparamTuningTrial] (val x: Self) extends AnyVal {
    
    inline def setEndTimeMs(value: String): Self = StObject.set(x, "endTimeMs", value.asInstanceOf[js.Any])
    
    inline def setEndTimeMsUndefined: Self = StObject.set(x, "endTimeMs", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setEvalLoss(value: Double): Self = StObject.set(x, "evalLoss", value.asInstanceOf[js.Any])
    
    inline def setEvalLossUndefined: Self = StObject.set(x, "evalLoss", js.undefined)
    
    inline def setEvaluationMetrics(value: EvaluationMetrics): Self = StObject.set(x, "evaluationMetrics", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMetricsUndefined: Self = StObject.set(x, "evaluationMetrics", js.undefined)
    
    inline def setHparamTuningEvaluationMetrics(value: EvaluationMetrics): Self = StObject.set(x, "hparamTuningEvaluationMetrics", value.asInstanceOf[js.Any])
    
    inline def setHparamTuningEvaluationMetricsUndefined: Self = StObject.set(x, "hparamTuningEvaluationMetrics", js.undefined)
    
    inline def setHparams(value: TrainingOptions): Self = StObject.set(x, "hparams", value.asInstanceOf[js.Any])
    
    inline def setHparamsUndefined: Self = StObject.set(x, "hparams", js.undefined)
    
    inline def setStartTimeMs(value: String): Self = StObject.set(x, "startTimeMs", value.asInstanceOf[js.Any])
    
    inline def setStartTimeMsUndefined: Self = StObject.set(x, "startTimeMs", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTrainingLoss(value: Double): Self = StObject.set(x, "trainingLoss", value.asInstanceOf[js.Any])
    
    inline def setTrainingLossUndefined: Self = StObject.set(x, "trainingLoss", js.undefined)
    
    inline def setTrialId(value: String): Self = StObject.set(x, "trialId", value.asInstanceOf[js.Any])
    
    inline def setTrialIdUndefined: Self = StObject.set(x, "trialId", js.undefined)
  }
}
