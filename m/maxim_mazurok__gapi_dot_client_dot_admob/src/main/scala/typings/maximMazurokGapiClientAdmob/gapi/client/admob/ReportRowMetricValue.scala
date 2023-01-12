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
  
  inline def apply(): ReportRowMetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRowMetricValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportRowMetricValue] (val x: Self) extends AnyVal {
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setIntegerValue(value: String): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    inline def setMicrosValue(value: String): Self = StObject.set(x, "microsValue", value.asInstanceOf[js.Any])
    
    inline def setMicrosValueUndefined: Self = StObject.set(x, "microsValue", js.undefined)
  }
}
