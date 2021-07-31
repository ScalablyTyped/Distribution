package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricValue extends StObject {
  
  /** The expected value of the metric. */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * The variance (i.e. square of the standard deviation) of the metric value. If value is exact, variance is 0. Can be used to calculate margin of error as a percentage of value, using
    * the following formula, where Z is the standard constant that depends on the desired size of the confidence interval (e.g. for 90% confidence interval, use Z = 1.645): marginOfError
    * = 100 * Z * sqrt(variance) / value
    */
  var variance: js.UndefOr[String] = js.undefined
}
object MetricValue {
  
  @scala.inline
  def apply(): MetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricValue]
  }
  
  @scala.inline
  implicit class MetricValueMutableBuilder[Self <: MetricValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVariance(value: String): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
