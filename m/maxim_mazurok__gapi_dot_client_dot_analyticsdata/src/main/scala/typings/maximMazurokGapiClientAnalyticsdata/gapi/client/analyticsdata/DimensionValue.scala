package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionValue extends StObject {
  
  /** Value as a string if the dimension type is a string. */
  var value: js.UndefOr[String] = js.undefined
}
object DimensionValue {
  
  @scala.inline
  def apply(): DimensionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionValue]
  }
  
  @scala.inline
  implicit class DimensionValueMutableBuilder[Self <: DimensionValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
