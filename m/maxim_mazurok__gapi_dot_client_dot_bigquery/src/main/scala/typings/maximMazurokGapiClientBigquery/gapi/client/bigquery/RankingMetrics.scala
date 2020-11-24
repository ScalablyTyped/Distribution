package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RankingMetrics extends js.Object {
  
  /** Determines the goodness of a ranking by computing the percentile rank from the predicted confidence and dividing it by the original rank. */
  var averageRank: js.UndefOr[Double] = js.native
  
  /** Calculates a precision per user for all the items by ranking them and then averages all the precisions across all the users. */
  var meanAveragePrecision: js.UndefOr[Double] = js.native
  
  /**
    * Similar to the mean squared error computed in regression and explicit recommendation models except instead of computing the rating directly, the output from evaluate is computed
    * against a preference which is 1 or 0 depending on if the rating exists or not.
    */
  var meanSquaredError: js.UndefOr[Double] = js.native
  
  /** A metric to determine the goodness of a ranking calculated from the predicted confidence by comparing it to an ideal rank measured by the original ratings. */
  var normalizedDiscountedCumulativeGain: js.UndefOr[Double] = js.native
}
object RankingMetrics {
  
  @scala.inline
  def apply(): RankingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RankingMetrics]
  }
  
  @scala.inline
  implicit class RankingMetricsOps[Self <: RankingMetrics] (val x: Self) extends AnyVal {
    
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
    def setAverageRank(value: Double): Self = this.set("averageRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageRank: Self = this.set("averageRank", js.undefined)
    
    @scala.inline
    def setMeanAveragePrecision(value: Double): Self = this.set("meanAveragePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeanAveragePrecision: Self = this.set("meanAveragePrecision", js.undefined)
    
    @scala.inline
    def setMeanSquaredError(value: Double): Self = this.set("meanSquaredError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeanSquaredError: Self = this.set("meanSquaredError", js.undefined)
    
    @scala.inline
    def setNormalizedDiscountedCumulativeGain(value: Double): Self = this.set("normalizedDiscountedCumulativeGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizedDiscountedCumulativeGain: Self = this.set("normalizedDiscountedCumulativeGain", js.undefined)
  }
}
