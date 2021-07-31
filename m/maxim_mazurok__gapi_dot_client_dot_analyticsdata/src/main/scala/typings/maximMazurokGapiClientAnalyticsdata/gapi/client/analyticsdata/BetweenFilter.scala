package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BetweenFilter extends StObject {
  
  /** Begins with this number. */
  var fromValue: js.UndefOr[NumericValue] = js.undefined
  
  /** Ends with this number. */
  var toValue: js.UndefOr[NumericValue] = js.undefined
}
object BetweenFilter {
  
  @scala.inline
  def apply(): BetweenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BetweenFilter]
  }
  
  @scala.inline
  implicit class BetweenFilterMutableBuilder[Self <: BetweenFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromValue(value: NumericValue): Self = StObject.set(x, "fromValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromValueUndefined: Self = StObject.set(x, "fromValue", js.undefined)
    
    @scala.inline
    def setToValue(value: NumericValue): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
  }
}
