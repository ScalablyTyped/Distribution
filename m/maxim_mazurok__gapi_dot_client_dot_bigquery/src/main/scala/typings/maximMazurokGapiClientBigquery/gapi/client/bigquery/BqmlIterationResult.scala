package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BqmlIterationResult extends StObject {
  
  /** [Output-only, Beta] Time taken to run the training iteration in milliseconds. */
  var durationMs: js.UndefOr[String] = js.undefined
  
  /**
    * [Output-only, Beta] Eval loss computed on the eval data at the end of the iteration. The eval loss is used for early stopping to avoid overfitting. No eval loss if eval_split_method
    * option is specified as no_split or auto_split with input data size less than 500 rows.
    */
  var evalLoss: js.UndefOr[Double] = js.undefined
  
  /** [Output-only, Beta] Index of the ML training iteration, starting from zero for each training run. */
  var index: js.UndefOr[Double] = js.undefined
  
  /** [Output-only, Beta] Learning rate used for this iteration, it varies for different training iterations if learn_rate_strategy option is not constant. */
  var learnRate: js.UndefOr[Double] = js.undefined
  
  /** [Output-only, Beta] Training loss computed on the training data at the end of the iteration. The training loss function is defined by model type. */
  var trainingLoss: js.UndefOr[Double] = js.undefined
}
object BqmlIterationResult {
  
  @scala.inline
  def apply(): BqmlIterationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BqmlIterationResult]
  }
  
  @scala.inline
  implicit class BqmlIterationResultMutableBuilder[Self <: BqmlIterationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    @scala.inline
    def setEvalLoss(value: Double): Self = StObject.set(x, "evalLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvalLossUndefined: Self = StObject.set(x, "evalLoss", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLearnRate(value: Double): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
    
    @scala.inline
    def setTrainingLoss(value: Double): Self = StObject.set(x, "trainingLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingLossUndefined: Self = StObject.set(x, "trainingLoss", js.undefined)
  }
}
