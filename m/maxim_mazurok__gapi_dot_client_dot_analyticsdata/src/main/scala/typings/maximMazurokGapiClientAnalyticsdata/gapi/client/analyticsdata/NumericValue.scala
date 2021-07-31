package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericValue extends StObject {
  
  /** Double value */
  var doubleValue: js.UndefOr[Double] = js.undefined
  
  /** Integer value */
  var int64Value: js.UndefOr[String] = js.undefined
}
object NumericValue {
  
  @scala.inline
  def apply(): NumericValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericValue]
  }
  
  @scala.inline
  implicit class NumericValueMutableBuilder[Self <: NumericValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    @scala.inline
    def setInt64Value(value: String): Self = StObject.set(x, "int64Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt64ValueUndefined: Self = StObject.set(x, "int64Value", js.undefined)
  }
}
