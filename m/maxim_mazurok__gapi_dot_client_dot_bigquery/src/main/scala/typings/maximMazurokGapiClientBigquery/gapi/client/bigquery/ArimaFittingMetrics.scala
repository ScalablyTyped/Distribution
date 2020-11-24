package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArimaFittingMetrics extends js.Object {
  
  /** AIC. */
  var aic: js.UndefOr[Double] = js.native
  
  /** Log-likelihood. */
  var logLikelihood: js.UndefOr[Double] = js.native
  
  /** Variance. */
  var variance: js.UndefOr[Double] = js.native
}
object ArimaFittingMetrics {
  
  @scala.inline
  def apply(): ArimaFittingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArimaFittingMetrics]
  }
  
  @scala.inline
  implicit class ArimaFittingMetricsOps[Self <: ArimaFittingMetrics] (val x: Self) extends AnyVal {
    
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
    def setAic(value: Double): Self = this.set("aic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAic: Self = this.set("aic", js.undefined)
    
    @scala.inline
    def setLogLikelihood(value: Double): Self = this.set("logLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLikelihood: Self = this.set("logLikelihood", js.undefined)
    
    @scala.inline
    def setVariance(value: Double): Self = this.set("variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariance: Self = this.set("variance", js.undefined)
  }
}
