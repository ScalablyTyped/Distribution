package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegressionMetrics extends StObject {
  
  /** Mean absolute error. */
  var meanAbsoluteError: js.UndefOr[Double] = js.undefined
  
  /** Mean squared error. */
  var meanSquaredError: js.UndefOr[Double] = js.undefined
  
  /** Mean squared log error. */
  var meanSquaredLogError: js.UndefOr[Double] = js.undefined
  
  /** Median absolute error. */
  var medianAbsoluteError: js.UndefOr[Double] = js.undefined
  
  /** R^2 score. */
  var rSquared: js.UndefOr[Double] = js.undefined
}
object RegressionMetrics {
  
  inline def apply(): RegressionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegressionMetrics]
  }
  
  extension [Self <: RegressionMetrics](x: Self) {
    
    inline def setMeanAbsoluteError(value: Double): Self = StObject.set(x, "meanAbsoluteError", value.asInstanceOf[js.Any])
    
    inline def setMeanAbsoluteErrorUndefined: Self = StObject.set(x, "meanAbsoluteError", js.undefined)
    
    inline def setMeanSquaredError(value: Double): Self = StObject.set(x, "meanSquaredError", value.asInstanceOf[js.Any])
    
    inline def setMeanSquaredErrorUndefined: Self = StObject.set(x, "meanSquaredError", js.undefined)
    
    inline def setMeanSquaredLogError(value: Double): Self = StObject.set(x, "meanSquaredLogError", value.asInstanceOf[js.Any])
    
    inline def setMeanSquaredLogErrorUndefined: Self = StObject.set(x, "meanSquaredLogError", js.undefined)
    
    inline def setMedianAbsoluteError(value: Double): Self = StObject.set(x, "medianAbsoluteError", value.asInstanceOf[js.Any])
    
    inline def setMedianAbsoluteErrorUndefined: Self = StObject.set(x, "medianAbsoluteError", js.undefined)
    
    inline def setRSquared(value: Double): Self = StObject.set(x, "rSquared", value.asInstanceOf[js.Any])
    
    inline def setRSquaredUndefined: Self = StObject.set(x, "rSquared", js.undefined)
  }
}
