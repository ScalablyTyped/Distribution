package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankingMetrics extends StObject {
  
  /** Determines the goodness of a ranking by computing the percentile rank from the predicted confidence and dividing it by the original rank. */
  var averageRank: js.UndefOr[Double] = js.undefined
  
  /** Calculates a precision per user for all the items by ranking them and then averages all the precisions across all the users. */
  var meanAveragePrecision: js.UndefOr[Double] = js.undefined
  
  /**
    * Similar to the mean squared error computed in regression and explicit recommendation models except instead of computing the rating directly, the output from evaluate is computed
    * against a preference which is 1 or 0 depending on if the rating exists or not.
    */
  var meanSquaredError: js.UndefOr[Double] = js.undefined
  
  /** A metric to determine the goodness of a ranking calculated from the predicted confidence by comparing it to an ideal rank measured by the original ratings. */
  var normalizedDiscountedCumulativeGain: js.UndefOr[Double] = js.undefined
}
object RankingMetrics {
  
  inline def apply(): RankingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RankingMetrics]
  }
  
  extension [Self <: RankingMetrics](x: Self) {
    
    inline def setAverageRank(value: Double): Self = StObject.set(x, "averageRank", value.asInstanceOf[js.Any])
    
    inline def setAverageRankUndefined: Self = StObject.set(x, "averageRank", js.undefined)
    
    inline def setMeanAveragePrecision(value: Double): Self = StObject.set(x, "meanAveragePrecision", value.asInstanceOf[js.Any])
    
    inline def setMeanAveragePrecisionUndefined: Self = StObject.set(x, "meanAveragePrecision", js.undefined)
    
    inline def setMeanSquaredError(value: Double): Self = StObject.set(x, "meanSquaredError", value.asInstanceOf[js.Any])
    
    inline def setMeanSquaredErrorUndefined: Self = StObject.set(x, "meanSquaredError", js.undefined)
    
    inline def setNormalizedDiscountedCumulativeGain(value: Double): Self = StObject.set(x, "normalizedDiscountedCumulativeGain", value.asInstanceOf[js.Any])
    
    inline def setNormalizedDiscountedCumulativeGainUndefined: Self = StObject.set(x, "normalizedDiscountedCumulativeGain", js.undefined)
  }
}
