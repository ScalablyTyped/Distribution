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
  
  inline def apply(): ArimaFittingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArimaFittingMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArimaFittingMetrics] (val x: Self) extends AnyVal {
    
    inline def setAic(value: Double): Self = StObject.set(x, "aic", value.asInstanceOf[js.Any])
    
    inline def setAicUndefined: Self = StObject.set(x, "aic", js.undefined)
    
    inline def setLogLikelihood(value: Double): Self = StObject.set(x, "logLikelihood", value.asInstanceOf[js.Any])
    
    inline def setLogLikelihoodUndefined: Self = StObject.set(x, "logLikelihood", js.undefined)
    
    inline def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    inline def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
