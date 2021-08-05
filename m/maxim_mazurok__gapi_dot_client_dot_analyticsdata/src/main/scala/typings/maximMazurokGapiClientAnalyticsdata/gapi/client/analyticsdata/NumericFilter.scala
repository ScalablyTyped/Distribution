package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericFilter extends StObject {
  
  /** The operation type for this filter. */
  var operation: js.UndefOr[String] = js.undefined
  
  /** A numeric value or a date value. */
  var value: js.UndefOr[NumericValue] = js.undefined
}
object NumericFilter {
  
  inline def apply(): NumericFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericFilter]
  }
  
  extension [Self <: NumericFilter](x: Self) {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setValue(value: NumericValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
