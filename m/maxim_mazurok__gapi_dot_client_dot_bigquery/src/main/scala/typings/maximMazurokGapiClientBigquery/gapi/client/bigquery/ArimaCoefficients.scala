package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArimaCoefficients extends StObject {
  
  /** Auto-regressive coefficients, an array of double. */
  var autoRegressiveCoefficients: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Intercept coefficient, just a double not an array. */
  var interceptCoefficient: js.UndefOr[Double] = js.undefined
  
  /** Moving-average coefficients, an array of double. */
  var movingAverageCoefficients: js.UndefOr[js.Array[Double]] = js.undefined
}
object ArimaCoefficients {
  
  inline def apply(): ArimaCoefficients = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArimaCoefficients]
  }
  
  extension [Self <: ArimaCoefficients](x: Self) {
    
    inline def setAutoRegressiveCoefficients(value: js.Array[Double]): Self = StObject.set(x, "autoRegressiveCoefficients", value.asInstanceOf[js.Any])
    
    inline def setAutoRegressiveCoefficientsUndefined: Self = StObject.set(x, "autoRegressiveCoefficients", js.undefined)
    
    inline def setAutoRegressiveCoefficientsVarargs(value: Double*): Self = StObject.set(x, "autoRegressiveCoefficients", js.Array(value :_*))
    
    inline def setInterceptCoefficient(value: Double): Self = StObject.set(x, "interceptCoefficient", value.asInstanceOf[js.Any])
    
    inline def setInterceptCoefficientUndefined: Self = StObject.set(x, "interceptCoefficient", js.undefined)
    
    inline def setMovingAverageCoefficients(value: js.Array[Double]): Self = StObject.set(x, "movingAverageCoefficients", value.asInstanceOf[js.Any])
    
    inline def setMovingAverageCoefficientsUndefined: Self = StObject.set(x, "movingAverageCoefficients", js.undefined)
    
    inline def setMovingAverageCoefficientsVarargs(value: Double*): Self = StObject.set(x, "movingAverageCoefficients", js.Array(value :_*))
  }
}
