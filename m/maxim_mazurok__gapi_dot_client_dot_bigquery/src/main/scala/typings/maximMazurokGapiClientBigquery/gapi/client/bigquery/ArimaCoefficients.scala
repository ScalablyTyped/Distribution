package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArimaCoefficients extends js.Object {
  
  /** Auto-regressive coefficients, an array of double. */
  var autoRegressiveCoefficients: js.UndefOr[js.Array[Double]] = js.native
  
  /** Intercept coefficient, just a double not an array. */
  var interceptCoefficient: js.UndefOr[Double] = js.native
  
  /** Moving-average coefficients, an array of double. */
  var movingAverageCoefficients: js.UndefOr[js.Array[Double]] = js.native
}
object ArimaCoefficients {
  
  @scala.inline
  def apply(): ArimaCoefficients = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArimaCoefficients]
  }
  
  @scala.inline
  implicit class ArimaCoefficientsOps[Self <: ArimaCoefficients] (val x: Self) extends AnyVal {
    
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
    def setAutoRegressiveCoefficientsVarargs(value: Double*): Self = this.set("autoRegressiveCoefficients", js.Array(value :_*))
    
    @scala.inline
    def setAutoRegressiveCoefficients(value: js.Array[Double]): Self = this.set("autoRegressiveCoefficients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRegressiveCoefficients: Self = this.set("autoRegressiveCoefficients", js.undefined)
    
    @scala.inline
    def setInterceptCoefficient(value: Double): Self = this.set("interceptCoefficient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterceptCoefficient: Self = this.set("interceptCoefficient", js.undefined)
    
    @scala.inline
    def setMovingAverageCoefficientsVarargs(value: Double*): Self = this.set("movingAverageCoefficients", js.Array(value :_*))
    
    @scala.inline
    def setMovingAverageCoefficients(value: js.Array[Double]): Self = this.set("movingAverageCoefficients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovingAverageCoefficients: Self = this.set("movingAverageCoefficients", js.undefined)
  }
}
