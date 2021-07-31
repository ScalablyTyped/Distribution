package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArimaFittingMetrics extends StObject {
  
  /** AIC. */
  var aic: js.UndefOr[Double] = js.undefined
  
  /** Log-likelihood. */
  var logLikelihood: js.UndefOr[Double] = js.undefined
  
  /** Variance. */
  var variance: js.UndefOr[Double] = js.undefined
}
object ArimaFittingMetrics {
  
  @scala.inline
  def apply(): ArimaFittingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArimaFittingMetrics]
  }
  
  @scala.inline
  implicit class ArimaFittingMetricsMutableBuilder[Self <: ArimaFittingMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAic(value: Double): Self = StObject.set(x, "aic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAicUndefined: Self = StObject.set(x, "aic", js.undefined)
    
    @scala.inline
    def setLogLikelihood(value: Double): Self = StObject.set(x, "logLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLikelihoodUndefined: Self = StObject.set(x, "logLikelihood", js.undefined)
    
    @scala.inline
    def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
