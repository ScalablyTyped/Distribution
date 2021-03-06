package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegressionMetrics extends StObject {
  
  /** Mean absolute error. */
  var meanAbsoluteError: js.UndefOr[Double] = js.native
  
  /** Mean squared error. */
  var meanSquaredError: js.UndefOr[Double] = js.native
  
  /** Mean squared log error. */
  var meanSquaredLogError: js.UndefOr[Double] = js.native
  
  /** Median absolute error. */
  var medianAbsoluteError: js.UndefOr[Double] = js.native
  
  /** R^2 score. */
  var rSquared: js.UndefOr[Double] = js.native
}
object RegressionMetrics {
  
  @scala.inline
  def apply(): RegressionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegressionMetrics]
  }
  
  @scala.inline
  implicit class RegressionMetricsMutableBuilder[Self <: RegressionMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeanAbsoluteError(value: Double): Self = StObject.set(x, "meanAbsoluteError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanAbsoluteErrorUndefined: Self = StObject.set(x, "meanAbsoluteError", js.undefined)
    
    @scala.inline
    def setMeanSquaredError(value: Double): Self = StObject.set(x, "meanSquaredError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanSquaredErrorUndefined: Self = StObject.set(x, "meanSquaredError", js.undefined)
    
    @scala.inline
    def setMeanSquaredLogError(value: Double): Self = StObject.set(x, "meanSquaredLogError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanSquaredLogErrorUndefined: Self = StObject.set(x, "meanSquaredLogError", js.undefined)
    
    @scala.inline
    def setMedianAbsoluteError(value: Double): Self = StObject.set(x, "medianAbsoluteError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedianAbsoluteErrorUndefined: Self = StObject.set(x, "medianAbsoluteError", js.undefined)
    
    @scala.inline
    def setRSquared(value: Double): Self = StObject.set(x, "rSquared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRSquaredUndefined: Self = StObject.set(x, "rSquared", js.undefined)
  }
}
