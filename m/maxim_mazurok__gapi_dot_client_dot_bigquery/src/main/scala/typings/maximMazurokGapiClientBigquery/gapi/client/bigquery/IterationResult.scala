package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IterationResult extends StObject {
  
  /** Time taken to run the iteration in milliseconds. */
  var durationMs: js.UndefOr[String] = js.undefined
  
  /** Loss computed on the eval data at the end of iteration. */
  var evalLoss: js.UndefOr[Double] = js.undefined
  
  /** Index of the iteration, 0 based. */
  var index: js.UndefOr[Double] = js.undefined
  
  /** Learn rate used for this iteration. */
  var learnRate: js.UndefOr[Double] = js.undefined
  
  /** Loss computed on the training data at the end of iteration. */
  var trainingLoss: js.UndefOr[Double] = js.undefined
}
object IterationResult {
  
  inline def apply(): IterationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterationResult]
  }
  
  extension [Self <: IterationResult](x: Self) {
    
    inline def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    inline def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    inline def setEvalLoss(value: Double): Self = StObject.set(x, "evalLoss", value.asInstanceOf[js.Any])
    
    inline def setEvalLossUndefined: Self = StObject.set(x, "evalLoss", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLearnRate(value: Double): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
    
    inline def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
    
    inline def setTrainingLoss(value: Double): Self = StObject.set(x, "trainingLoss", value.asInstanceOf[js.Any])
    
    inline def setTrainingLossUndefined: Self = StObject.set(x, "trainingLoss", js.undefined)
  }
}
