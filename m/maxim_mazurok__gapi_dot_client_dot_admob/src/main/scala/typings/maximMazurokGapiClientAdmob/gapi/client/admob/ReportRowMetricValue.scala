package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportRowMetricValue extends StObject {
  
  /** Double precision (approximate) decimal values. Rates are from 0 to 1. */
  var doubleValue: js.UndefOr[Double] = js.undefined
  
  /** Metric integer value. */
  var integerValue: js.UndefOr[String] = js.undefined
  
  /**
    * Amount in micros. One million is equivalent to one unit. Currency value is in the unit (USD, EUR or other) specified by the request. For example, $6.50 whould be represented as
    * 6500000 micros.
    */
  var microsValue: js.UndefOr[String] = js.undefined
}
object ReportRowMetricValue {
  
  @scala.inline
  def apply(): ReportRowMetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRowMetricValue]
  }
  
  @scala.inline
  implicit class ReportRowMetricValueMutableBuilder[Self <: ReportRowMetricValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: String): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    @scala.inline
    def setMicrosValue(value: String): Self = StObject.set(x, "microsValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrosValueUndefined: Self = StObject.set(x, "microsValue", js.undefined)
  }
}
