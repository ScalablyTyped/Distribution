package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericFilter extends StObject {
  
  /** The operation type for this filter. */
  var operation: js.UndefOr[String] = js.native
  
  /** A numeric value or a date value. */
  var value: js.UndefOr[NumericValue] = js.native
}
object NumericFilter {
  
  @scala.inline
  def apply(): NumericFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericFilter]
  }
  
  @scala.inline
  implicit class NumericFilterMutableBuilder[Self <: NumericFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setValue(value: NumericValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
